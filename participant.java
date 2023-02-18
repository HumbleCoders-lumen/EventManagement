package sample;

public class participant 
{
	private int booking_id;
	private int event_id;
	private String booked_date;
	private String participant_name;
	private String participant_email;
	private String participant_phone;
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getEvent_id() {
		return event_id;
	}
	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}
	public String getBooked_date() {
		return booked_date;
	}
	public void setBooked_date(String booked_date) {
		this.booked_date = booked_date;
	}
	public String getParticipant_name() {
		return participant_name;
	}
	public void setParticipant_name(String participant_name) {
		this.participant_name = participant_name;
	}
	public String getParticipant_email() {
		return participant_email;
	}
	public void setParticipant_email(String participant_email) {
		this.participant_email = participant_email;
	}
	public String getParticipant_phone() {
		return participant_phone;
	}
	public void setParticipant_phone(String participant_phone) {
		this.participant_phone = participant_phone;
	}

}
