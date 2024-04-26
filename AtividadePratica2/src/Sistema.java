
public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nREGISTRO DE DONO DE ANIMAIS");
        System.out.println("1) Novo papagaio");
        System.out.println("2) Novo Cachorro");
        System.out.println("3) Novo Gato");
        System.out.println("4) Procurar Animal");
        System.out.println("5) Listar Todos");
        System.out.println("6) Excluir um animal especifico");
        System.out.println("7) Excluir lista animal:");
        System.out.println("0) Sair");
        System.out.println("Informe uma opção: ");

    }

    public static void verificarOpcao(int op) {

        int idPet;
        String nome;
        String corAnimal;
        String sexoAnimal;
        String domestico;
        String raca;
        String castrado;

        switch (op) {

            case 1:
                System.out.println("Novo papagaio");
                System.out.println("Informe o id do pet");
                idPet = Console.lerInt();

                System.out.println("É doméstico?");
                domestico = Console.lerString();

                System.out.println("informe o nome do animal");
                nome = Console.lerString();

                System.out.println("Informe o sexo do animal");
                sexoAnimal = Console.lerString();

                System.out.println("informe a cor do animal:");
                corAnimal = Console.lerString();

                Papagaio p = new Papagaio(idPet, nome, corAnimal, sexoAnimal, domestico);
                Cadastro.cadastrar(p);
                break;

            case 2:

                System.out.println("Novo Gato: ");
                System.out.println("Informe o id do Pet: ");
                idPet = Console.lerInt();

                System.out.println("informe o nome do animal: ");
                nome = Console.lerString();

                System.out.println("Informe o sexo do animal: ");
                sexoAnimal = Console.lerString();

                System.out.println("Informe se o animal é castrado:");
                castrado = Console.lerString();

                System.out.println("Informe a cor do animal: ");
                corAnimal = Console.lerString();

                Gato g = new Gato(idPet, nome, corAnimal, sexoAnimal, castrado);

                Cadastro.cadastrar(g);

                System.out.println("\nAnimal cadastrado...");

                break;

            case 3:

                System.out.println("Novo Cachorro: ");
                System.out.print("Informe o id do p: ");
                idPet = Console.lerInt();

                System.out.println("Informe o nome do animal: ");
                nome = Console.lerString();

                System.out.println("Informe a cor do animal: ");
                corAnimal = Console.lerString();

                System.out.println("Sexo do animal: ");
                sexoAnimal = Console.lerString();

                System.out.println("informe a raca do animal:  ");
                raca = Console.lerString();

                Cachorro c = new Cachorro(idPet, nome, corAnimal, sexoAnimal, raca);
                System.out.println("Cachorro cadastrado");

                break;

            case 4:
                System.out.println("\nProcurar animal: ");

                System.out.println("ID do animal:");
                idPet = Console.lerInt();

                Animal a = Cadastro.buscarAnimal(idPet);

                if (a != null) {
                    System.out.println("\nAnimal encontrado: ");
                    System.out.println(a.toString());
                    return;
                }
                System.out.println("\nDono " + idPet + " não foi encontrado");

                break;

            case 5:
                System.out.println("\nTodos os Animais foram cadastrados");

                if (Cadastro.getListaAnimals().size() == 0) {

                    System.out.println("\nNão a animais cadastrados");
                    return;
                }
                for (Animal temp : Cadastro.getListaAnimals()) {
                    System.out.println(temp.toString());
                }

                break;

            case 6:

                System.out.println("\nID do animal que deseja excluir");
                idPet = Console.lerInt();

                Animal buscarA = Cadastro.buscarAnimal(idPet);
                if (buscarA != null) {

                    for (Animal temp : Cadastro.getListaAnimals()) {
                        Cadastro.excluir(buscarA);
                        System.out.println("\nExcluido com sucesso");

                        return;
                    }
                }

            case 7:
                System.out.println("EXCLUIR TODOS OS REGISTROS");
                if (Cadastro.getListaAnimals().size() == 0) {
                    System.out.println("não ha animais para excluir");
                    return;
                }

                Cadastro.getListaAnimals().clear();
                System.out.println("Animais da lista fora excluidos");
                break;
            case 0:
                System.out.println("\nO programa foi finalizado");
                break;

            default:

                System.out.println("\nOpção invalida. digite novamente");
                break;
        }

    }

    public static void executar() {

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);
    }

}
