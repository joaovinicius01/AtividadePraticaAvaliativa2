public class Cachorro extends Animal {

    private String raca;

    public Cachorro(int idPet, String nome, String corAnimal, String sexoAnimal, String raca) {
        super(idPet, nome, corAnimal, sexoAnimal);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRaça do animal: " + raca;

    }
}
