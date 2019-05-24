
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>MainClassification List</h1>


<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="list" items="${list}">   
   <tr>  
   <td>${list.mainClassId}</td>  
   <td>${list.mainClassName}</td>   
   <td><a href="EditMainClassification/${list.mainClassId}">Edit</a></td>  
   <td><a href="DeleteMainClassification/${list.mainClassId}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/><br/>
<a href="AddMainClassification">Add MainClassification</a> ||  
<a href="/springmvc">Main Menu</a> 
