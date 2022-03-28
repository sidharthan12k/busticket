package bus;

public class SeatDB {
	String[][] seatDetails;

	public String[][] SeatOrder(int row, int column) {
		return seatDetails = new String[row][column];
	}

	public boolean chkSeatAvail(String[][] seatDetail, int seatNo) {
		if ((seatDetail[(seatNo / 10) - 1][(seatNo % 10) - 1] != null)
				|| (seatDetail[(seatNo / 10) - 1][(seatNo % 10) - 1] != ""))
			return true;
		else
			return false;
	}

	public boolean chkGender(String[][] seatDetail, int seatNo) {
		if (seatDetail[(seatNo / 10) - 1][0] == "F" || seatDetail[(seatNo / 10) - 1][1] == "F") {
			System.out.println("cannot occupy");
			return false;
		}
		return true;
	}

}
