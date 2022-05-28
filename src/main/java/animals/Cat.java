package animals;

import interfaces.ICat;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cat extends Animal implements ICat{


    public Cat(String animalName, String animalType, int animalAge) {
        super(animalName, animalType, animalAge);
    }

    Logger logger = Logger.getLogger(Cat.class.getName());

    public void toWalk(){
        logger.log(Level.INFO,"el gato esta caminando suavemente");
    }

    public void toSleep(){
        logger.log(Level.INFO,"el gato duerme todo el día");
    }

    public void ToJump() {
        logger.log(Level.INFO,"el gato se puso a saltar");
    }

}
