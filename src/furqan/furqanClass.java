package furqan;
// Writing a Biodata for Furqan.

import java.util.Date;

public class furqanClass {

// Declaring States .
    public int currentYear = 2021;
    public String name;
    public int birthYear = 1983;
    public int age = currentYear - birthYear;
    public float height;
    public String birthSign;
    public boolean starSignIsCancer = true;
    public String country;
    public String currentCity;

// Declaring Behaviours:
    public void displayName(){
        System.out.println("Hi. My name is " + name);
    }

    public void displayAge(){
        System.out.println("I am " + age + " years old.");
    }

    public void displayRest(){
        System.out.println("I am " + height + "ft tall and my star sign is " + birthSign);
    }

    public void displayLocation(){
        System.out.println("I am originally from " + country + ". Right now I am based in " + currentCity);
    }
}
