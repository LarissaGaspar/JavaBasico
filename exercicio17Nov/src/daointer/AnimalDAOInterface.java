package daointer;

import models.Animal;
import java.util.ArrayList;

public interface AnimalDAOInterface {
    
    public Animal buscarAnimal(Long identificador);

    public Animal buscarAnimalPorNome(String nome);

    public int deletarAnimal(Animal animal);

    public int deletarAnimal(ArrayList<Animal> animais);

    public int cadastrarAnimal(Animal animal);

    public int cadastrarAnimal(ArrayList<Animal> animais);

    public ArrayList<Animal> consultarAnimais();

}