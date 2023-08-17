package BookHaven.model;

public class Manga extends ProdutosModel {
    private int volumes;
    private String autor;

    public Manga(int id, String titulo, String descricao, String categoria, double preco, int tipo, int estoque, int volumes, String autor) {
        super(id, titulo, descricao, categoria, preco, tipo, estoque);
        this.volumes = volumes;
        this.autor = autor;
    }

    public int getVolumes() {
        return volumes;
    }

    public void setVolumes(int volumes) {
        this.volumes = volumes;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void visualizar() {
        super.visualizar(); // Chama o método visualizar da classe pai

        System.out.println("Volumes: " + volumes);
        System.out.println("Autor: " + autor);
    }
}
