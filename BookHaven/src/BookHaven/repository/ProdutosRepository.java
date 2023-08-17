package BookHaven.repository;

import BookHaven.model.ProdutosModel;

public interface ProdutosRepository {

    //Crud dos produtos
    public void procurarPorId(int id);

    public void listarTodos();

    public void cadastrar(ProdutosModel produtosModel);

    public void atualizar(ProdutosModel produtosModel);

    public void deletar(int id);

}
