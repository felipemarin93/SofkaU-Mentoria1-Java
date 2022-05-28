package animals;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Michi","felino",6);

        cat.toSleep();
        cat.toWalk();
        cat.ToJump();

        Dog dog = new Dog("Tony","Canino",2);

        dog.toBark();
        dog.toEat();
        dog.ToJump();

    }
}
