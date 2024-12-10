import org.code.theater.*;
import org.code.media.*;

public class DataScene extends Scene {
  private Car[] car; // 1D array of cars

  public DataScene(){
    car = createCar();
  }

  // Returns a 1D array of a Car Object
  public Car[] createCar(){
    String[] brandArray = FileReader.toStringArray("brand.txt");
    int[] mileageArray = FileReader.toIntArray("mileage.txt");
    int[] yearArray = FileReader.toIntArray("year.txt");
    String[] typeArray = FileReader.toStringArray("type.txt");

    Car[] carArray = new Car[brandArray.length];
    for(int i = 0; i < carArray.length; i++){
      carArray[i] = new Car(brandArray[i], mileageArray[i], yearArray[i], typeArray[i]);
    }
    return carArray;
  }

  // Creates my scene
  public void drawScene(){
    // Select a random car
    int randomIndex = (int) (Math.random() * car.length); // Get a random index
    Car c = car[randomIndex]; // Select the random car

    // Generate a random mileage within the car's range
    int randomMileage = (int) (Math.random() * (c.getMaxMileage() - c.getMinMileage() + 1)) + c.getMinMileage();

    clear("blue"); // makes blue background
    playSound("carhonk.wav"); // plays car honking sounds
    pause(5);

    // sorts into sedan, SUV, and truck based on type
    if(c.getType().equals("SUV")){
      playSound("suv.wav"); // plays SUV sound effect
      drawImage("SUV.jpeg", 150, 40, 200);
      setTextStyle(Font.SANS, FontStyle.BOLD);
    } else if (c.getType().equals("Sedan")){
      playSound("sedan.wav"); // plays sedan sound effect
      drawImage("sedan.jpeg", 200, 10, 200);
      setTextStyle(Font.SANS, FontStyle.BOLD);
    } else if (c.getType().equals("Coupe")){
      playSound("coupe.wav"); // plays coupe sound effect
      drawImage("car.jpeg", 200, 10, 200);
      setTextStyle(Font.SANS, FontStyle.BOLD);
    }

    drawText(c.toStringBrand(), 20, 200);
    drawText(c.toStringMileage(), 20, 225);
    drawText(c.toStringYear(), 20, 250);
    drawText(c.toStringType(), 20, 275);
    System.out.println(c);
  }
}