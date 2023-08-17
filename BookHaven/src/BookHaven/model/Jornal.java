package BookHaven.model;

public class Jornal extends ProdutosModel {
    private int numEdicao;
    private String editora;

    public Jornal(int id, String titulo, String descricao, String categoria, double preco, int tipo, int estoque, int numEdicao, String editora) {
        super(id, titulo, descricao, categoria, preco, tipo, estoque);
        this.numEdicao = numEdicao;
        this.editora = editora;
    }

    public int getNumEdicao() {
        return numEdicao;
    }

    public void setNumEdicao(int numEdicao) {
        this.numEdicao = numEdicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public void visualizar() {
        super.visualizar(); // Chama o método visualizar da classe pai

        System.out.println("Número de Edição: " + numEdicao);
        System.out.println("Editora: " + editora);
    }
}
