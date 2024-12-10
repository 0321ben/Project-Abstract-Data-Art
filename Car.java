import org.code.theater.*;
import org.code.media.*;

public class Car {
  private String brand; // car brand
  private int mileage; // car mileage
  private int year; // car year
  private String type; // car type (sedan, SUV, truck)

  // parameterized constructor
  public Car(String brand, int mileage, int year, String type){
    this.brand = brand;
    this.mileage = mileage;
    this.year = year;
    this.type = type;
  }

  // getter methods
  public String getBrand(){
    return brand; 
  }
  public int getMileage(){
    return mileage; 
  }
  public int getYear(){
    return year; 
  }
  public String getType(){
    return type; 
  }
  public int getMinMileage(){
    // Example method, adjust logic as needed
    return 10000; // Replace with appropriate minimum mileage value if different
  }
  public int getMaxMileage(){
    // Example method, adjust logic as needed
    return 100000; // Replace with appropriate maximum mileage value if different
  }

  // to String method to be printed out
  public String toString(){
    return "Brand: " + brand + "\n" +
           "Mileage: " + mileage + " miles\n" +
           "Year: " + year + "\n" +
           "Type: " + type;
  }

  public String toStringBrand(){
    return "Brand: " + brand;
  }
  public String toStringMileage(){
    return "Mileage: " + mileage + " miles";
  }
  public String toStringYear(){
    return "Year: " + year;
  }
  public String toStringType(){
    return "Type: " + type; 
  }
}