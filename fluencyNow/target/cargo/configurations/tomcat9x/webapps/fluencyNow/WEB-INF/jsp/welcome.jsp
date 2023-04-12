<<<<<<< HEAD

<html>
<head>
=======
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<!-- let's add tag srping:url -->
<spring:url value="/resources/fluency.css" var="fluencyCSS" />
<spring:url value="/resources/fluency.js" var="fluencyJS" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<link href="${fluencyCSS}" rel="stylesheet" />
<script src="${fluencyJS}"></script>
<!-- Finish adding tags -->
>>>>>>> 04a5adf02395e56b62e6f1c58b5b22981d629692
<title>Welcome - Fluency Now</title>
<style type="text/css">
body {
    background-image: url('https://crunchify.com/bg.png');
}
</style>
</head>
<body>${message}
    <br>
<<<<<<< HEAD
    <br>
    <div
        style="font-family: verdana; 
        padding: 10px; 
        border-radius: 10px;
         font-size: 12px;
          text-align: center;">Project developer by <a href="https://fluencynow.com">Fluency Now</a>.
        Click <a href="https://fluencynow.com/about"
=======
    <div
        style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px;
         text-align: center;">
        <h2>Checkout this font color. Loaded from 'fluency.css' file under '/WebContent/resources/' folder</h2>
        <div id="fluencyMessage"></div>
        <br> Project developer by <a href="https://fluencynow.com">Fluency Now</a>.
        <br> <br>
        Click <a
            href="https://fluencynow.com/about"
>>>>>>> 04a5adf02395e56b62e6f1c58b5b22981d629692
            target="_blank">here</a> for about us and <a
            href="https://fluencynow.com/purchase"
            target='_blank'>here</a>
        for purchase our courses.<br>
    </div>
</body>
</html>