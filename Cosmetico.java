public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBase,
                     Endereco endereco, Data dataFundacao, double taxaComercializacao) {
        super(nome, quantidadeFuncionarios, salarioBase, endereco, dataFundacao);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBase,
                     Endereco endereco, Data dataFundacao, double taxaComercializacao, int capacidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBase, endereco, dataFundacao, capacidadeEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao(){ return taxaComercializacao; }
    public void setTaxaComercializacao(double t){ this.taxaComercializacao = t; }

    @Override
    public String toString(){
        return super.toString() + " | Cosmetico";
    }
}