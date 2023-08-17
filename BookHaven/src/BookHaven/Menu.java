package BookHaven;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import BookHaven.controller.ProdutosController;
import BookHaven.model.*;
import BookHaven.util.Cores;


public class Menu {

    public static void main(String[] args) {

        ProdutosController produtos = new ProdutosController();

        Scanner scanner = new Scanner(System.in);

        //Teste da classe ProdutosModel;


        int opcao = 0, id, tipo, estoque, classificacaoEtaria, volumes, numEdicao, numPaginas;
        String anoPublicacao, titulo, descricao, categoria, autor, editora;
        double preco;

        System.out.println("\nCriar Produtos");

        //Exemplo para Lívro
        produtos.cadastrar(new Livro(produtos.incrementoId(), "O Senhor dos Anéis", "Fantasia épica", "Literatura", 29.99, 1, 50, "J.R.R. Tolkien", "Editora Fantástica", "2022", 14));

        //Exemplo para Mangá
        produtos.cadastrar(new Manga(produtos.incrementoId(), "One Piece", "Aventura pirata", "Quadrinhos", 8.99, 2, 120, 30, "Eiichiro Oda"));

        //Exemplo para Revista
        produtos.cadastrar(new Revista(produtos.incrementoId(), "National Geographic", "Exploração e ciência", "Ciências", 5.99, 3, 200, "Editora Nacional", 35));

        //Exemplo para Hq
        produtos.cadastrar(new Hq(produtos.incrementoId(), "Batman: O Cavaleiro das Trevas", "Ação e mistério", "Quadrinhos", 12.99, 4, 75, "Frank Miller", 120));

        //Exemplo para Jornal
        produtos.cadastrar(new Jornal(produtos.incrementoId(), "The Daily Times", "Notícias locais e globais", "Jornalismo", 2.99, 5, 500, 152, "Editora Notícias Express"));

        while (true) {

            System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND + "|***********************************************************************************|" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND + "|                                                                                   |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND + "|                                                                                   |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND + "|   ██████╗  ██████╗  ██████╗ ██╗  ██╗██╗  ██╗ █████╗ ██╗   ██╗███████╗███╗   ██╗   |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND + "|   ██╔══██╗██╔═══██╗██╔═══██╗██║ ██╔╝██║  ██║██╔══██╗██║   ██║██╔════╝████╗  ██║   |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND + "|   ██████╔╝██║   ██║██║   ██║█████╔╝ ███████║███████║██║   ██║█████╗  ██╔██╗ ██║   |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND + "|   ██╔══██╗██║   ██║██║   ██║██╔═██╗ ██╔══██║██╔══██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║   |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND + "|   ██████╔╝╚██████╔╝╚██████╔╝██║  ██╗██║  ██║██║  ██║ ╚████╔╝ ███████╗██║ ╚████║   |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND + "|   ╚═════╝  ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝  ╚═══╝  ╚══════╝╚═╝  ╚═══╝   |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_RED + Cores.ANSI_BLACK_BACKGROUND + "|                                                                                   |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_BLACK + Cores.ANSI_RED_BACKGROUND + "|***********************************************************************************|" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_BLACK + Cores.ANSI_RED_BACKGROUND + "|                                                                                   |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_BLACK + Cores.ANSI_RED_BACKGROUND + "|                         1 - Cadastrar Produto                                     |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_BLACK + Cores.ANSI_RED_BACKGROUND + "|                         2 - Listar todos os Produtos                              |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_BLACK + Cores.ANSI_RED_BACKGROUND + "|                         3 - Atualizar os produtos                                 |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_BLACK + Cores.ANSI_RED_BACKGROUND + "|                         4 - Apagar os Produtos                                    |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_BLACK + Cores.ANSI_RED_BACKGROUND + "|                         5 - Buscar produto por ID                                 |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_BLACK + Cores.ANSI_RED_BACKGROUND + "|                         9 - Sair                                                  |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_BLACK + Cores.ANSI_RED_BACKGROUND + "|                                                                                   |" + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_BLACK + Cores.ANSI_RED_BACKGROUND + "|***********************************************************************************|" + Cores.TEXT_RESET);
            System.out.println();
            System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Entre com a opção desejada:                                                          " + Cores.TEXT_RESET);
            System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);


            try {
                opcao = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Dado inserido incorretamente. Tente denovo!");
                scanner.nextLine();
                opcao = 0;
            }

