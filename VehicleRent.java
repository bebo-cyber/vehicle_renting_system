package com.project.rent;
//import com.project.vehicle.*;
import com.project.person.*;
import java.util.*;
import java.io.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
//import com.project.display;


public class VehicleRent extends Customer implements IDisplay{
	private LocalDate rent_start_date, rent_end_date;
	private int rent_in_no_of_days, rent_no_of_km_drived;
	//Vehicle;
	int total_bill_to_pay;
	String vehicleType=Customer.getVehicleType();
	public void setRentStartDate(LocalDate rent_start_date){
		this.rent_start_date=rent_start_date;
	}
	public void setRentEndDate(LocalDate rent_end_date){
		this.rent_end_date=rent_end_date;
	}
	public void setRentInNoOfDays(){
		LocalDateTime tempDateTime = LocalDateTime.from( rent_start_date );
		long days = tempDateTime.until( rent_end_date, ChronoUnit.DAYS );
		tempDateTime = tempDateTime.plusDays( days );
		//String vehicleType=Customer.getVehicleType();
		rent_in_no_of_days=0;
			if (vehicleType.equals("Car"))
			rent_in_no_of_days=(int)days*100;
			if (vehicleType.equals("Bus"))
			rent_in_no_of_days=(int)days*250;
			if (vehicleType.equals("MotorCycle"))
			rent_in_no_of_days=(int)days*50;
		
	}
	public void setRentInNoOfKmDrived(){
		int noOfKm=Customer.getNoOfKmDrived();
		if (vehicleType.equals("Car"))
	    rent_no_of_km_drived=days*5;
        if (vehicleType.equals("Bus"))
	    rent_no_of_km_drived=days*7;
        if (vehicleType.equals("MotorCycle"))
	   rent_no_of_km_drived=days*1;
	 }
	public void setTotalBillToPay(){
		total_bill_to_pay=rent_in_no_of_days+rent_no_of_km_drived;
		Customer.setVehicleRent(total_bill_to_pay);
	}
	 public LocalDate getRentStartDate(){
	 return rent_start_date;
	 }
	 public LocalDate getRentEndDate(){
	 return rent_end_date;
	 }
	 public int getRentInNoOfDays(){
		 return rent_in_no_of_days;
	 }
	 public int getRentInNoKmDrived(){
		 return rent_no_of_km_drived;
	 }
	 public int getTotalBillToPay(){
		 return total_bill_to_pay;
	 }
	 @Override
    public void print()
    {

        System.out.println("Rent Start Date: "+getRentStartDate());
        System.out.println("Rent End Date: "+getRentEndDate());
        System.out.println("Rent in no of days: "+getRentInNoOfDays());
		System.out.println("Rent in no of Km: "+getRentInNoKmDrived());
		System.out.println("Total Bill to pay:"+ getTotalBillToPay());
		
    }
	/*public static void main(String[] args){
		Person[] customer=new Customer[5];
		Person[] driver=new Driver[5];
		Person[] owner=new Owner[5];
		/*Vehicle[] car=new Car[5];
		Vehicle[] motorCycle=new MotorCycle[5];
		Vehicle[] bus=new Bus[5];
		
	customer getter values called 
		 customer.setAddress("Bangalore");
	 customer.setCity("Bangalore");
	customer.setVehicleRent(0);
	  customer.setID(1234);
	  customer.setAge(23);
	  customer.setMobileNumber(9876543210);
	customser.setfirstName("Neha");
	  customer.setlastName("thakur");
	  customer.setemail_id("neha@gmail.com");
	  customer.setusername("neha123");
	  customer.setpassword("neha@123");
		
	}*/
}