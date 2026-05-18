import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            Produto produto = null;

            Endereco enderecoShopping = new Endereco(
                    "Rua Principal", "Cidade", "Estado",
                    "Brasil", "00000-000", "100", "Shopping"
            );

            Shopping shopping = new Shopping("Meu Shopping", enderecoShopping, 20);

            int opcao;

            do {

                System.out.println("\n(1) Criar loja");
                System.out.println("(2) Criar produto");
                System.out.println("(3) Mostrar loja de informática com seguro mais caro");
                System.out.println("(4) Mostrar quantidade de lojas por tipo");
                System.out.println("(5) Sair");
                System.out.print("Escolha: ");

                opcao = sc.nextInt();

                switch (opcao) {

                    case 1 -> {

                        sc.nextLine();

                        System.out.println("\nTipos de loja:");
                        System.out.println("1 - Alimentação");
                        System.out.println("2 - Informática");
                        System.out.println("3 - Vestuário");
                        System.out.println("4 - Bijuteria");
                        System.out.println("5 - Cosmético");
                        System.out.print("Escolha o tipo: ");

                        int tipo = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Nome da loja: ");
                        String nomeLoja = sc.nextLine();

                        System.out.print("Quantidade de funcionários: ");
                        int qtd = sc.nextInt();

                        System.out.print("Salário base: ");
                        double salario = sc.nextDouble();

                        sc.nextLine();

                        System.out.print("Rua: ");
                        String rua = sc.nextLine();

                        System.out.print("Cidade: ");
                        String cidade = sc.nextLine();

                        System.out.print("Estado: ");
                        String estado = sc.nextLine();

                        System.out.print("País: ");
                        String pais = sc.nextLine();

                        System.out.print("CEP: ");
                        String cep = sc.nextLine();

                        System.out.print("Número: ");
                        String numero = sc.nextLine();

                        System.out.print("Complemento: ");
                        String comp = sc.nextLine();

                        System.out.print("Dia fundação: ");
                        int diaF = sc.nextInt();

                        System.out.print("Mês fundação: ");
                        int mesF = sc.nextInt();

                        System.out.print("Ano fundação: ");
                        int anoF = sc.nextInt();

                        System.out.print("Capacidade estoque: ");
                        int capacidade = sc.nextInt();

                        Endereco endereco = new Endereco(
                                rua, cidade, estado,
                                pais, cep, numero, comp
                        );

                        Data fundacao = new Data(diaF, mesF, anoF);

                        Loja loja = null;

                        switch (tipo) {

                            case 1 -> {

                                System.out.print("Dia do alvará: ");
                                int diaA = sc.nextInt();

                                System.out.print("Mês do alvará: ");
                                int mesA = sc.nextInt();

                                System.out.print("Ano do alvará: ");
                                int anoA = sc.nextInt();

                                Data alvara = new Data(diaA, mesA, anoA);

                                loja = new Alimentacao(
                                        nomeLoja, qtd, salario,
                                        endereco, fundacao,
                                        alvara, capacidade
                                );
                            }

                            case 2 -> {

                                System.out.print("Valor do seguro eletrônico: ");
                                double seguro = sc.nextDouble();

                                loja = new Informatica(
                                        nomeLoja, qtd, salario,
                                        endereco, fundacao,
                                        capacidade, seguro
                                );
                            }

                            case 3 -> {

                                System.out.print("Produtos importados? (true/false): ");
                                boolean importados = sc.nextBoolean();

                                loja = new Vestuario(
                                        nomeLoja, qtd, salario,
                                        endereco, fundacao,
                                        importados, capacidade
                                );
                            }

                            case 4 -> {

                                System.out.print("Meta de vendas: ");
                                double meta = sc.nextDouble();

                                loja = new Bijuteria(
                                        nomeLoja, qtd, salario,
                                        endereco, fundacao,
                                        capacidade, meta
                                );
                            }

                            case 5 -> {

                                System.out.print("Taxa de comercialização: ");
                                double taxa = sc.nextDouble();

                                loja = new Cosmetico(
                                        nomeLoja, qtd, salario,
                                        endereco, fundacao,
                                        taxa, capacidade
                                );
                            }

                            default -> {
                                System.out.println("Tipo inválido!");
                            }
                        }

                        if (loja != null) {

                            if (shopping.insereLoja(loja)) {
                                System.out.println("Loja criada e adicionada ao shopping!");
                            } else {
                                System.out.println("Shopping cheio!");
                            }
                        }
                    }

                    case 2 -> {

                        sc.nextLine();

                        System.out.print("Nome do produto: ");
                        String nomeProd = sc.nextLine();

                        System.out.print("Preço: ");
                        double preco = sc.nextDouble();

                        sc.nextLine();

                        System.out.print("Produto tem validade? (s/n): ");
                        String resp = sc.nextLine();

                        Data validade;

                        if (resp.equalsIgnoreCase("n")) {

                            validade = new Data(1, 1, 2099);

                        } else {

                            System.out.print("Dia validade: ");
                            int dia = sc.nextInt();

                            System.out.print("Mês validade: ");
                            int mes = sc.nextInt();

                            System.out.print("Ano validade: ");
                            int ano = sc.nextInt();

                            validade = new Data(dia, mes, ano);
                        }

                        produto = new Produto(nomeProd, preco, validade);

                        System.out.println("Produto criado com sucesso!");
                    }

                    case 3 -> {

                        Informatica info = shopping.lojaSeguroMaisCaro();

                        if (info != null) {

                            System.out.println("\nLoja com seguro mais caro:");
                            System.out.println(info);

                        } else {

                            System.out.println("Não existem lojas de informática.");
                        }
                    }

                    case 4 -> {

                        sc.nextLine();

                        System.out.print("Digite o tipo da loja: ");
                        String tipoBusca = sc.nextLine();

                        int quantidade = shopping.quantidadeLojasPorTipo(tipoBusca);

                        if (quantidade == -1) {

                            System.out.println("Tipo inválido.");

                        } else {

                            System.out.println("Quantidade de lojas: " + quantidade);
                        }
                    }

                    case 5 -> {
                        System.out.println("Encerrando...");
                    }

                    default -> {
                        System.out.println("Opção inválida!");
                    }
                }

            } while (opcao != 5);

            if (produto != null) {

                Data referencia = new Data(20, 10, 2023);

                if (produto.estaVencido(referencia)) {

                    System.out.println("PRODUTO VENCIDO");

                } else {

                    System.out.println("PRODUTO NÃO VENCIDO");
                }
            }
        }
    }
}