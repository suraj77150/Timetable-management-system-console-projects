package TimeTable;

import java.util.Scanner;

public class Teacher {
	

	 Teacher() {
		// TODO Auto-generated method stub
		System.out.println(" welcome Teacher");
		Scanner sc = new Scanner(System.in);
		connection c = new connection();
	System.out.println("1.teacher1      2.teacher2");
		int option = sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Teacher1 TimeTable");
			c.retrieveteacherTimetable();
		
			
		case 2:
			System.out.println(" Teacher2 TimeTable");
			c.retrieveteacherTimetable();
	}
}

}
