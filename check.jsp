<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<html>
    <body bgcolor = "pink">
		<%!
			Dbfunction d = new Dbfunction();
			d.connect("root","");
		%>
		<%
			String eventname = request.getParameter("event_name");
			String eventdate = request.getParameter("event_date");
			String oemail = request.getParameter("oeganizer_email");
			String ophone = request.getParameter("organizer_phone");
			String ediscription = request.getParameter("event_description");
			String etype = request.getParameter("event_type");
			String eloc = request.getParameter("event_location");
			String estatus = request.getParameter("event_status");
			int seats = request.getParameter("max_seats");
		%>
		<%
			message = ""
			int a = d.insertevent(eventname, eventdate, oemail, ophone, ediscription, etype, eloc, estatus, seats);
			if(a==1)
				message="inserted";
			else
				messsage="error occured";
		%>
		<%=message%>
		
	</body>
</html>