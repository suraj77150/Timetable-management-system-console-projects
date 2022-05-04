package TimeTable;

import java.util.Scanner;

public class Admin {
		Admin(){
		// Timetable management System #
			
		//Creating TimeTable for Students	
		System.out.println("  ");
		System.out.println("Choose below option");
		connection c= new connection();
	
		
		
		

		Scanner sc = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("1.batch1    ,2.batch2       3.Students     4.deleteTeacher      5.getStudent           6.getTeacher");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println(
					"---------------------------------Welcome to batch1-------------------------------------");
			System.out.println("1.View_TimeTable        2.Make_Changes       3.Create_TimeTable");
				int batch1 = sc.nextInt();
				switch(batch1) {
				case 1:
					System.out.println("Batch1 TimeTable");
					c.retrieveTimetable();
				
					break;
				case 2:
					System.out.println(" Make changes in Batch1 TimeTable");
					c.update_batch1_timetable("monday","o.s","S.E","c++");
					break;
				case 3:
					System.out.println("Batch1 Create  TimeTable");
					c.createTimeTable_for_batch1();
					break;
				default:
					System.out.println("Please Enter Valid Option");

				}
		
			
			break;
		case 2:
					System.out.println("----------------------------------Welcome to batch2----------------------------------------");
			System.out.println("1.View_TimeTable        2.Make_Changes       3.Create_TimeTable");
				int batch2 = sc.nextInt();
				switch(batch2) {
				case 1:
					System.out.println("Batch2 TimeTable");
					c.retrieveTimetable();
				
					break;
				case 2:
					System.out.println(" Make changes in Batch TimeTable");
					c.update_batch1_timetable("monday","o.s","java","c++");
					break;
				case 3:
					System.out.println("Batch2 Create  TimeTable");
					c.createTimeTable_for_batch1();
					break;
				default:
					System.out.println("Please Enter Valid Option");

				}
		
			
			break;
			
		case 3:
			System.out.println(
					
					"----------------------------------Welcome to Studentlist----------------------------------------");
			System.out.println("1.view students list      2.update student list          3. create student list");
			
			int student = sc.nextInt();
			switch(student) {
			case 1:
				System.out.println("view student list");
				c.retrievestudents();
			
				break;
				
			case 2:
				System.out.println(" update student list");
				c.updatestudent("S100","dhanush","batch2");
				break;
			case 3:
				System.out.println("create student list");
				c.createStudents();
				break;
			default:
				System.out.println("Please Enter Valid Option");

			}
	
		
		break;
			
			
			
		case 4:
			System.out.println(
					"----------------------------------Welcome to teacher admin----------------------------------------");
System.out.println("1.view teacher list      2.update taeacher list          3. create teacher list     4.create teacher timetable list       5 . view teacher timetable list  ");
			
			int teacher= sc.nextInt();
			switch(teacher) {
			case 1:
				System.out.println("view teacher list");
				c.retrieveteacher();
			
				break;
				
			case 2:
				System.out.println(" update teacher list");
				
				break;
			case 3:
				System.out.println("create teachers list");
				c.createteacher();
				break;
			case 4:
				System.out.println("create teachers timetable list");
				c.createTimeTable_for_teacher();
				break;
				
			case 5:
				System.out.println("view teachers timetable list");
				c.retrieveteacherTimetable();
				break;
				
			default:
				System.out.println("Please Enter Valid Option");

			}
	
		
			break;
			
	
		default:
			System.out.println("Please Enter Valid Option");

		}

		sc.close();
	}
}
