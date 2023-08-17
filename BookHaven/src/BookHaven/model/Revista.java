package BookHaven.model;

public class Revista extends ProdutosModel {
    private String editora;
    private int numEdicao;

    public Revista(int id, String titulo, String descricao, String categoria, double preco, int tipo, int estoque, String editora, int numEdicao) {
        super(id, titulo, descricao, categoria, preco, tipo, estoque);
        this.editora = editora;
        this.numEdicao = numEdicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumEdicao() {
        return numEdicao;
    }

    public void setNumEdicao(int numEdicao) {
        this.numEdicao = numEdicao;
    }

    @Override
    public void visualizar() {
        super.visualizar(); // Chama o método visualizar da classe pai

        System.out.println("Editora: " + editora);
        System.out.println("Número de Edição: " + numEdicao);
    }
}
