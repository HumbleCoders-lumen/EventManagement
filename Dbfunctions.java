package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Dbfunctions 
{
	Connection con;
	PreparedStatement ps,ps1,ps2;
	public void connect(String url, String username, String password)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eventmanagement", username, password);
			ps = con.prepareStatement("insert into events values (?,?,?,?,?,?,?,?,?,?)");
			ps1 = con.prepareStatement("select * from events where event_id=?");
			ps2 = con.prepareStatement("select * from participants where booking_id=?");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	public int insertevent(int event_id, String event_name,  
							String event_date, String organizer_email, 
							String organizer_phone, String event_description, 
							String event_type, String event_location, 
							String event_status, int max_seats) throws SQLException
	{
		ps.setInt(1, event_id);
		ps.setString(2, event_name);
		ps.setString(3,event_date);
		ps.setString(4, organizer_email);
		ps.setString(5, organizer_phone);
		ps.setString(6, event_description);
		ps.setString(7, event_type);
		ps.setString(8, event_location);
		ps.setString(9, event_status);
		ps.setInt(10, max_seats);
		int i = ps.executeUpdate();
		if(i>0)
			return 1;
		else
			return 0;	
	}
	
	public int insertparticipant(int booking_id, int event_id, String booked_date, String participant_name, String participant_email, String participant_phone) throws SQLException
	{
		ps.setInt(1, booking_id);
		ps.setInt(2, event_id);
		ps.setString(3,booked_date);
		ps.setString(4, participant_name);
		ps.setString(5, participant_email);
		ps.setString(6, participant_phone);
		int i = ps.executeUpdate();
		if(i>0)
			return 1;
		else
			return 0;
	
	}
	
	public ArrayList<Event> findevents(int event_id) throws SQLException
	{
		ArrayList<Event> r = new ArrayList<Event>();
		ps1.setInt(1, event_id);
		ResultSet rs = ps1.executeQuery();
		while(rs.next())
		{
			Event e = new Event();
			e.setEvent_id(rs.getInt(1));
			e.setEvent_name(rs.getString(2));
			e.setEvent_date(rs.getString(3));
			e.setOrganizer_email(rs.getString(4));
			e.setOrganizer_phone(rs.getString(5));
			e.setEvent_description(rs.getString(6));
			e.setEvent_type(rs.getString(7));
			e.setEvent_location(rs.getString(8));
			e.setEvent_status(rs.getString(9));
			e.setMax_seats(rs.getInt(10));
			r.add(e);
		}
		return r;
	}
	
	public ArrayList<participant> findparticipant(int booking_id) throws SQLException
	{
		ArrayList<participant> r = new ArrayList<participant>();
		ps2.setInt(1, booking_id);
		ResultSet rs = ps1.executeQuery();
		while(rs.next())
		{
			participant p = new participant();
			p.setBooking_id(rs.getInt(1));
			p.setEvent_id(rs.getInt(2));
			p.setBooked_date(rs.getString(3));
			p.setParticipant_name(rs.getString(4));
			p.setParticipant_email(rs.getString(5));
			p.setParticipant_phone(rs.getString(6));
			r.add(p);
		}
		return r;
	}
}
