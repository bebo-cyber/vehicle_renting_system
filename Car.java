package com.project.person;

import java.util.ArrayList;

public class Car extends Vehicle implements IDisplay
{
    private ArrayList<String> carType=new ArrayList<String>();
    private ArrayList<String> carColor=new ArrayList<String>();

    public Car(int vechicleId, String vehicleDetails, String manufacturerName, String insuranceProviderName, int noOfSeats, FuelTypes fuelTypes)
    {
        super(vechicleId, vehicleDetails, manufacturerName, insuranceProviderName, noOfSeats, fuelTypes);
    }

    public ArrayList<String> getCarType()
    {
        return carType;
    }

    public void setCarType(ArrayList<String> carType)
    {
        this.carType = carType;
    }

    public ArrayList<String> getCarColor()
    {
        return carColor;
    }

    public void setCarColor(ArrayList<String> carColor)
    {
        this.carColor = carColor;
    }

    @Override
    public void print()
    {
        System.out.println("Car Identification Number : " + getVechicleId());
        System.out.println("Car Details : "+getVehicleDetails());
        System.out.println("Car Manufacturer's name : "+getManufacturerName());
        System.out.println("is car self driving ? : "+isVehicleIsSelfDrive());
        System.out.println("Car Driver Name : "+getVehicleDriverName());
        System.out.println("Is car insured ? : "+isVehicleIsInsured());
        System.out.println("Car Insurance Provider's Name : "+getInsuranceProviderName());
        System.out.println("Car no. of seats : "+getNoOfSeats());
        System.out.println("Car Fuel Type : "+getFuelType());
        System.out.println("Car Base Rate Per Day : "+getBaseRatePerDay());
        System.out.println("Car Rate per Hour : "+getRatePerKilometer());
        System.out.println("Car Type : "+getCarType());
        System.out.println("Car color : "+getCarColor());
    }
}