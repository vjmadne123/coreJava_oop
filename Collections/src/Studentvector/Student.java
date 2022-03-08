package Studentvector;

import java.util.Vector;

/**
 * @author DELL
 *
 */
public class Student {
	String Name;
	int Rollno;
	long Mobilno;
	String Email;
	public Student(String Name,int Rollno, long Mobilno, String Email) {
		super();
		this.Name=Name;
		this.Rollno=Rollno;
		this.Mobilno=Mobilno;
		this.Email=Email;
	}
		public String  getName()  {
			return Name;
		}
		public void setName(String Name) {
			this.Name=Name;
			}
		public int getRollno() {
			return Rollno;
			}
		public void setRollno(int Rollno) {
			this.Rollno=Rollno;
		}
		public long getMobilno() {
			return Mobilno;
		}

		public void setMobilno(long Moblino) {
			this.Mobilno=Mobilno;
		}
		
		public String getEmail() {
			return Email;
		}
	public void setEmail(String email) {
			Email = email;
		}
		

	}


