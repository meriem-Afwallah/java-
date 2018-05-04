<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajouter une video</title>
</head>
<body>
	      <form action="" method="POST" id="video" >
            <div>
                <label for="video-title">titre</label>
                <input type="text" name="title" id="video-title" value="${ title }">
                <div> ${validationErrors['title'] }</div>
            </div>
            <div>   
                <label for="video-content">Url</label>
                <input type="text" name="url" id="video-content" value="${ url }">
         		<div> ${validationErrors['url'] }</div>
            </div>
            <div>
                <input type="submit" value="ajouter une video">
            </div>
            
        </form>
       

</body>
</html>