public class Animal {

    private int idPet;
    private String nome;
    private String corAnimal;
    private String sexoAnimal;

    public Animal(int idPet, String nome, String corAnimal, String sexoAnimal) {
        this.idPet = idPet;
        this.nome = nome;
        this.corAnimal = corAnimal;
        this.sexoAnimal = sexoAnimal;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCorAnimal() {
        return corAnimal;
    }

    public void setCorAnimal(String corAnimal) {
        this.corAnimal = corAnimal;
    }

    public String getSexoAnimal() {
        return sexoAnimal;
    }

    public void setSexoAnimal(String sexoAnimal) {
        this.sexoAnimal = sexoAnimal;
    }

    @Override
    public String toString() {
        return "\nNome do animal" + nome + "\ncor  do animal " + corAnimal + "\nid do pet " + idPet
                + "\nSexo do animal: "
                + sexoAnimal;
    }

}
