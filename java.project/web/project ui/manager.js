// 회원의 정보 : 아이디, 비밀번호, 이름
// Member -> 생성자 함수를 정의

function Member(id, pw, name){
    this.userId = id;
    this.pw = pw;
    this.userName = name;
}

// 객체가 가지는 메소드는 공통으로 사용 -> prototype
Member.prototype.makeHtml = function (){
    return '[id:'+this.userId+' , pw:'+this.pw+' , name: '+this.userName+']'
};

// 회원의 정보를 저장하는 메소드
var members = [];


$(document).ready(function(){

    //localStorage에 저장된 데이터가 있는지 확인
    localStorage.getItem('members') // 없으면 null 반환

    if(localStorage.getItem('members') == null){
        // 배열 members를 저장
        localStorage.setItem('members', JSON.stringify(members));
    } else {
        console.log(localStorage.getItem('members'));
        members = JSON.parse(localStorage.getItem('members')); //JSON 문자열 -> 객체로 변환
        console.log(members);

        setList();

    }

    $('#regForm').submit(function(){
        var userId = $('#userID').val();
        var pw = $('#pw').val();
        var repw = $('#repw').val();
        var userName = $('#userName').val();

        if(!isId(userId)){
            $('#userID+div.msg').html('ID는 숫자,영문자 4자이상 12자 미만으로 입력해주세요.');
            $('#userID+div.msg').css('display','block');
            return false;
        }      
        
        if(!isPw(pw)){
            $('#pw+div.msg').html('비밀번호 6~19자 / 영문,숫자,특수문자');
            $('#pw+div.msg').css('display','block');
            return false;
        }

        if(repw.trim().length<1){
            $('#repw+div.msg').html('필수항목입니다.');
            $('#repw+div.msg').css('display','block');
            return false;
        }

        if(pw.trim() != repw.trim()){
            $('#repw+div.msg').html('비밀번호와 비밀번호 확인이 일치하지 않습니다.');
            $('#repw+div.msg').css('display','block'); 
            return false;
        }

        if(!isName(userName)){
            $('#userName+div.msg').html('이름은 한글로 2글자 이상 입력해주세요.');
            $('#userName+div.msg').css('display','block');
            if(userName.trim() )
            return false;
        }
        
        members.push(new Member(userId, pw, userName));

        alert('등록되었습니다.');

        localStorage.setItem('members', JSON.stringify(members));
        console.log('회원 리스트', members);

        this.reset();

        setList();

        return false;
        
    });

    $('#userID').focus(function(){
        $('#userID+div.msg').css('display','none');
    });

    $('#pw').focus(function(){
        $('#pw+div.msg').css('display','none');
    });

    $('#repw').focus(function(){
        $('#repw+div.msg').css('display','none');
    });

    $('#userName').focus(function(){
        $('#userName+div.msg').css('display','none');
    });
});

// 배열에 있는 요소를 -> table tr 행을 만들어서 출력
function setList(){

    // table 의 tbody 캐스팅
    var list = $('#list').html();
    console.log(members);

    var tbody = '<tr>';
    tbody += '  <th>순번(index)</th>';
    tbody += '  <th>아이디</th>';
    tbody += '  <th>비밀번호</th>';
    tbody += '  <th>이름</th>';
    tbody += '  <th>관리</th>'
    tbody += '</tr>';

    if(members.length < 1){

        tbody += '<tr>';
        tbody += '<td colspan="5">데이터가 존재하지 않습니다.</td>'
        tbody += '</tr>';

    } else {

        for(var i=0; i<members.length; i++){

            tbody += '<tr>';
            tbody += '  <td>'+(i+1)+'</td>';
            tbody += '  <td>'+members[i].userId+'</td>';
            tbody += '  <td>'+members[i].pw+'</td>';
            tbody += '  <td>'+members[i].userName+'</td>';
            tbody += '  <td> <a href="javascript:editMember('+i+')"> 수정</a> | <a href="javascript:deleteMember('+i+')">삭제</a> </td>';
            tbody += '</tr>';
        }
    }

    $('#list').html(tbody);
}

function deleteMember(index) {

    // 배열의 index 요소를 삭제
    // splice(index, count) : index에서 시작해서 count 만큼의 요소를 삭제하고 남은 요소를 반환
    if(confirm('삭제하시겠습니까?')){
        members.splice(index, 1);
        alert('삭제되었습니다.');

        localStorage.setItem('members', JSON.stringify(members));
        //테이블 리스트를 갱신
        setList();
    }
}

// 배열의 요소 수정 함수
function editMember(index) {

    $('#editFormArea').css('display', 'block');
    // alert(index + '인덱스의 요소를 수정합니다.');

    // 전달받은 index값으로 members 배열의 객체 하나를 얻을 수 있다!
    console.log(index, members[index]);

    // editForm의 태그들의 value 값을 셋팅
    var editUserId = $('#editId');
    var editPw = $('#editPw');
    var editRepw = $('#editRepw');
    var editName = $('#editName');
    var editIndex = $('#index');

    //이전 데이터를 폼에 세팅
    editUserId.val(members[index].userId);
    editPw.val(members[index].pw);
    editRepw.val(members[index].pw);
    editName.val(members[index].userName);
    editIndex.val(index);

    console.log(editPw.val());

    $('#editForm').submit(function(){
        if(editPw.val() != editRepw.val()){
            alert('비밀번호와 비밀번호 확인이 일치하지 않습니다.');
            return false;  
        }

        if(!confirm('수정하시겠습니까')){
            return false;
        }
        console.log(editPw.val());
        members[editIndex.val()].pw = editPw.val();
        members[editIndex.val()].userName = editName.val();

        //저장
        localStorage.setItem('members', JSON.stringify(members));
        
        alert('수정되었습니다.');
        setList();

        editMemberClose();

        return false;
    });
}

function editMemberClose(){
    $('#editFormArea').css('display','none');
}

function isId(string){
    var regExp = /^[a-zA-Z0-9]{4,12}$/;
    return regExp.test(string);
}

function isPw(string){
    var regExp = /^(?=.*[a-zA-Z])((?=.*\d)|(?=.*\W)).{6,20}$/;
    return regExp.test(string);
}

function isName(string){
    var regExp = /^[가-힣]{2}$/;
    return regExp.test(string);
}
