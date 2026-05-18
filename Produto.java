public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public Data getDataValidade() { return dataValidade; }
    public void setDataValidade(Data dataValidade) { this.dataValidade = dataValidade; }

    public boolean estaVencido(Data data) { 
        if(dataValidade == null) return false;

        if (dataValidade.getAno() < data.getAno()) return true;
        if (dataValidade.getAno() == data.getAno()) {
            if (dataValidade.getMes() < data.getMes()) return true;
            if (dataValidade.getMes() == data.getMes()) {
                return dataValidade.getDia() < data.getDia();
            }
        }
        return false;
    }
    @Override 
    public String toString() {
    return "Produto: " + nome +
           " | Preço: " + preco +
           " | Validade: " + dataValidade;
}
}