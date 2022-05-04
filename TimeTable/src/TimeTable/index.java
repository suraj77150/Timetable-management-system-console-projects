package TimeTable;

import java.util.Scanner;

public class index {
	public static void main(String args[]) {
		// Timetable management System #
		System.out.println("  ");
		System.out.println("________________________ WELCOME TO TIMETABLE MANAGEMENT SYSTEM_________________________");

		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("1.Student      ,2.Teacher        3.Admin");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println(
					"---------------------------------Welcome to Student TimeTable-------------------------------------");
			Student S = new Student();
			break;
		case 2:
			System.out.println(
					"----------------------------------Welcome to Teacher TimeTable----------------------------------------");
			Teacher T = new Teacher();
			break;
		case 3:
			System.out.println(
					"----------------------------------Welcome to Admin TimeTable----------------------------------------");
			Admin A = new Admin();
			break;
		default:
			System.out.println("Please Enter Valid Option");

		}

		sc.close();
	}
}
