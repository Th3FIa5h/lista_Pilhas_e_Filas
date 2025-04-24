package estruturas;


//Exercício 2 - Editor de Texto em Pilha
public class EditorTextoPilha {
    private PilhaVetor pilhaDesfazer = new PilhaVetor();
    private PilhaVetor pilhaRefazer = new PilhaVetor();
    String textoAtual = "";

    public void inserirTexto(String novoTexto) {
        pilhaDesfazer.empilhar(textoAtual);
        pilhaRefazer = new PilhaVetor();
        textoAtual += novoTexto;
    }

    public void desfazer() {
        if (pilhaDesfazer != null) {
            pilhaRefazer.empilhar(textoAtual);
            textoAtual = pilhaDesfazer.desempilhar();
        } else {
            System.out.println("Pilha vazia");
        }
    }

    public void refazer() {
        if (pilhaRefazer != null) {
            pilhaDesfazer.empilhar(textoAtual);
            textoAtual = pilhaRefazer.desempilhar();
        } else {
            System.out.println("Não tem o que refazer");
        }
    }

    public void mostrarTexto() {
        System.out.println(textoAtual);
    }
}