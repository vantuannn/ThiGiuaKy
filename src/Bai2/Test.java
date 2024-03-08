package Bai2;

public class Test {
    public static void main(String[] args) {
        Animal dog = new Animal.Dog("Cun",1);
        System.out.println(dog.toString());
        dog.Say();
        dog.Move();

        Animal cat = new Animal.Dog.Cat("Miu" , 2);
        System.out.println(cat.toString());
        cat.Say();
        cat.Move();

        Animal bird = new Animal.Dog.Cat.Bird("bo", 1);
        System.out.println(bird.toString());
        bird.Say();
        bird.Move();
    }
}
