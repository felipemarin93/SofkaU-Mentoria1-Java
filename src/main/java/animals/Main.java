package animals;


/**
 * Esta es la clase principal de la aplicación donde se llaman los métodos de la clase gato y perro.
 * @author Daniel F. Marin correo: Felipemaringiraldo@hotmail.com
 * @version 27/05/2022/A
 * */
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
