<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>AngularJS $http Example</title>
</head>
<body ng-app="myApp">

<div>
    <!-- Default panel contents -->
    <div><span>List of Employee </span></div>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>ID.</th>
            <th>Name</th>
        </tr>
        </thead>
        <tbody>
        <tr ng-repeat="u in ctrl.users">
            <td><span ng-bind="u.id"></span></td>
            <td><span ng-bind="u.name"></span></td>
        </tr>
        </tbody>
    </table>

</div>
</div>


</body>
</html>