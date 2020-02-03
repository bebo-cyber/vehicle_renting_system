package com.project.person;

import java.util.ArrayList;

enum BusAccessibility
{
    Yes,
    No
}
enum WifiAccessibility
{
    Yes,
    No
}

public class Bus extends Vehicle implements IDisplay
{
    private ArrayList<String> busType=new ArrayList<String>();
    private BusAccessibility isBusAccess;
    private WifiAccessibility isWifiAccess;

    public Bus(int vechicleId, String vehicleDetails, String manufacturerName, String insuranceProviderName, int noOfSeats, FuelTypes fuelTypes, ArrayList<String> busType, BusAccessibility isBusAccess, WifiAccessibility isWifiAccess)
    {
        super(vechicleId, vehicleDetails, manufacturerName, insuranceProviderName, noOfSeats, fuelTypes);
        this.busType = busType;
        this.isBusAccess = isBusAccess;
        this.isWifiAccess = isWifiAccess;
    }

    public ArrayList<String> getBusType() {
        return busType;
    }

    public void setBusType(ArrayList<String> busType) {
        this.busType = busType;
    }

    public BusAccessibility getIsBusAccess() {
        return isBusAccess;
    }

    public void setIsBusAccess(BusAccessibility isBusAccess) {
        this.isBusAccess = isBusAccess;
    }

    public WifiAccessibility getIsWifiAccess() {
        return isWifiAccess;
    }

    public void setIsWifiAccess(WifiAccessibility isWifiAccess) {
        this.isWifiAccess = isWifiAccess;
    }

    @Override
    public void print()
    {

        System.out.println("Bus Type : "+getBusType());
        System.out.println("Is wifi Available ? : "+getIsWifiAccess());
        System.out.println("Is bus access now? : "+getIsBusAccess());
    }

}