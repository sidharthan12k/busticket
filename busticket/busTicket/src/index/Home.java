package index;

import java.util.Scanner;

public class Home {
	public static void main(String[] args) {
		//WelcomeScreen ws = new WelcomeScreen();
		Scanner sc = new Scanner(System.in);
		String[][] seatOrder = new String[3][5];
		while(true) {
		System.out.print("Enter the seat number to book\n");
		int seatNo = sc.nextInt();
		System.out.print("Enter M for male \n F for female\n");
		String gender = sc.next();
		int gen = gender.hashCode();
		System.out.print(gen);
		//System.out.println("you have entered"+gender);
		// int n = sc.nextInt();
		// System.out.print(" "+ n/10+" "+n%10);
		Home hm = new Home();
		String [][] updatedSeat = hm.bookSeat(seatOrder, seatNo, gender);
		hm.printSeat(updatedSeat);
		System.out.print("0 for Exit\n 1 for book another seat");
		int opt = sc.nextInt();
		if(opt == 0)
			break;
		else if(opt == 1)
			continue;
		}

	}

	public String[][] bookSeat(String[][] seatOrder, int seatNo, String gender) {
		//System.out.println("hello");
		try {
			seatOrder[(seatNo / 10) - 1][(seatNo % 10) - 1] = gender.contains("M")?"M":"F";
		} catch (Exception e) {
			System.out.println(e + "enter a wrong seat number");
		}
		return seatOrder;
	}

	public void printSeat(String[][] seatOrder) {
		char[] letters = { 'A', 'B', 'C', 'D', 'E' };
		for (int i = 0; i < seatOrder.length; i++) {
			for (int j = 0; j < seatOrder[0].length; j++) {
				if (seatOrder[i][j] != "M" && seatOrder[i][j] != "F") {
					System.out.printf("	%s%d -> E	", letters[i], j + 1);
				}
				if (seatOrder[i][j] == "M") {
					System.out.printf("	%s%d -> M	", letters[i], j + 1);
				}
				else if (seatOrder[i][j] == "F") {
					System.out.printf("	%s%d -> F	", letters[i], j + 1);
				}
			}
			System.out.println(" ");
		}
	}
}
