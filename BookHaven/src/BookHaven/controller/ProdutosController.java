package BookHaven.controller;

import java.util.ArrayList;

import BookHaven.model.ProdutosModel;
import BookHaven.repository.ProdutosRepository;

public class ProdutosController implements ProdutosRepository {

    private ArrayList<ProdutosModel> listaProdutos = new ArrayList<ProdutosModel>();
    int id = 0;

    @Override
    public void procurarPorId(int id) {
        var produtos = buscarNaCollection(id);

        if (produtos != null) {
            produtos.visualizar();
        } else {
            System.out.println("\nO " + id + " do produto solicitado não foi localizado!");
        }
    }

    @Override
    public void listarTodos() {
        for (var produto : listaProdutos) {
            produto.visualizar();
        }
    }

    @Override
    public void cadastrar(ProdutosModel produtosModel) {

        listaProdutos.add(produtosModel);
        System.out.println("\nO Produto Número: " + produtosModel.getId() + " foi cadastrado com sucesso!");

    }

    @Override
    public void atualizar(ProdutosModel produtosModel) {
        var buscaProdutos = buscarNaCollection(produtosModel.getId());

        if (buscaProdutos != null) {
            listaProdutos.set(listaProdutos.indexOf(buscaProdutos), produtosModel);
            System.out.println("O produto de ID: " + produtosModel.getId() + " foi atualizado com sucesso!");
        } else
            System.out.println("O produto de ID: " + produtosModel.getId() + " não foi encontrado!");

    }

    @Override
    public void deletar(int id) {
        var produto = buscarNaCollection(id);

        if (produto != null) {
            if (listaProdutos.remove(produto) == true)
                System.out.println("\nO produto de: " + id + " foi deletado com sucesso");
        } else {
            System.out.println("\nO produto de: " + id + " não foi encontrado!");
        }
    }



    public int incrementoId() {
        return ++id;
    }

    public ProdutosModel buscarNaCollection(int id) {
        for (var produto : listaProdutos) {
            if (produto.getId() == id) {
                return produto;
            }
        }

        return null;
    }

    public int retornaTipo(int id) {
        for (var produto : listaProdutos) {
            if (produto.getId() == id) {
                return produto.getTipo();
            }
        }

        return 0;
    }


}