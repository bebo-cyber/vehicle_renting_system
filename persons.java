package com.project.person;

public abstract class Person{
	public int Id, age, mobileNumber;
	public String firstName, lastName, email_id, username,gender, password, birthdate;


}

public class Customer extends Person{
	String address, city;
	int vehicleRent;
	
	//Getter functions for Person class
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
	public void setVehicleRent(){
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

	
}
public class Driver extends Person{
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
	
}
public class Owner extends Person{
	String companyTitle;
	int business_land_line_number;
	String website;
	String[] vehicle_list_owned=new String[20];
	//Getter functions for Person class
	public int getBusiness_land_line_number(){
		return this.business_land_line_number;
	}
	public String getCompanyTitle(){
		return this.companyTitle;
	}
	public String getWebsite(){
		return this.website;
	}
    public String[] getVehicleList(){
		return this.vehicle_list_owned;
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
	public void setBusiness_land_line_number(int business_land_line_number){
		this.business_land_line_number=business_land_line_number;
	}
	public void setCompanyTitle(String companyTitle){
		this.companyTitle=companyTitle;
	}
	public void setWebsite(String website){
		this.website=website;
	}
    public void setVehicleList(String[] vehicle_list_owned){
		for(int i=0;i<vehicle_list_owned.length;i++)
		this.vehicle_list_owned[i]=vehicle_list_owned[i];
	//return this.vehicle_list_owned;
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
}