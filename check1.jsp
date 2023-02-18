<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<html>
    <body bgcolor = "pink">
		<%!
			Dbfunction d = new Dbfunction();
			d.connect("root","");
		%>
		<%
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String phone = request.getParameter("phn");
			String date1 = request.getParameter("date");
			String eventid = request.getParameter("eventid");
		%>
		<%
			message = ""
			int a = d.insertparticipant(eventname, eventdate, oemail, ophone, ediscription, etype, eloc, estatus, seats);
			if(a==1)
				message="inserted";
			else
				messsage="error occured";
		%>
		<%=message%>
		
	</body>
</html>