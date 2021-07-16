<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Blog</title>
	<link rel="stylesheet" href="../css/myblog.css">
</head>
<body>

    <div id="main_wrap">
        
        <%@ include file="include/header.jsp" %>

		<%@ include file="include/nav.jsp" %>
        
        <!-- contents 영역 시작 -->
        <div id="content_wrap">
            <section>
                <article class="border_bottom_a margin_bottom_20">
                    <h1 class="title">‘볼보보다 안전하다’던 테슬라 신형 모델S 플레이드, 주행 중 화재로 전소</h1>
                    <p class="date">2021-07-02</p>
                    <img class="post_img" src="../images/테슬라.jpg">
                    <p class="postcontent">1일(현지 시각) 미 경제방송 CNBC에 따르면, 지난달 29일 미국 펜실베이니아 주 교외에서 주행중이었던 2021년식 모델S 플레이드에 불이 붙었다. 운전자는 주행 중 차량 뒤쪽에서 연기가 나는 것을 발견하고 긴급 탈출했다. 그가 차에서 내린 직후 불길이 차를 뒤덮었다고 한다. 화재는 3시간 걸려 진화됐다.</p>
                </article>

                <article class="border_bottom_a margin_bottom_20">
                    <h1 class="title">‘볼보보다 안전하다’던 테슬라 신형 모델S 플레이드, 주행 중 화재로 전소</h1>
                    <p class="date">2021-07-02</p>
                    <img class="post_img" src="../images/테슬라.jpg">
                    <p class="postcontent">1일(현지 시각) 미 경제방송 CNBC에 따르면, 지난달 29일 미국 펜실베이니아 주 교외에서 주행중이었던 2021년식 모델S 플레이드에 불이 붙었다. 운전자는 주행 중 차량 뒤쪽에서 연기가 나는 것을 발견하고 긴급 탈출했다. 그가 차에서 내린 직후 불길이 차를 뒤덮었다고 한다. 화재는 3시간 걸려 진화됐다.</p>
                </article>
            </section>

			<%@ include file="include/aside.jsp" %>
        </div>
        <!-- contents 영역 끝 -->
		
		
		
		<%@ include file="include/footer.jsp" %>
    </div>
    
</body>
</html>