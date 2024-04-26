public class Papagaio extends Animal {

    private String domestico;

    public Papagaio(int idPet, String nome, String corAnimal, String sexoAnimal, String domestico) {
        super(idPet, nome, corAnimal, sexoAnimal);
        this.domestico = domestico;
    }

    public String getDomestico() {
        return domestico;
    }

    public void setDomestico(String domestico) {
        this.domestico = domestico;
    }

    @Override
    public String toString() {
        return super.toString() + "\nÉ doméstico??" + domestico;

    }
}
