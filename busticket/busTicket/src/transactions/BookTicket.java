package transactions;

import bus.BusDB;

public class BookTicket {
	bus.SeatDB seatDb = new bus.SeatDB();
	bus.BusDB busDb = new bus.BusDB();
	public boolean BookBusTicket(String uniqueId,String from, String to,String[][] seatOrder,int seatNo,String busNo,String journeyCode) {
		if(seatDb.chkSeatAvail(seatOrder, seatNo)) {
			if(seatDb.chkGender(seatOrder, seatNo)) {
				//if()
				busDb.setTicket((uniqueId+"-"+from+"-"+to+"-"+seatNo+"-"+busNo+"-"+journeyCode));
			}
		}
		return false;}
}
