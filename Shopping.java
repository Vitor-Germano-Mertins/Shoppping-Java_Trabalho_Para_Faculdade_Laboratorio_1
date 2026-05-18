public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja[] lojas;    //array de lojas do shopping

    // Construtor
    public Shopping(String nome, Endereco endereco, int capacidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[capacidadeLojas];
    }

    // GETTERS E SETTERS
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    public Loja[] getLojas() { return lojas; }
    public void setLojas(Loja[] lojas) { this.lojas = lojas; }

    // insereLoja - insere uma loja no array de lojas do shopping
    public boolean insereLoja(Loja loja) {
        if (loja == null) return false;

        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    // removeLoja
    public boolean removeLoja(String nomeLoja) {
        if (nomeLoja == null) return false;

        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null &&
                lojas[i].getNome().equalsIgnoreCase(nomeLoja)) {

                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    // quantidadeLojasPorTipo
    public int quantidadeLojasPorTipo(String tipo) {

        if (tipo == null) return -1;

        int contador = 0;

        for (Loja loja : lojas) {
            if (loja == null) continue;

            if (tipo.equalsIgnoreCase("Cosmetico") && loja instanceof Cosmetico) contador++;
            else if (tipo.equalsIgnoreCase("Vestuario") && loja instanceof Vestuario) contador++;
            else if (tipo.equalsIgnoreCase("Bijuteria") && loja instanceof Bijuteria) contador++;
            else if (tipo.equalsIgnoreCase("Alimentacao") && loja instanceof Alimentacao) contador++;
            else if (tipo.equalsIgnoreCase("Informatica") && loja instanceof Informatica) contador++;
        }

        if (!tipo.equalsIgnoreCase("Cosmetico") &&
            !tipo.equalsIgnoreCase("Vestuario") &&
            !tipo.equalsIgnoreCase("Bijuteria") &&
            !tipo.equalsIgnoreCase("Alimentacao") &&
            !tipo.equalsIgnoreCase("Informatica")) {
            return -1;
        }

        return contador;
    }

    // lojaSeguroMaisCaro  //verifica cada loja do shopping, e retorna a loja de informática com o seguro mais caro. Se não houver lojas de informática, retorna null.
    public Informatica lojaSeguroMaisCaro() {

        Informatica maior = null;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica info) { 

                if (maior == null ||
                    info.getSeguroEletronicos() > maior.getSeguroEletronicos()) {

                    maior = info;
                }
            }
        }

        return maior;
    }

    @Override
    public String toString() {
        return "Shopping: " + nome +
               "\nEndereço: " + endereco +
               "\nCapacidade de lojas: " + lojas.length;
    }
}