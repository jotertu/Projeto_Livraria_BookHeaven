package BookHaven.model;

import java.text.NumberFormat;

public abstract class ProdutosModel {
    private int id;
    private String titulo;
    private String descricao;
    private String categoria;
    private double preco;
    private int tipo;
    private int estoque;

    public ProdutosModel(int id, String titulo, String descricao, String categoria, double preco, int tipo, int estoque) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.preco = preco;
        this.tipo = tipo;
        this.estoque = estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void visualizar() {
        String tipo = "";

        switch (this.tipo) {
            case 1:
                tipo = "Lívro";
                break;
            case 2:
                tipo = "Mangá";
                break;
            case 3:
                tipo = "Revista";
                break;
            case 4:
                tipo = "HQ";
                break;
            case 5:
                tipo = "Jornal";
                break;
        }

        System.out.println("\n*********************************************************************");
        System.out.println("Dados do produto: ");
        System.out.println("*********************************************************************");
        System.out.println("\nID do produto: " + this.id);
        System.out.println("Titulo do produto: " + this.titulo);
        System.out.println("Descrição do produto: " + this.descricao);
        System.out.println("Categoria(s): " + this.categoria);
        System.out.println("Valor do produto: " + formatarMoeda(this.preco)); // Chamando o método formatarMoeda
        System.out.println("Tipo do produto: " + tipo); // Usando a variável tipoStr
        System.out.println("Quantia em estoque: " + this.estoque);
    }


    public String formatarMoeda(double valor) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setMinimumFractionDigits(2);
        String formatoMoeda = nf.format(valor);
        return formatoMoeda;
    }
}