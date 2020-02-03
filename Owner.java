package com.project.person;
import com.project.person.*;

public class Owner extends Person implements IDisplay{
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
	 @Override
    public void print()
    {

        System.out.println("Company Title: "+getCompanyTitle());
        System.out.println("Business Land Line Number: "+getBusiness_land_line_number());
        System.out.println("Owner Website: "+getWebsite());
		System.out.println("Vehicle List owned: "+getVehicleList());
		
    }
}