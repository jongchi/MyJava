$(document).ready(function(){
	$('#signUpForm').submit(function(){
		var userId = $('#userId').val();
		var pw = $('#pw').val();
		var repw = $('#repw').val();
		var userName = $('userName').val();
		
		if(!isId(userId)){
            alert('ID는 숫자,영문자 4자이상 20자 미만으로 입력해주세요.');
            return false;
        }   

		if(!isPw(pw)){
            alert('비밀번호 6~19자 / 영문,숫자,특수문자');
            return false;
        }         
		
		if(pw.trim() != repw.trim()){
            alert('비밀번호와 비밀번호 확인이 일치하지 않습니다.');
            return false;
        }

		if(!isName(uesrName)){
			alert('이름은 한글로 2글자 이상 입력해주세요.');
			return false;
		}         
	})
});


function isId(string){
    var regExp = /^[a-zA-Z0-9]{4,20}$/;
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