package BookHaven.model;

public class Hq extends ProdutosModel {
    private String autor;
    private int numPaginas;

    public Hq(int id, String titulo, String descricao, String categoria, double preco, int tipo, int estoque, String autor, int numPaginas) {
        super(id, titulo, descricao, categoria, preco, tipo, estoque);
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public void visualizar() {
        super.visualizar(); // Chama o método visualizar da classe pai

        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numPaginas);
    }
}
