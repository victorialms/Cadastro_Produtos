import java.util.ArrayList;
import java.util.List;

class Produto {
    private int codigo;
    private String nome;
    private int quantidade;

    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Quantidade: " + quantidade;
    }
}

class CadastroProdutos {
    private List<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(int codigo, String nome, int quantidade) {
        produtos.add(new Produto(codigo, nome, quantidade));
    }

    public void removerProdutoPorCodigo(int codigo) {
        produtos.removeIf(produto -> produto.getCodigo() == codigo);
    }

    public Produto buscarPorCodigo(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public Produto buscarPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
