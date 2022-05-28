package animals;


/**
 * Esta es la superclase que contiene los atributos y el constructor que es usado por las clases gato y perro
 * @author Daniel F. Marin correo: Felipemaringiraldo@hotmail.com
 * @version 27/05/2022/A
 * */
public class Animal {

    private String animalName;
    private String animalType;
    private int animalAge;

    /**
     * Los siguientes atributos componen la instancia del Animal para ser usado por las clases
     * que heredan de Animal (Dog y Cat)
     * @param Atributo nombre del animal
     * @param Atributo tipo de animal
     * @param Atributo Edad del animal
     */
    public Animal(String animalName, String animalType, int animalAge) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalAge = animalAge;
    }
}
