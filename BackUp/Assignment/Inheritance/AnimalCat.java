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

class Cat extends Animal 
{
    public String breed;
    public String color;
    
    public Cat(String name, int age, String species, String numLives, String color)
    {
    	super(name, age, species);
    	this.numLives = numLives;
    	this.color = color;
    }
    
    public static void main(String []args)
    {
    	
    }

}

