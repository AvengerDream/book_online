<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
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
		Double BookPrice=Double.parseDouble(request.getParameter("BookPrice"));
		int mount,ordermount;
		mount=Integer.parseInt(request.getParameter("Ordermount"));;
		String sql;
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=
		DriverManager.getConnection("jdbc:mysql://catheart.net:3306/CAT","cat","cat");
		Statement stmt = conn.createStatement();
		sql="select * from tb_shopbook where BookId="+BookId+" and CustomerId="+CustomerId;
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next())
		{
		ordermount=rs.getInt("ordermount");
		ordermount+=mount;
		sql="update tb_shopbook set ordermount="+ordermount+" where BookId="+BookId+" and CustomerId="+CustomerId;
		stmt.executeUpdate(sql);
		}
		else {
		sql="insert into tb_shopbook(CustomerId,BookId,ordermount,price,ispay) values(?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);

		ps.setString(1,CustomerId);
		ps.setString(2,BookId); 
		ps.setInt(3,mount);
		ps.setDouble(4,BookPrice*mount);
		ps.setString(5,"YES");

		ps.executeUpdate();
		ps.close();
		}
		stmt.close();	
		conn.close();
		%>
	</body>
</html>
