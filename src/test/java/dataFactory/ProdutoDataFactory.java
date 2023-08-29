package dataFactory;

import pojo.ComponetePojo;
import pojo.ProdutoPojo;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static ProdutoPojo criarProdutoComumComOValorIgualA(double valor){
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("PlayNovo2023");
        produto.setProdutoValor(valor);

        List<String> cores = new ArrayList<>();
        cores.add("preto");
        cores.add("branco");

        produto.setProdutoCores(cores);
        produto.setProdutoUrlMock("");

        List<ComponetePojo> componentes = new ArrayList<>();

        ComponetePojo componete = new ComponetePojo();
        componete.setComponenteNome("Controle");
        componete.setComponenteQuantidade(1);
        componentes.add(componete);

        ComponetePojo segundocomponete = new ComponetePojo();
        segundocomponete.setComponenteNome("Memory Card");
        segundocomponete.setComponenteQuantidade(2);
        componentes.add(segundocomponete);

        produto.setComponentes(componentes);
        return produto;
    }
}
