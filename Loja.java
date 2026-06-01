public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos; // array de produtos

    // Construtor
    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.estoqueProdutos = new Produto[0];
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.estoqueProdutos = new Produto[0];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this(nome, quantidadeFuncionarios);
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
            Endereco endereco, Data dataFundacao) {
        this(nome, quantidadeFuncionarios, salarioBaseFuncionario);
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco,
            Data dataFundacao, int capacidade) {
        this(nome, quantidadeFuncionarios, endereco, dataFundacao);
        this.estoqueProdutos = new Produto[capacidade];
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
            Endereco endereco, Data dataFundacao, int capacidade) {
        this(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.estoqueProdutos = new Produto[capacidade];
    }

    // GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    // MÉTODOS

    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1)
            return -1;
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10)
            return 'P';
        if (quantidadeFuncionarios <= 30)
            return 'M';
        return 'G';
    }

    public boolean insereProduto(Produto produto) { // insere um produto no estoque
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto) { // remove um produto do estoque pelo nome
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null &&
                    estoqueProdutos[i].getNome().equals(nomeProduto)) {

                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    public void imprimeProdutos() {
        for (Produto p : estoqueProdutos) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    @Override
    public String toString() {
        String texto = "Loja: " + nome +
                "\nFuncionários: " + quantidadeFuncionarios +
                "\nSalário base: " + salarioBaseFuncionario;

        if (endereco != null) {
            texto += "\nEndereço: " + endereco;
        }

        if (dataFundacao != null) {
            texto += "\nData de fundação: " + dataFundacao;
        }

        texto += "\nCapacidade estoque: " +
                (estoqueProdutos != null ? estoqueProdutos.length : 0);

        return texto;
    }

    public String listarProdutos() {

        String texto = "";

        for (Produto p : estoqueProdutos) {

            if (p != null) {
                texto += p + "\n";
            }
        }

        if (texto.isEmpty()) {
            return "Nenhum produto cadastrado.";
        }

        return texto;
    }
}