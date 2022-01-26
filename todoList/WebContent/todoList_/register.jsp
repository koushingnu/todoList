<%@ page import="java.util.ArrayList"%>
<%@ page import="todoList.TodoBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<jsp:useBean id="user_db" scope="session" class="todoList.LoginUserBean" />

<%-- 登録画面 --%>
<!DOCTYPE html>
<html>
	<head>
		<title>Java入門</title>
		<link href="/todoList/todoList_/css/shopping.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		<div class="login_pane">
			<h1>作業登録</h1>
			<% ArrayList<TodoBean> itemList = (ArrayList<TodoBean>)request.getAttribute("itemList"); %>
			<form action="../LoginServletShopping" method="post">

				<table class="table_form">

					<tbody>
						<% for(TodoBean bean : itemList) { %>
						<tr>
							<th>項目名</th>
							<td><input type="submit" name="name"/></td>
						</tr>
						<tr>
							<th>担当者</th>
							<td>
								<select class="list" name="<%=bean.getWorkId() %>list">
									<% for(TodoBean bean : itemList) { %>
										<option value="<%=bean.getName() %>"><%=bean.getName() %></option>
									<% } %>
								</select>
							</td>
						</tr>
						<tr>
							<th>期限</th>
							<td><input type="password" name="deadline"/></td>
						</tr>
						<% } %>
					</tbody>
				</table>
				<div class="register_buttons">
					<input class="common_button" type="submit" name="submit"  value="登録"/>
					<input class="common_button" type="submit" name="submit" value="キャンセル"/>
				</div>
			</form>
		</div>
	</body>
</html>