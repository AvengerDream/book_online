<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,java.io.*,java.util.*,javax.servlet.*"%>
<!DOCTYPE html>
<html>
	<body>
		<%
		//	String username=request.getParameter("username");
		//	String pwd=request.getParameter("pwd");	
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String BookId=request.getParameter("BookId");
		String CustomerId=request.getParameter("CustomerId");	
		if(CustomerId==null)
			{
			session.invalidate();
			response.sendRedirect("BookDetail.jsp?BookId="+BookId);
			}
		else
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://catheart.net:3306/CAT","cat","cat");
			Statement stmt = conn.createStatement();
			String sql = "select * from tb_customerinfo where CustomerId="+CustomerId;
			ResultSet rs = stmt.executeQuery(sql);
			String CustomerName=null;
			String CustomerAddr=null;
			if(rs.next())
			{
				CustomerName=rs.getString("CustomerName");
				CustomerAddr=rs.getString("CustomerAddr");
			}
			session.setAttribute("CustomerId",CustomerId);
			session.setAttribute("CustomerName",CustomerName);			
			session.setAttribute("CustomerAddr",CustomerAddr);
			rs.close();		
			stmt.close();
			conn.close();	
		}

		//session.invalidate();//����session
		//response.sendRedirect("index.jsp");
		//String CustomerId=(String)session.getAttribute("CustomerId");
		%>
	</body>
</html>