            if (opcao == 9) {
                System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
                System.out.println(Cores.ANSI_BLACK_BACKGROUND + "Bookhaven - Refúgio dos livros!                                                      " + Cores.TEXT_RESET);
                System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
                scanner.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:

                    try {
                        System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
                        System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Cadastrar produtos                                                                   " + Cores.TEXT_RESET);
                        System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
                        System.out.println();

                        System.out.println("Insira o Título do Produto: ");
                        scanner.skip("\\R");
                        titulo = scanner.nextLine();

                        System.out.println("Insira a Descrição do Produto: ");
                        descricao = scanner.nextLine();

                        System.out.println("Insira a Categoria do Produto (Ação, Terror, Comédia, Aventura, etc) : ");
                        categoria = scanner.nextLine();

                        System.out.println("Insira o preço do produto: ");
                        preco = scanner.nextDouble();

                        do {
                            System.out.println("Digite o tipo de Produto (Lívro, Mangá, Revista, HQ, Jornal): ");
                            scanner.nextLine(); // Limpar a linha pendente
                            String tipoInput = scanner.nextLine().toLowerCase(); // Lê e converte para minúsculas
                            if (tipoInput.equalsIgnoreCase("livro")) {
                                tipo = 1;
                            } else if (tipoInput.equalsIgnoreCase("manga")) {
                                tipo = 2;
                            } else if (tipoInput.equalsIgnoreCase("revista")) {
                                tipo = 3;
                            } else if (tipoInput.equalsIgnoreCase("hq")) {
                                tipo = 4;
                            } else if (tipoInput.equalsIgnoreCase("jornal")) {
                                tipo = 5;
                            } else {
                                tipo = 0; // Tipo inválido
                            }
                        } while (tipo < 1 || tipo > 5);

                        System.out.println("Insira a quantia de produtos no estoque: ");
                        estoque = scanner.nextInt();

                        switch (tipo) {
                            case 1:
                                System.out.println("Insira o Nome do Autor do livro: ");
                                scanner.skip("\\R?");
                                autor = scanner.nextLine();

                                System.out.println("Insira a Editora do Livro: ");
                                editora = scanner.nextLine();

                                System.out.println("Insira o ano de Publicação (Apenas o ano): ");
                                anoPublicacao = scanner.nextLine();

                                System.out.println("Insira a Classificação Etária: ");
                                classificacaoEtaria = scanner.nextInt();

                                produtos.cadastrar(new Livro(produtos.incrementoId(), titulo, descricao, categoria, preco, tipo, estoque, autor, editora, anoPublicacao, classificacaoEtaria));

                                break;
                            case 2:
                                System.out.println("Insira o Volume: ");
                                volumes = scanner.nextInt();

                                System.out.println("Insira o Nome do Autor: ");
                                scanner.skip("\\R?");
                                autor = scanner.nextLine();

                                produtos.cadastrar(new Manga(produtos.incrementoId(), titulo, descricao, categoria, preco, tipo, estoque, volumes, autor));

                                break;
                            case 3:
                                System.out.println("Insira o Nome da Editora: ");
                                scanner.skip("\\R?");
                                editora = scanner.nextLine();

                                System.out.println("Insira o Número da Edição: ");
                                numEdicao = scanner.nextInt();

                                produtos.cadastrar(new Revista(produtos.incrementoId(), titulo, descricao, categoria, preco, tipo, estoque, editora, numEdicao));
                                System.out.println("Revista");

                                break;
                            case 4:
                                System.out.println("Insira o Nome do Autor: ");
                                scanner.skip("\\R?");
                                autor = scanner.nextLine();

                                System.out.println("Insira o Número de Páginas: ");
                                numPaginas = scanner.nextInt();

                                produtos.cadastrar(new Hq(produtos.incrementoId(), titulo, descricao, categoria, preco, tipo, estoque, autor, numPaginas));

                                break;
                            case 5:
                                System.out.println("Insira o Número de Edição: ");
                                scanner.skip("\\R?");
                                numEdicao = scanner.nextInt();

                                System.out.println("Insira o Nome da Editora: ");
                                editora = scanner.nextLine();

                                produtos.cadastrar(new Jornal(produtos.incrementoId(), titulo, descricao, categoria, preco, tipo, estoque, numEdicao, editora));

                                break;
                        }

                        keyPress();

                    } catch (InputMismatchException e) {
                        System.out.println("Erro ao inserir dados. Certifique-se de fornecer valores válidos.");
                        scanner.nextLine(); // Limpar buffer

                    } catch (Exception e) {
                        System.out.println("Erro inesperado ao cadastrar o produto: " + e.getMessage());
                        scanner.nextLine(); // Limpar buffer
                    }
                    break;

                case 2:
                    System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
                    System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Listar todos os Produtos do Sistema                                                  " + Cores.TEXT_RESET);
                    System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
                    produtos.listarTodos();
                    System.out.println();
                    keyPress();
                    break;
                case 3:
                    System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
                    System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Atualizar os Produtos do Sistema                                                     " + Cores.TEXT_RESET);
                    System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
                    System.out.println();

                    System.out.println("Insira o ID do produto: ");
                    id = scanner.nextInt();

                    if (produtos.buscarNaCollection(id) != null) {

                        System.out.println("Insira o Título do Produto: ");
                        scanner.skip("\\R");
                        titulo = scanner.nextLine();

                        System.out.println("Insira a Descrição do Produto: ");
                        descricao = scanner.nextLine();

                        System.out.println("Insira a Categoria do Produto (Ação, Terror, Comédia, Aventura, etc) : ");
                        categoria = scanner.nextLine();

                        System.out.println("Insira o preço do produto: ");
                        preco = scanner.nextDouble();

                        do {
                            System.out.println("Digite o tipo de Produto (Lívro, Mangá, Revista, HQ, Jornal): ");
                            scanner.nextLine(); // Limpar a linha pendente
                            String tipoInput = scanner.nextLine().toLowerCase(); // Lê e converte para minúsculas
                            if (tipoInput.equalsIgnoreCase("livro")) {
                                tipo = 1;
                            } else if (tipoInput.equalsIgnoreCase("manga")) {
                                tipo = 2;
                            } else if (tipoInput.equalsIgnoreCase("revista")) {
                                tipo = 3;
                            } else if (tipoInput.equalsIgnoreCase("hq")) {
                                tipo = 4;
                            } else if (tipoInput.equalsIgnoreCase("jornal")) {
                                tipo = 5;
                            } else {
                                tipo = 0; // Tipo inválido
                            }
                        } while (tipo < 1 || tipo > 5);

                        System.out.println("Insira a quantia de produtos no estoque: ");
                        estoque = scanner.nextInt();

                        tipo = produtos.retornaTipo(id);

                        switch (tipo) {
                            case 1 -> {
                                System.out.println("Insira o Nome do Autor do livro: ");
                                scanner.skip("\\R?");
                                autor = scanner.nextLine();

                                System.out.println("Insira a Editora do Livro: ");
                                editora = scanner.nextLine();

                                System.out.println("Insira o ano de Publicação (Apenas o ano): ");
                                anoPublicacao = scanner.nextLine();

                                System.out.println("Insira a Classificação Etária: ");
                                classificacaoEtaria = scanner.nextInt();

                                produtos.atualizar(new Livro(id, titulo, descricao, categoria, preco, tipo, estoque, autor, editora, anoPublicacao, classificacaoEtaria));

                            }
                            case 2 -> {
                                System.out.println("Insira o Volume: ");
                                volumes = scanner.nextInt();

                                System.out.println("Insira o Nome do Autor: ");
                                scanner.skip("\\R?");
                                autor = scanner.nextLine();

                                produtos.atualizar(new Manga(id, titulo, descricao, categoria, preco, tipo, estoque, volumes, autor));
                            }

                            case 3 -> {
                                System.out.println("Insira o Nome da Editora: ");
                                scanner.skip("\\R?");
                                editora = scanner.nextLine();

                                System.out.println("Insira o Número da Edição: ");
                                numEdicao = scanner.nextInt();

                                produtos.atualizar(new Revista(id, titulo, descricao, categoria, preco, tipo, estoque, editora, numEdicao));
                                System.out.println("Revista");

                            }

                            case 4 -> {
                                System.out.println("Insira o Nome do Autor: ");
                                scanner.skip("\\R?");
                                autor = scanner.nextLine();

                                System.out.println("Insira o Número de Páginas: ");
                                numPaginas = scanner.nextInt();

                                produtos.atualizar(new Hq(id, titulo, descricao, categoria, preco, tipo, estoque, autor, numPaginas));

                            }
                            case 5 -> {
                                System.out.println("Insira o Número de Edição: ");
                                scanner.skip("\\R?");
                                numEdicao = scanner.nextInt();

                                System.out.println("Insira o Nome da Editora: ");
                                editora = scanner.nextLine();

                                produtos.atualizar(new Jornal(id, titulo, descricao, categoria, preco, tipo, estoque, numEdicao, editora));

                            }
                            default -> {
                                System.out.println("Tipo de produto não encontrado!");
                            }
                        }

                    } else {
                        System.out.println("\nProduto não encontrado");
                    }

                    keyPress();
                    break;
                case 4:
                    System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
                    System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Deletar os Produtos do Sistema                                                       " + Cores.TEXT_RESET);
                    System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
                    System.out.println();
                    System.out.println("Digite o ID do produto: ");
                    id = scanner.nextInt();
                    produtos.deletar(id);
                    keyPress();
                    break;
                case 5:
                    System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
                    System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Consultar dados do produto - por ID                                                   " + Cores.TEXT_RESET);
                    System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
                    System.out.println();
                    System.out.println("Digite o ID do produto: ");
                    id = scanner.nextInt();
                    produtos.procurarPorId(id);
                    keyPress();
                    break;
                default:
                    System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
                    System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Opção Invalida!!                                                     " + Cores.TEXT_RESET);
                    System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
                    System.out.println();
                    break;
            }
        }

    }

    public static void keyPress() {

        try {
            System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Pressione Enter para Continuar...                                                    " + Cores.TEXT_RESET);
            System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
            System.in.read();

        } catch (IOException e) {
            System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
            System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Você pressionou uma tecla diferente de enter!                                        " + Cores.TEXT_RESET);
            System.out.println(Cores.ANSI_BLACK_BACKGROUND + "                                                                                     " + Cores.TEXT_RESET);
        }

    }


}
