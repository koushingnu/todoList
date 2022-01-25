<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<% //TODO:2-③ ユーザ情報を取得するためにLoginUserBeanクラスを宣言する %>
<jsp:useBean id="user_db"  scope="session" class="todoList.LoginUserBean"/>

<%-- Java入門 ヘッダー画面 --%>
<div align="right">
	<%-- ログイン済みの場合はIDを表示 --%>
	ようこそ「<jsp:getProperty property="name" name="user_db"/>」さん！
	<% //TODO:2-④ パラメータ名「submit」で履歴およびログアウトを判定する %>
	<a href="/schoo/LoginServletShopping?submit=履歴">購入履歴</a>
	<a href="/schoo/LoginServletShopping?submit=ログアウト">ログアウト</a>
</div>