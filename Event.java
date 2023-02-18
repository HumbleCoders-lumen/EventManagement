package sample;

public class Event 
{
	private int Event_id;
	private String event_name;
	private String event_date;
	private String organizer_email;
	private String organizer_phone;
	private String event_description;
	private String event_type;
	private String event_location;
	private String event_status;
	private int max_seats;
	
	public int getEvent_id() {
		return Event_id;
	}
	public void setEvent_id(int event_id) {
		Event_id = event_id;
	}
	public String getEvent_name() {
		return event_name;
	}
	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}
	public String getEvent_date() {
		return event_date;
	}
	public void setEvent_date(String event_date) {
		this.event_date = event_date;
	}
	public String getOrganizer_email() {
		return organizer_email;
	}
	public void setOrganizer_email(String organizer_email) {
		this.organizer_email = organizer_email;
	}
	public String getOrganizer_phone() {
		return organizer_phone;
	}
	public void setOrganizer_phone(String organizer_phone) {
		this.organizer_phone = organizer_phone;
	}
	public String getEvent_description() {
		return event_description;
	}
	public void setEvent_description(String event_description) {
		this.event_description = event_description;
	}
	public String getEvent_type() {
		return event_type;
	}
	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}
	public String getEvent_location() {
		return event_location;
	}
	public void setEvent_location(String event_location) {
		this.event_location = event_location;
	}
	public String getEvent_status() {
		return event_status;
	}
	public void setEvent_status(String event_status) {
		this.event_status = event_status;
	}
	public int getMax_seats() {
		return max_seats;
	}
	public void setMax_seats(int max_seats) {
		this.max_seats = max_seats;
	}

}
