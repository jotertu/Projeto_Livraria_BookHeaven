package BookHaven.model;

public class Livro extends ProdutosModel {
    private String autor;
    private String editora;
    private String anoPublicacao;
    private int classificacaoEtaria;

    public Livro(int id, String titulo, String descricao, String categoria, double preco, int tipo, int estoque, String autor, String editora, String anoPublicacao, int classificacaoEtaria) {
        super(id, titulo, descricao, categoria, preco, tipo, estoque); // O valor 1 indica que é um livro
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(int classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    @Override
    public void visualizar() {
        super.visualizar(); // Chama o método visualizar da classe pai

        System.out.println("Autor: " + this.autor);
        System.out.println("Editora: " + this.editora);
        System.out.println("Ano de Publicação: " + this.anoPublicacao);
        System.out.println("Classificação Etária: " + this.classificacaoEtaria);
    }
}
