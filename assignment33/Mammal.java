package assignment33;
public class Mammal implements Animal{
    private int NoLegs;
     private String Food;
    
      public void eat()
      {
          System.out.println("Iam eating ");
      }
     
      public void travel()
      {
          System.out.println("Iam traveling ");
          
      }
      public void setNoOfLegs(int Legs)
      {
          NoLegs=Legs;
      }
      public int getNoOfLegs()
      {
         return NoLegs;
      }
      public void setFavFood(String FavFood)
      {
          Food=FavFood;
      }
      public String getFavFood()
      {
         return Food;
      }
}
