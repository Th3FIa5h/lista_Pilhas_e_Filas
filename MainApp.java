import estruturas.Documento;
import estruturas.EditorTextoPilha;
import estruturas.Fila;
import estruturas.FilaImpressao;
import estruturas.PilhaVetor;

public class MainApp
{
    public static void main(String[] args) 
    { 

        //Exercício 1-1 - Empilhar
        PilhaVetor pilha = new PilhaVetor();
        pilha.empilhar("Texto1");
        pilha.empilhar("Texto2");
        pilha.empilhar("Texto3");
        pilha.empilhar("Texto4");
        pilha.empilhar("Texto5");
        pilha.empilhar("Texto6");

        //Exercício 1-2 - Desempilhar
        pilha.desempilhar();

        //Exercício 1-3 - Verificar Pilha Vazia
        pilha.estaVazia();

        //Exercício 2 - Editor de Texto em Pilha
        EditorTextoPilha editor = new EditorTextoPilha();
        editor.inserirTexto("Inserindo Texto ");
        editor.mostrarTexto();

        editor.inserirTexto("Adicionando Mais Texto");
        editor.mostrarTexto();
        
        editor.desfazer();
        editor.mostrarTexto();

        editor.refazer();
        editor.mostrarTexto();
        
        editor.inserirTexto("Adicionando Novo Texto");
        editor.mostrarTexto();
        
        editor.desfazer();
        editor.desfazer();
        editor.desfazer();
        editor.desfazer();

        //Exercício 3-1 - Enfileirar
        Fila fila = new Fila();
        fila.enfileirar("1");
        fila.enfileirar("2");
        fila.enfileirar("3");
        fila.imprimirFila(); 

        //Exercício 3-2 - Desenfileirar
        fila.desenfileirar();
        fila.imprimirFila();

        //Exercício 3-3 - Verificar Pilha Vazia
        fila.estaVazia();
        fila.desenfileirar();
        fila.imprimirFila();
        fila.desenfileirar();
        fila.estaVazia();

        //Exercício 4 - Fila de Impressão e Documento 
        FilaImpressao filadeimpressao = new FilaImpressao(5);
        filadeimpressao.adicionarDocumento(new Documento("cardapiorestaurante.pdf", 1500));
        filadeimpressao.adicionarDocumento(new Documento("inventarioempresa.xslx", 50000));
        filadeimpressao.adicionarDocumento(new Documento("listadecompras.png", 350));
        filadeimpressao.mostrarFila();
        filadeimpressao.imprimirProximo();
        filadeimpressao.imprimirProximo();
        filadeimpressao.mostrarFila();
    }
}