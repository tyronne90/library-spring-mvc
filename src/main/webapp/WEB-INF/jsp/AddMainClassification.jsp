<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Add New MainClassification</h1>

<form:form method="post" action="save" modelAttribute="addmainclass">
	<table>
		<tr>
			<td>MainClassification Name :</td>
			<td><form:input path="mainClassName" /></td>
			<td><input type="submit" value="Save" /></td>
		</tr>
	</table>
</form:form>
<a href="ViewMainClassification">View MainClassification</a> 
<a href="/springmvc">Main Menu</a> 