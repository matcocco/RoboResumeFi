package Resumepackage;
import java.util.ArrayList;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Person {
	private int personid;
	private String firstname;
	private String lastname;
	private String email;
	private String jobnum;
	private String edunum;
	private String skills;
	private ArrayList <Job> myjoblist;
    private	ArrayList <Education> myedulist;
	private ArrayList <Skills> myskillslist;
	
	public Person(String pfname, String plname, String pemail){
		this.firstname = pfname;
		this.lastname = plname;
		this.email = pemail;
		
		myjoblist = new ArrayList<Job>();
		myedulist = new  ArrayList<Education>();
		myskillslist = new ArrayList<Skills>();
		
	}
	public void addMe() {
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		String sql = "select * from persontable";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/persontable?");
			rs = stmt.executeQuery(sql);
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e){
			e.printStackTrace();
		}
		
	}
		
}
