import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List<Animal> listaAnimais = new ArrayList<>();

    public static void cadastrar(Animal animal) {
        listaAnimais.add(animal);
    }

    public static List<Animal> getListaAnimals() {
        return listaAnimais;
    }

    public static Animal buscarAnimal(int idPet) {

        for (Animal temp : listaAnimais) {

            if (temp.getIdPet() == idPet) {
                return temp;
            }
        }
        return null;

    }

    public static void excluir(Animal av) {
        listaAnimais.remove(av);

    }

}
