<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*,java.util.*" %>
<%@ page import="javax.servlet.*,java.text.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
		request.setCharacterEncoding("UTF-8");
		String BookId = request.getParameter("BookId");
		String CustomerId=(String)session.getAttribute("CustomerId");
		String Customername = request.getParameter("Customername");
		String Commentcontent = request.getParameter("Commentcontent");
		String Commentdate;
		java.util.Date date = new java.util.Date();
		SimpleDateFormat ft=
		new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Commentdate=ft.format(date);

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=
		DriverManager.getConnection("jdbc:mysql://catheart.net:3306/CAT","cat","cat");
		String sql=
		"insert into tb_comment(BookId,CustomerId,Customername,Commentdate,Commentcontent) values(?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);

		
		ps.setString(1,BookId);
		ps.setString(2,CustomerId);
		ps.setString(3,Customername);
		ps.setString(4,Commentdate);
		ps.setString(5,Commentcontent);

		ps.executeUpdate();
		ps.close();
		conn.close();
		%>
		<jsp:forward page="CommentDetail.jsp?p=1&BookId=<%=BookId%>"/>
	</body>
</html>
