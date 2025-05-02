<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드 폼</title>
</head>
<body>
    <form action="UploadPro" method="post" enctype="multipart/form-data">
        <input type="text" name="desc" placeholder="파일설명">
        <input type="file" name="imgfile">
        <input type="submit" value="업로드">
    </form>
</body>
</html>
