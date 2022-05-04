package TimeTable;

import java.util.Scanner;

public class Student {
	

	 Student() {
		// TODO Auto-generated method stub
		System.out.println(" welcome Student");
		
		connection c = new connection();
	System.out.println("1.batch1       2.batch2");
	Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Batch1 TimeTable");
			c.retrieveTimetable();
		
			
		case 2:
			System.out.println(" Batch2 TimeTable");
			c.retrievestudents();
	}
}
}
