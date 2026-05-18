public class Vestuario extends Loja {

    private boolean produtosImportados;

    
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBase,
                     Endereco endereco, Data dataFundacao, boolean produtosImportados) {

        super(nome, quantidadeFuncionarios, salarioBase, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBase, Endereco endereco,
        Data dataFundacao, boolean produtosImportados, int capacidadeEstoque) {

        super(nome, quantidadeFuncionarios, salarioBase, endereco, dataFundacao, capacidadeEstoque);
        this.produtosImportados = produtosImportados;
    }
    

   
    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    
    @Override 
    public String toString() {
        return super.toString() +
               "\nProdutos Importados: " + produtosImportados;
    }
}