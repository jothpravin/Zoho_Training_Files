public class Animal 
{
    public String name;
    public int age;
    public String species;
    
    public Animal(String name, int age, String species)
    {
    	 this.name = name;
    	 this.age = age;
    	 this.species = species;
    }
}

class Dog extends Animal 
{
    public String breed;
    public String color;
    
    public Dog(String name, int age, String species, String breed, String color)
    {
    	super(name, age, species);
    	this.breed = breed;
    	this.color = color;
    }
    
    public static void main(String []args)
    {
    	
    }

}

