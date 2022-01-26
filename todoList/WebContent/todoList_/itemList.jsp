<%@ page import="java.util.ArrayList"%>
<%@ page import="todoList.TodoBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<%-- Java入門 商品一覧画面 --%>
<!DOCTYPE html>
<html>
	<head>
		<title>Java入門</title>
		<link href="/todoList/todoList_/css/shopping.css" rel="stylesheet" type="text/css" />
	</head>
	<body>
		<% //TODO:2-① jsp:includeでヘッダー画面を読み込む%>
		<jsp:include page="header.jsp"/>

		<h1>作業一覧</h1>
		<%-- リクエストスコープからBeanクラスの配列を取得（eclipseの警告が出ても今回は大丈夫です） --%>
		<% ArrayList<TodoBean> itemList = (ArrayList<TodoBean>)request.getAttribute("itemList"); %>
		<form action="/TodoServlet">
			<table class="table_list">
				<tbody>
					<tr>
						<th>仕事名</th>
						<th> ユーザー名</th>
						<th>締め切り</th>
						<th>完了日時</th>
						<th>操作</th>


					</tr>
					<input class="common_button"  type="submit" name="submit" value="作業登録 "/>
					<div class="search">
						<span>検索キーワード</span>
						<input type="text" name="search" value=""/>
						<input class="search_button" type="button" onclick="location.href='./todoList_/login.jsp'" value="検索">
					</div>
					<%-- Beanの要素数分（商品の種類分）テーブルを作成 --%>
					<% for(TodoBean bean : itemList) { %>
					<tr>
						<%-- 商品ID --%>
						<%-- <td><%= bean.getWorkId() %></td> --%>
						<%-- 商品名 --%>
						<td><%= bean.getWorkName() %></td>
						<%-- 価格 --%>
						<%-- <td class="int"><%= bean.getId() %></td> --%>
						<%-- 数量（在庫） --%>
						<td><%= bean.getName() %></td>
						<%-- 価格 --%>
						<td><%= bean.getDeadline() %></td>
						<%-- 数量（在庫） --%>
						<td><%= bean.getCompletion() %></td>
						<td><input class="button" type="button" onclick="location.href='./todoList_/login.jsp'" value="完了">
						<input class="button" type="button" onclick="location.href='./todoList_/login.jsp'" value="更新">
						<input class="button" type="button" onclick="location.href='./todoList_/login.jsp'" value="削除">
						</td>


						<%-- <% //TODO:2-② 在庫が0の場合はリストボックスと購入ボタンを表示しない処理を入れる%>
						<% if(bean.getQuantity() != 0) { %>
						<td>
							<select class="list" name="<%=bean.getItemId() %>list">
								<% for(int i = 0; i <= bean.getQuantity(); i++) { %>
									<option value="<%=i %>"><%=i %></option>
								<% } %>
							</select>
						</td>
						<td>
							<input class="common_button" type="submit" value="購入" name="<%=bean.getItemId() %>"/>
						</td>
						<% } else { %>
						<td></td>
						<td class="button" >売り切れ！</td>
						<% } %> --%>
					</tr>
				<% } %>
				</tbody>
			</table>
			<input class="common_button" type="button" onclick="location.href='./todoList_/login.jsp'" value="戻る">
		</form>
	</body>
</html>