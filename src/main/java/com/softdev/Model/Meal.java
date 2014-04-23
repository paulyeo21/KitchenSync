package com.softdev.Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by jeffrey on 2/11/14.
 * a Meal represents all a meal in cafe mac, it's broken up into different stations
 */

public class Meal {
    private List<Station> stations;
    private MealType mealType;

    public Meal(MealType mealType){
        stations = new ArrayList<Station>();
        this.mealType = mealType;
    }

    public void addStation(Station station){
        this.stations.add(station);
    }

    /**
     * @return a list of all the stations in a given meal
     */
    public List<Station> getStations(){
        return stations;
    }

    /**
     * @param stations list of stations to replace the current list of stations
     */
    public void setStations(List<Station> stations){
        this.stations = stations;
    }

    public ArrayList<String> getStationHeaders(){
        ArrayList<String> stationHeaders = new ArrayList<String>();
        for (Station station : stations)
            stationHeaders.add(station.getName());
        return stationHeaders;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public String toString(){
        switch (mealType){
            case BREAKFAST:
                return "Breakfast";
            case LUNCH:
                return "Lunch";
            case DINNER:
                return "Dinner";
        }
        return "No Meal Published";
    }

    public String toDebugString(){
        String meal = "--"+mealType.toString() + "\n";
        for(Station station : stations)
            meal += station.toString();
        return meal;
    }
}
