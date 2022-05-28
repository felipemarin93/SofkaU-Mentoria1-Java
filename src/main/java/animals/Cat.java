package animals;

import interfaces.ICat;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Esta clase Gato extiende de la clase animal los atributos para ser instanciados y ejecutados
 * @author Daniel F. Marin correo: Felipemaringiraldo@hotmail.com
 * @version 27/05/2022/A
 * */
public class Cat extends Animal implements ICat{


    public Cat(String animalName, String animalType, int animalAge) {
        super(animalName, animalType, animalAge);
    }

    Logger logger = Logger.getLogger(Cat.class.getName());

    /**
     Métodos que reciben tres argumentos para ser invocados por medio del constructor que
     a su vez implementa la interface y retorna el mensaje de clase Logger.
     */
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
