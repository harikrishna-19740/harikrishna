class AnimalAssignment 
{
    void makeSound() 
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends AnimalAssignment 
{
    void makeSound() 
    {
        System.out.println("Dog barks");
    }
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.makeSound();
    }
}