package animals;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Esta clase Perro extiende de la clase animal los atributos para ser instanciados y ejecutados
 * @author Daniel F. Marin correo: Felipemaringiraldo@hotmail.com
 * @version 27/05/2022/A
 * */
public class Dog extends Animal {

    /**
    *
     *Este constructor contiene los atributos  que hereda de la clase Animal
     *
     */
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
