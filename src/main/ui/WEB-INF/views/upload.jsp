<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOC TYPE html>
<html>
<head>
    <title>Upload Music</title>
</head>
<body>
    <h2>Upload a Music File</h2>

    <!-- The action calls the POST /upload endpoint -->
    <form:form action="upload" method="post" modelAttribute="music">
        <label>Music Name:</label>
        <form:input path="music_name" /><br><br>

        <label>File Type:</label>
        <form:input path="music_file_type" /><br><br>

        <input type="submit" value="Upload">
    </form:form>
</body>
</html>
