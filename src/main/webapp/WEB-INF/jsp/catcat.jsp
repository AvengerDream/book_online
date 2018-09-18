<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<h2 style="margin:20px;color:red;text-align:center">销量排行</h2>
<br />
	<body>
		<%
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://catheart.net:3306/CAT","cat","cat");
		Statement stmt = conn.createStatement();
		int p=Integer.parseInt(request.getParameter("p"));
		String sql = "select * from tb_bookinfo order by BookDealmount desc limit "+5*(p-1)+",5";
		ResultSet rs = stmt.executeQuery(sql);
		
		String BookId;
		String BookName;
		String BookPic;
		
		while(rs.next())
		{
				BookId=rs.getString("BookId");
				BookName=rs.getString("BookName");
				BookPic=rs.getString("BookPic");
		%>
		<div style="margin:5px;text-align:center">
			<a target="_parent" href="BookDetail.jsp?BookId=<%=BookId%>">
			<img src="<%=BookPic%>" width="150" height="150"/>
			</a><br /><a style="text-decoration:none" target="_parent" href="BookDetail.jsp?BookId=<%=BookId%>">
			<span style="color:black;font-size:13px;"><%=BookName%></span>
			</a><hr style="height:2px;border:none;border-top:2px solid #C0C0C0"/>
		</div>
		<%
		};
		rs.close();	
		stmt.close();	
		conn.close();
		%>
		<div style="margin:5px;text-align:center">
		<%
		if(p==1)
		{
			%>
			<span style="color:#c0c0c0">上一页</span>
			<%}
		else
		{
		%>
		<a style="color:#0066FF;text-decoration:none" href="catcat.jsp?p=<%=p-1%>">上一页</a>
		<%}%>
		&nbsp;&nbsp;<span style="color:#0066FF;"><%=p%></span>&nbsp;&nbsp;
		<a style="color:#0066FF;text-decoration:none" href="catcat.jsp?p=<%=p+1%>">下一页</a>
		</div>
	</body>
</html>
