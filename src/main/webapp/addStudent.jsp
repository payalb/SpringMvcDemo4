<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p style="color:red">${errorMsg}</p>
<form action="./addStudent.do" method="post">
Name: <input type="text" required="required" name="name"/><br/>
Age: <input type="number" required="required" name="age"/><br/>
DOB: <input type="date" required="required" name="dob"/><br/>
Gender:<br/> Male<input type="radio" name="gender" value="m"/>&nbsp;
Female<input type="radio"name="gender" value="f"/><br/>
Subjects:  Java:<input type="checkbox"  name="subjects" value="Java"/>
&nbsp; J2ee:<input type="checkbox" name="subjects" value="J2ee"/>
&nbsp; C++:<input type="checkbox" name="subjects" value="C++"/>
&nbsp; Spring:<input type="checkbox"  name="subjects" value="Spring"/>
<br/>
Hno: <input type="number" name="address.hno" required="required"/><br/>
City: <input type="text" name="address.city" required="required"/><br/>
Pincode: <input type="number" name="address.pincode" required="required"/><br/>
<input type="submit"/><br/>
</form>
</body>
</html>