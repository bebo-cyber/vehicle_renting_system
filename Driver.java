package com.project.person;
import com.project.person.*;

public class Driver extends Person implements IDisplay{
	int driving_license_number;
	boolean is_driving_history_cleared;
	float salary;
	//Getter functions for Person class
	public int getDriving_license_number(){
		return this.driving_license_number;
	}
	public boolean getIs_driving_history_cleared(){
		return this.is_driving_history_cleared;
	}
	 public float getSalary(){
		 return this.salary;
	 }
	 public int getAge(){
		 return this.age;
	 }
	 public int getMobileNumber(){
		 return this.mobileNumber;
	 }
	 public String getfirstName(){
		 return this.firstName;
	 }
	 public String getlastName(){
		 return this.lastName;
	 }
	 public String getemail_id(){
		 return this.email_id;
	 }
	 public String getusername(){
		 return this.username;
	 }
	 public String getpassword(){
		 return this.password;
	 }

    //Setter functions for Person class
	public void setDriving_license_number(){
		this.driving_license_number=driving_license_number;
	}
	public void setIs_driving_history_cleared(){
		this.is_driving_history_cleared=is_driving_history_cleared;
	}
	 public void setSalary(){
		 this.salary=salary;
	 }
	 public void setID(int Id){
		 this.Id=Id;
	 }
	 public void setAge(int age){
		 this.age=age;
	 }
	 public void setMobileNumber(int mobileNumber){
		 this.mobileNumber=mobileNumber;
	 }
	 public  void setfirstName(String firstName){
		 this.firstName=firstName;
	 }
	 public void setlastName(String lastName){
		 this.lastName=lastName;
	 }
	 public void setemail_id(String email_id){
		 this.email_id=email_id;
	 }
	 public void setusername(String username){
		 this.username=username;
	 }
	 public void setpassword(String password){
		 this.password=password;
	 }
	 @Override
    public void print()
    {

        System.out.println("Driver License Number : "+getDriving_license_number());
        System.out.println("Is Driver History Cleared : "+getIs_driving_history_cleared());
        System.out.println("Driver Salary: "+getSalary());
    }
}	 