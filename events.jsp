<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<html>
    <body bgcolor = "pink">
	<h1 align = "center"><font color = "red">The student details are: </font></h1><br>
		<%!
			Dbfunction d = new Dbfunction();
			d.connect("root","");
		%>
			<table align ="center" border = "1px solid black" cellspacing = "2px" cellpadding="5px">
			<tr>
				<td><b>Event_id</b></td>
				<td><b>Event_name</b></td>
				<td><b>Event_date</b></td>
				<td><b>Organizer_email</b></td>
				<td><b>Organizer_phone</b></td>
				<td><b>event_description</b></td>
				<td><b>event_type</b></td>
				<td><b>event_location</b></td>
				<td><b>event_status</b></td>
				<td><b>max_seats</b></td>
			</tr>
		<%
			ps1 = con.prepareStatement("select * from events where event_id=?");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
		     out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td></tr>");
			}
		%>
					</table>
		<%
			out.println("<h4 align = 'center'>Click here to.! -> <a href='http://localhost:8080/kaushik/index.html'>Go back</a></h4>");
		%>
		<%!
			public void jspDestroy()
			{
				try
				{
					ps.close();
					con.close();
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		%>
	</body>
</html>
