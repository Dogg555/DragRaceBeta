public class Main 
{
  public static void main(String[] agrs) 
  {
    RaceCar advanceCar1 = new RaceCar("Porsche", "918 Spyder", 198, 3, 1200000, 1, 0);
    RaceCar basicCar1 = new RaceCar("Dodge", "Demon", 154, 1, 65000, 1, 0);
    RaceCar basicCar2 = new RaceCar("Ford", "GT", 164, 1, 80000, 1, 0);
    System.out.println(basicCar1.getTopSpeed());
    
    
  }
}