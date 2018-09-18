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
		String BookId=request.getParameter("BookId");
		String CustomerId=(String)session.getAttribute("CustomerId");
		String CustomerName=(String)session.getAttribute("CustomerName");
		String CustomerAddr=(String)session.getAttribute("CustomerAddr");
		
		Double BookPrice=Double.parseDouble(request.getParameter("BookPrice"));
		int mount=Integer.parseInt(request.getParameter("Ordermount"));

		String Orderdate;
		java.util.Date date = new java.util.Date();
		SimpleDateFormat ft=
		new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Orderdate=ft.format(date);

		String sql;

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://catheart.net:3306/CAT","cat","cat");

		sql="insert into tb_order(CustomerId,Orderdate,Ordermount,BookId,recevername,receveraddr,totalprice) values(?,?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1,CustomerId);
		ps.setString(2,Orderdate); 
		ps.setInt(3,mount);
		ps.setString(4,BookId);
		ps.setString(5,CustomerName);
		ps.setString(6,CustomerAddr);
		ps.setDouble(7,BookPrice*mount);

		ps.executeUpdate();
		ps.close();

		conn.close();
		%>
	</body>
</html>
