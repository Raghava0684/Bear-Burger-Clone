<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<c:import url="/templates/AdminHeader.jsp"/>

<div class="manage-user-container">
    <form id="register-form" method="POST">
        <h2 class="admin-form-title">Manage Foods</h2>
        <div class="table-wrapper">
            <table id="foods-table">
                <tr>
                    <th>FoodID</th>
                    <th>Category</th>
                    <th>Title</th>
                    <th>Price</th>
                    <th>Action</th>
                </tr>
            </table>
        </div>
    </form>
</div>

<script src="${pageContext.request.contextPath}/assets/js/ManageFood.js"></script>
<c:import url="/templates/Footer.jsp"/>