package animals;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Dog extends Animal {

    public Dog(String animalName, String animalType, int animalAge) {
        super(animalName, animalType, animalAge);
    }

    Logger logger = Logger.getLogger(Cat.class.getName());

    public void toBark(){
        logger.log(Level.INFO,"el perro esta ladra fuerte");
    }

    public void toEat(){
        logger.log(Level.INFO,"el perro come cuido");
    }

    public void ToJump() {
        logger.log(Level.INFO,"el perro esta brincando");
    }

}
