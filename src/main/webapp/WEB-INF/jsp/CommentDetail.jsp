<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*,java.io.*,java.util.*,javax.servlet.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body style="background-color:#CCFFFF;">
	<%
		String BookId;
		String CustomerId;
		String Customername;
		String Commentdate;
		String Commentcontent;

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		BookId=request.getParameter("BookId");
		int p=Integer.parseInt(request.getParameter("p"));
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://catheart.net:3306/CAT","cat","cat");
		Statement stmt = conn.createStatement();
		
		String sql="select count(*) from tb_comment where BookId="+BookId;
		ResultSet rs = stmt.executeQuery(sql);
		int sum=0;
		if(rs.next())sum=rs.getInt(1);
		
		if(sum>0)
		{
		sql="select * from tb_comment where BookId="+BookId+" order by Commentdate desc limit "+8*(p-1)+",8";
		rs = stmt.executeQuery(sql);
	
		%>
		
		<p>
		<b style="font-size:24px;color:#0066FF;margin:20px;">图书评价（<%=sum%>）</b>
		<span style="float:right;margin:20px">
		<%if(p==1)
		{%><span style="color:#c0c0c0">上一页</span>
		<%}else{%>
		<a style="color:#0066FF;text-decoration:none" href="CommentDetail.jsp?p=<%=p-1%>&BookId=<%=BookId%>">上一页</a>
		<%}%>
		&nbsp;&nbsp;<span style="color:#0066FF;"><%=p%></span>&nbsp;&nbsp;
		<%if(p*8<sum)
		{%><a style="color:#0066FF;text-decoration:none" href="CommentDetail.jsp?p=<%=p+1%>&BookId=<%=BookId%>">下一页</a>
		<%}else{%>
		<span style="color:#c0c0c0">下一页</span>
		<%}%>
		</span>
		</p>
		<%
		while(rs.next())
		{
				Customername=rs.getString("Customername");
				Commentdate=rs.getString("Commentdate");
				Commentcontent=rs.getString("Commentcontent");
		%>
		<div style="background-color:#CCFFFF;margin:20px;">
				<p style="font-size:14px;color:#505050;"><%=Customername%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%=Commentdate%></p>
				<p style="word-wrap:break-word"><%=Commentcontent%></p>
		<br />
		<hr style="height:2px;border:none;border-top:2px solid #C0C0C0;" />
		</div>
		<%
		}
		}
		else out.print("这边书还没有评价，快去评价一下吧！");
		rs.close();	
		stmt.close();	
		conn.close();
		%>
</body>
</html>