package lab12;

//****************************************************************
//DogTest.java
//
//A simple test class that creates a Dog and makes it speak.
//
//****************************************************************
public class DogTest
{
    public static void main(String[] args)
    {
        Dog dog = new Yorkshire("Spike");
        System.out.println(dog.getName() + " says " + dog.speak());
        
        Yorkshire yorky = new Yorkshire("Ein");
        Labrador lab = new Labrador("Bobby", "Black");
        
        System.out.println(yorky.getName() + " says " + yorky.speak());
        System.out.println(lab.getName() + " says " + lab.speak());
        
        System.out.println(yorky.getName() + " breed weight is: " + yorky.avgBreedWeight());
        System.out.println(lab.getName() + " breed weight is: " + lab.avgBreedWeight());
    }
}
