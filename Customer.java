package com.project.person;
import com.project.person.*;
import java.time.LocalDate;

/*public abstract class Person{
	public int Id, age, mobileNumber;
	public String firstName, lastName, email_id, username,gender, password, birthdate;


}*/
public class Customer extends Person implements IDisplay{
	String address, city;
	int vehicleRent, noOfKmDrived;
	String vehicleType;
	
	//Getter functions for Person class
	public String getVehicleType(){
		return this.vehicleType;
	}
	public String getAddress(){
		return this.address;
	}
	public String getCity(){
		return this.city;
	}
	public int getVehicleRent(){
		return this.vehicleRent;
	}
	 public int getID(){
		 return this.Id;
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
	public void setAddress(String address){
		this.address=address;
	}
	public void setCity(String city){
		this.city=city;;
	}
	public void setVehicleRent(int vehicleRent){
		this.vehicleRent=vehicleRent;
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
public void setVehicleType(String vehicleType){
		 this.vehicleType=vehicleType;
	 }
	 public void setNoOfKmDrived(int noOfKmDrived){
		 this.noOfKmDrived=noOfKmDrived;
	 }	
	 public int getNoOfKmDrived(){
		 return noOfKmDrived;
	 }
	 @Override
    public void print()
    {

        System.out.println("Customer Address: "+getAddress());
        System.out.println("Customer City: "+getCity());
        System.out.println("Vehicle Rent: "+getVehicleRent());
		        System.out.println("Vehicle Type: "+getVehicleType());
				
		        System.out.println("No of Km Drived: "+getNoOfKmDrived());
    }
	
}