package bus;

import java.util.*;

public class BusDB extends SeatDB {
	private ArrayList<String> Ticket  = new ArrayList<String>();
	private ArrayList<String> journeyCode  = new ArrayList<String>();
	private String busNo = null;
	private String from = null;
	private String to = null;
	public BusDB() {
		// TODO Auto-generated constructor stub
	}
	public boolean setTicket(String ticket) {
		Ticket.add(ticket);
		return false;
	}
	public boolean setFrom (String from) {
		this.from = from;
		return true;
	}public boolean setTo (String to) {
		this.to = to;
		return true;
	}public String getBusNo() {
		return this.busNo;
	}public String getFrom() {
		return this.from;
	}public String getTo() {
		return this.to;
	}
	public boolean setJourneyCode(String date,String deptTime,String arrivalTime) {
		journeyCode.add(date+"-"+deptTime+"-"+arrivalTime);
		return false;
	}
	public String getJourneyCode() {
		return journeyCode.get(journeyCode.size()-1);
	}
	public boolean chkJourneyCode() {
		return false;
		
	}
}
