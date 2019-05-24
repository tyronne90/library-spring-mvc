<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Edit MainClassification</h1>  
       <form:form method="POST" action="/springmvc/SaveEditMainClassification"  modelAttribute="editmainclass">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="mainClassId" /></td>  
         </tr>   
         <tr>    
          <td>MainClassification Name : </td>   
          <td><form:input path="mainClassName"  /></td>  
         </tr>    
         
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form> 