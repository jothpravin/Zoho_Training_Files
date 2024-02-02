class Animal
{
	public void speak()
	{
		System.out.println("The animal says roar");
	}
}

class Dog extends Animal
{
	public void speak()
	{
		System.out.println("The doy says woof");
	}
}

class Cat extends Animal
{
	public void speak()
	{
		System.out.println("The cat says meow");
	}
}

class PrintAnimal
{
	public static void main(String []args)
	{
		Animal a = new Animal();
		a.speak();
		Dog d = new Dog();
		d.speak();
		Cat c = new Cat();
		c.speak();
	}
}
