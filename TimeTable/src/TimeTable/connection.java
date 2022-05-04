package TimeTable;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class connection {

		// TODO Auto-generated method stub
	private Connection con;
	private Statement st;
	public Connection getConnect() throws ClassNotFoundException,SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/TTMSystem","root","root");
		return con;
	}
	
	public boolean createTimeTable_for_batch1()
	
	{
		try {
			Scanner ip = new Scanner(System.in);
			con = getConnect();
			PreparedStatement pst = con.prepareStatement("insert into batch1 values(?,?,?,?)");
			for(int i = 1; i<=5;i++)
			{
				String  day = ip.next();
				String MN = ip.next();
				String AF = ip.next();
				String EN = ip.next();
				pst.setString(1,day);
				pst.setString(2, MN);
				pst.setString(3, AF);
				pst.setString(4, EN);
				pst.executeUpdate();
				System.out.println("deatail got added");
			}
			con.close();
			ip.close();
			return true;
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
		return false;
		}
	
	//Retriving timetable
	public void retrieveTimetable()
	{
		try
		{
			con = getConnect();
			st= con.createStatement();
			String qry = "select * from batch1";
			ResultSet rs = st.executeQuery(qry);
			while(rs.next()) {
				System.out.println("day:"+ rs.getString(1));
				System.out.println("MN:"+rs.getString(2));
				System.out.println("AF:"+rs.getString(3));
				System.out.println("EN :"+rs.getString(4));
				System.out.println();
				
			}
			con.close();
			
		}
		catch(Exception d)
		{
			System.out.println(d);
			
		}
	}
	
	//update timebles
	
	public void update_batch1_timetable(String day,String MN,String AN,String EN) {
		try {
			con = getConnect();
			st = con.createStatement();
			String qry = "update batch1 set MN ='"+MN+"',AN ='"+AN+"',EN ='"+EN+"' where day ='"+day+"';";
			st.executeUpdate(qry);
			System.out.println("Batch1 TimeTable got updated ");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	
	
	
	
	
	
	
	
	
	

	
	//Table for Students
public boolean createStudents()
	
	{
		try {
			Scanner ip = new Scanner(System.in);
			con = getConnect();
			PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?)");
			for(int i = 1; i<=10;i++)
			{
				String sid = ip.next();
				String sname = ip.next();
				String sbatch = ip.next();
				pst.setString(1,sid);
				pst.setString(2, sname);
				pst.setString(3, sbatch);

				pst.executeUpdate();
				System.out.println("deatail got added");
			}
			con.close();
			ip.close();
			return true;
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
		return false;
		}

//retrive Student 
public void retrievestudents()
{
	try
	{
		con = getConnect();
		st= con.createStatement();
		String qry = "select * from student";
		ResultSet rs = st.executeQuery(qry);
		while(rs.next()) {
			System.out.println("sid:"+ rs.getString(1));
			System.out.println("sname:"+rs.getString(2));
			System.out.println("sbatch:"+rs.getString(3));
			
			System.out.println();
			
		}
		con.close();
		
	}
	catch(Exception d)
	{
		System.out.println(d);
		
	}
}
//update student list
public void updatestudent(String sid,String Sname,String Sbatch) {
	try {
		con = getConnect();
		st = con.createStatement();
		String qry = "update student set sname = '"+Sname+"',sbatch = '"+Sbatch+"' where sid = '"+sid+"';";
		st.executeUpdate(qry);
		System.out.println(" student list got updated ");
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}




// teacher timetable list and  teacher list

public boolean createTimeTable_for_teacher()

{
	try {
		Scanner ip = new Scanner(System.in);
		con = getConnect();
		PreparedStatement pst = con.prepareStatement("insert into teacher_2_timetable values(?,?,?,?)");
		for(int i = 1; i<=5;i++)
		{
			String  day = ip.next();
			String MN = ip.next();
			String AF = ip.next();
			String EN = ip.next();
			pst.setString(1,day);
			pst.setString(2, MN);
			pst.setString(3, AF);
			pst.setString(4, EN);
			pst.executeUpdate();
			System.out.println("deatail got added");
		}
		con.close();
		ip.close();
		return true;
	}
catch(Exception e)
{
	System.out.println(e);
}
	return false;
	}



//retrive teacher time table

public void retrieveteacherTimetable()
{
	try
	{
		con = getConnect();
		st= con.createStatement();
		String qry = "select * from teacher_1_timetable";
		ResultSet rs = st.executeQuery(qry);
		while(rs.next()) {
			System.out.println("day:"+ rs.getString(1));
			System.out.println("MN:"+rs.getString(2));
			System.out.println("AF:"+rs.getString(3));
			System.out.println("EN :"+rs.getString(4));
			System.out.println();
			
		}
		con.close();
		
	}
	catch(Exception d)
	{
		System.out.println(d);
		
	}
}

//create teacher list
public boolean createteacher()
	
	{
		try {
			Scanner ip = new Scanner(System.in);
			con = getConnect();
			PreparedStatement pst = con.prepareStatement("insert into teacher values(?,?,?)");
			for(int i = 1; i<=10;i++)
			{
				String Tid = ip.next();
				String Tname = ip.next();
				String Tsubjects = ip.next();
				pst.setString(1,Tid);
				pst.setString(2, Tname);
				pst.setString(3, Tsubjects);

				pst.executeUpdate();
				System.out.println("deatail got added");
			}
			con.close();
			ip.close();
			return true;
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
		return false;
		}


//Retrive teacher
public void retrieveteacher()
{
	try
	{
		con = getConnect();
		st= con.createStatement();
		String qry = "select * from teacher";
		ResultSet rs = st.executeQuery(qry);
		while(rs.next()) {
			System.out.println("Tid:"+ rs.getString(1));
			System.out.println("Tname:"+rs.getString(2));
			System.out.println("Tsubjects:"+rs.getString(3));
			
			System.out.println();
			
		}
		con.close();
		
	}
	catch(Exception d)
	{
		System.out.println(d);
		
	}
}



}









