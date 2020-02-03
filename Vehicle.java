
  
package com.project.person;

import java.util.HashMap;

enum FuelTypes
{
    Petrol,
    Diesel,
    Electric
}

public abstract class Vehicle implements IDisplay
{
    protected int vechicleId;
    protected String vehicleDetails;
    protected String manufacturerName;
    protected boolean vehicleIsSelfDrive;
    protected String vehicleDriverName;
    protected boolean vehicleIsInsured;
    protected String insuranceProviderName;
    protected int noOfSeats;
    protected FuelTypes fuelType;
    protected HashMap<String,Float> baseRatePerDay=new HashMap<String, Float>();
    protected HashMap<String,Float> ratePerKilometer=new HashMap<String, Float>();

    public Vehicle(int vechicleId, String vehicleDetails, String manufacturerName, String insuranceProviderName, int noOfSeats, FuelTypes fuelTypes)
    {
        this.vechicleId = vechicleId;
        this.vehicleDetails = vehicleDetails;
        this.manufacturerName = manufacturerName;
        this.insuranceProviderName = insuranceProviderName;
        this.noOfSeats = noOfSeats;
        this.fuelType = fuelType;
    }

    public int getVechicleId() {
        return vechicleId;
    }

    public void setVechicleId(int vechicleId) {
        this.vechicleId = vechicleId;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public boolean isVehicleIsSelfDrive() {
        return vehicleIsSelfDrive;
    }

    public void setVehicleIsSelfDrive(boolean vehicleIsSelfDrive) {
        this.vehicleIsSelfDrive = vehicleIsSelfDrive;
    }

    public String getVehicleDriverName() {
        return vehicleDriverName;
    }

    public void setVehicleDriverName(String vehicleDriverName) {
        this.vehicleDriverName = vehicleDriverName;
    }


    public boolean isVehicleIsInsured() {
        return vehicleIsInsured;
    }

    public void setVehicleIsInsured(boolean vehicleIsInsured) {
        this.vehicleIsInsured = vehicleIsInsured;
    }

    public String getInsuranceProviderName() {
        return insuranceProviderName;
    }

    public void setInsuranceProviderName(String insuranceProviderName) {
        this.insuranceProviderName = insuranceProviderName;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public FuelTypes getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelTypes fuelType) {
        this.fuelType = fuelType;
    }

    public HashMap<String, Float> getBaseRatePerDay() {
        return baseRatePerDay;
    }

    public void setBaseRatePerDay(HashMap<String, Float> baseRatePerDay) {
        this.baseRatePerDay = baseRatePerDay;
    }

    public HashMap<String, Float> getRatePerKilometer() {
        return ratePerKilometer;
    }
    public void setRatePerKilometer(HashMap<String, Float> ratePerKilometer) {
        this.ratePerKilometer = ratePerKilometer;
    }

}

/*
public class Car extends Vehicle{
	String carType;
	String carColor;
	
	public String getCarType(){
		return this.carType;
	}
	public String getCarColor(){
		return this.carColor;
	}
	//getter for Vehicle class
	public String getVehicle_identification_numer(){
		return this.vehicle_idenitification_number;
	}
	public String getVehicleDescription(){
		return this.vehicleDescription;
	}
	public String getmanufacturerName(){
		return this.manufacturerName;
	}
	public String getfeulType(){
		return this.fuelType;
	}
	public boolean getIsinsured(){
		return this.is_insured;
	}
	public boolean getIsSelfDrive(){
		return this.is_self_drive;
	}
	public int getno_of_seat(){
		return this.no_of_seat;
	}
	public int getbase_rate_per_day(){
		return this.base_rate_per_dayt;
	}
	public int getrate_per_km(){
		return this.rate_per_km;
	}
	//setter for vehicle
	public void setVehicle_identification_numer(int vehicle_idenitification_number){
		this.vehicle_idenitification_number=vehicle_idenitification_number;
	}
	public void setVehicleDescription(String vehicleDescription){
		this.vehicleDescription=vehicleDescription;
	}
	public void setmanufacturerName(String manufacturerName){
		this.manufacturerName=manufacturerName;
	}
	public void setfeulType(String fuelType){
		this.fuelType=fuelType;
	}
	public void setIsinsured(boolean is_insured){
		this.is_insured=is_insured;
	}
	public void setIsSelfDrive(boolean is_self_drive){
		this.is_self_drive=is_self_drive;
	}
	public void setno_of_seat(int no_of_seat){
		this.no_of_seat=no_of_seat;
	}
	public void setbase_rate_per_day(){
		this.base_rate_per_day=100;
	}
	public void setrate_per_km(){
		this.rate_per_km=5;
	}
	public void setCarType(String carType){
		this.carType=carType;
	}
	public void setCarColor(String carColor){
		this.carColor=carColor;
	}
	
}
public class MotorCycle extends Vehicle{
	int max_top_speed;
	float milage;
	//getter for Vehicle class
	public int getMax_top_speed(){
		return this.max_top_speed;
	}
	public float getMilage(){
		this.milage;
	}
	public String getVehicle_identification_numer(){
		return this.vehicle_idenitification_number;
	}
	public String getVehicleDescription(){
		return this.vehicleDescription;
	}
	public String getmanufacturerName(){
		return this.manufacturerName;
	}
	public String getfeulType(){
		return this.fuelType;
	}
	public boolean getIsinsured(){
		return this.is_insured;
	}
	public boolean getIsSelfDrive(){
		return this.is_self_drive;
	}
	public int getno_of_seat(){
		return this.no_of_seat;
	}
	public int getbase_rate_per_day(){
		return this.base_rate_per_dayt;
	}
	public int getrate_per_km(){
		return this.rate_per_km;
	}
	//setter for vehicle
	public void setVehicle_identification_numer(int vehicle_idenitification_number){
		this.vehicle_idenitification_number=vehicle_idenitification_number;
	}
	public void setVehicleDescription(String vehicleDescription){
		this.vehicleDescription=vehicleDescription;
	}
	public void setmanufacturerName(String manufacturerName){
		this.manufacturerName=manufacturerName;
	}
	public void setfeulType(String fuelType){
		this.fuelType=fuelType;
	}
	public void setIsinsured(boolean is_insured){
		this.is_insured=is_insured;
	}
	public void setIsSelfDrive(boolean is_self_drive){
		this.is_self_drive=is_self_drive;
	}
	public void setno_of_seat(int no_of_seat){
		this.no_of_seat=no_of_seat;
	}
	public void setbase_rate_per_day(){
		this.base_rate_per_day=50;
	}
	public void setrate_per_km(){
		this.rate_per_km=1;
	}
	public void setMax_top_speed(int max_top_speed){
		this.max_top_speed=max_top_speed;
	}
	public void setMilage(float milage){
		this.milage=milage;
	}
}
public class Bus extends Vehicle{
	String type_of_bus;
	boolean is_accessebility_service_available, is_wifi_available;
	
	//getter for Vehicle class
	public String getType_of_bus(){
		return this.type_of_bus;
	}
	public boolean get_is_wifi_available(){
		return this.is_wifi_available;
	}
	public boolean get_is_accessebility_service_available(){
		return this.is_accessebility_service_available;
	}
	
	public String getVehicle_identification_numer(){
		return this.vehicle_idenitification_number;
	}
	public String getVehicleDescription(){
		return this.vehicleDescription;
	}
	public String getmanufacturerName(){
		return this.manufacturerName;
	}
	public String getfeulType(){
		return this.fuelType;
	}
	public boolean getIsinsured(){
		return this.is_insured;
	}
	public boolean getIsSelfDrive(){
		return this.is_self_drive;
	}
	public int getno_of_seat(){
		return this.no_of_seat;
	}
	public int getbase_rate_per_day(){
		return this.base_rate_per_dayt;
	}
	public int getrate_per_km(){
		return this.rate_per_km;
	}
	//setter for vehicle
	public void setVehicle_identification_numer(int vehicle_idenitification_number){
		this.vehicle_idenitification_number=vehicle_idenitification_number;
	}
	public void setVehicleDescription(String vehicleDescription){
		this.vehicleDescription=vehicleDescription;
	}
	public void setmanufacturerName(String manufacturerName){
		this.manufacturerName=manufacturerName;
	}
	public void setfeulType(String fuelType){
		this.fuelType=fuelType;
	}
	public void setIsinsured(boolean is_insured){
		this.is_insured=is_insured;
	}
	public void setIsSelfDrive(boolean is_self_drive){
		this.is_self_drive=is_self_drive;
	}
	public void setno_of_seat(int no_of_seat){
		this.no_of_seat=no_of_seat;
	}
	public void setbase_rate_per_day(){
		this.base_rate_per_day=250;
	}
	public void setrate_per_km(int rate_per_km){
		this.rate_per_km=rate_per_km;
	}
	public void setType_of_bus(){
		this.type_of_bus=7;
	}
	public void set_is_wifi_available(){
		this.is_wifi_available=is_wifi_available;
	}
	public void set_is_accessebility_service_available(){
		this.is_accessebility_service_available=is_accessebility_service_available;
	}
	
}*/