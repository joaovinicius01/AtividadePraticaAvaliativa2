
public class Gato extends Animal {

    private String castrado;

    public Gato(int idPet, String nome, String corAnimal, String sexoAnimal, String castrado) {
        super(idPet, nome, corAnimal, sexoAnimal);
        this.castrado = castrado;
    }

    public String getCastrado() {
        return castrado;
    }

    public void setCastrado(String castrado) {
        this.castrado = castrado;
    }

    @Override
    public String toString() {
        return super.toString() + "\nÉ castrado? " + castrado;

    }
}
