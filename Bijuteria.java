public class Bijuteria extends Loja {

    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBase,
            Endereco endereco, Data dataFundacao, int capacidadeEstoque,
            double metaVendas) {

        super(nome, quantidadeFuncionarios, salarioBase, endereco, dataFundacao, capacidadeEstoque);
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBase,
            Endereco endereco, Data dataFundacao,
            double metaVendas) {

        super(nome, quantidadeFuncionarios, salarioBase, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMeta de Vendas: " + metaVendas;
    }
}