<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<body>
	<form:form action="processForm" modelAttribute="student">
First Name: <form:input path="firstName" />
		<br>
		<br>
Last Name: <form:input path="lastName" />
		<br>
		<br>
Select Country: <form:select path="country">

			<form:options items="${student.countryOptions}" />

			<%-- <form:option value="India" label="India" />
			<form:option value="South Africa" label="South Africa" />
			<form:option value="France" label="France" />
			<form:option value="Germany" label="Germany" />
			<form:option value="Australia" label="Australia" /> --%>
			<br>
			<br>
		</form:select>
		<br>
		<br>
Select Language:
Java <form:radiobutton path="favouriteLanguage" value="Java" />
C++ <form:radiobutton path="favouriteLanguage" value="C++" />
Python <form:radiobutton path="favouriteLanguage" value="Python" />
JavaScript <form:radiobutton path="favouriteLanguage" value="JavaScript" />
		<br>
		<br>
Select Operating Systems:
Windows <form:checkbox path="operatingSystems" value="Windows" />
Linux <form:checkbox path="operatingSystems" value="Linux" />
Mac <form:checkbox path="operatingSystems" value="Mac" />
		<br>
		<br>
		<input type="submit" value="Submit" />
		<br>
		<br>
	</form:form>
</body>
</html>