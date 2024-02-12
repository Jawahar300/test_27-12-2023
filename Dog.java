public class Dog {
    public String name;
    public String breed;
    public int age;
    public String Colour;
    public String origin;

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Tommy";
        dog.breed = "German Shepeard";
        dog.age = 3;
        dog.Colour = "balck with Brown";
        dog.origin = "German";
        //dog.name = "Jimmy";

        System.out.println(dog.name);
    }
}
