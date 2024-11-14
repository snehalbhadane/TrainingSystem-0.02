<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Training App</title>
<link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap/5.3.3/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

</head>
<body>
 <div class="container">
  <div class="col-md-offset-2 col-md-7">
   <h2 class="text-center">Training App</h2>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Add Training</div>
    </div>
    <div class="panel-body">
     <form:form action="saveTraining" cssClass="form-horizontal"
      method="post" modelAttribute="training">

      <!-- need to associate this data with training id -->
      <form:hidden path="id" />

      <div class="form-group">
       <label for="trainingName" class="col-md-3 control-label">Training
        Name</label>
       <div class="col-md-9">
        <form:input path="trainingName" cssClass="form-control" />
       </div>
      </div>
      
      <div class="form-group">
       <label for="requestername" class="col-md-3 control-label">Last
        Name</label>
       <div class="col-md-9">
        <form:input path="requesterName" cssClass="form-control" />
       </div>
      </div>
      
      <div class="form-group">
      <label for="startDate" class="col-md-3 control-label">Start date:</label>
      <input type="date" id="start" name="training-start" value="2018-07-22" min="2018-01-01" max="2018-12-31" />
      <div class="col-md-9">
        <form:input path="startDate" cssClass="form-control" />
       </div>
      </div>
      
      <div class="form-group">
       <label for="description" class="col-md-3 control-label">Last
        Name</label>
       <div class="col-md-9">
        <form:input path="description" cssClass="form-control" />
       </div>
      </div>

      <div class="form-group">
      <label for="endDate" class="col-md-3 control-label">Start date:</label>
      <input type="date" id="start" name="training-start" value="2018-07-22" min="2018-01-01" max="2018-12-31" />
      <div class="col-md-9">
        <form:input path="endDate" cssClass="form-control" />
       </div>
      </div>
      
      <div class="form-group">
       <!-- Button -->
       <div class="col-md-offset-3 col-md-9">
        <form:button cssClass="btn btn-primary">Submit</form:button>
       </div>
      </div>

     </form:form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>