<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="../layout/header.jsp"%>
<!DOCTYPE html>
<html lang="en">

<div class="container">

    <form action="/action_page.php">
        <div class="form-group">
            <label for="username">Username:</label>
            <input type="text" class="form-control" placeholder="Enter Username" id="username">
        </div>

        <%--<div class="form-group">
            <label for="email">Email address:</label>
            <input type="email" class="form-control" placeholder="Enter Email" id="email">
        </div>--%>

        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" class="form-control" placeholder="Enter Password" id="password">
        </div>


        <div class="form-group form-check">
            <label class="form-check-label">
                <input class="form-check-input" type="checkbox"> Remember me

            </label>
        </div>
        <button type="submit" class="btn btn-primary">LOGIN</button>
    </form>
</div>
<br />


<%@ include file="../layout/footer.jsp"%>



