public class Informatica extends Loja { // metódo herança

    private double seguroEletronicos; // atributo específico

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBase,
            Endereco endereco, Data fundacao, double seguroEletronicos) {

        super(nome, quantidadeFuncionarios, salarioBase, endereco, fundacao);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBase,
            Endereco endereco, Data fundacao, int capacidadeEstoque,
            double seguroEletronicos) {

        super(nome, quantidadeFuncionarios, salarioBase, endereco, fundacao, capacidadeEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return super.toString() + // sobreescreve o toString da classe Loja
                "\nSeguro Eletrônicos: " + seguroEletronicos;
    }
}