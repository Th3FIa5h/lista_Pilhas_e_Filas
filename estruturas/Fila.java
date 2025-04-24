package estruturas;

public class Fila {
    private String[] elementos;
    private int capacidade;
    private int comeco;
    private int topo;

    public Fila() {
        this.capacidade = 10;
        this.elementos = new String[this.capacidade];
        this.comeco = 0;
        this.topo = 0;
    }

    //Exercício 3-1 - Enfileirar
    public void enfileirar(String elemento) {
        if (topo >= capacidade) {
            System.out.println("Fila cheia");
        }
        elementos[topo] = elemento;
        topo++;
    }

    //Exercício 3-2 - Desenfileirar
    public String desenfileirar() {
        if (comeco < topo) {
            String elemento = elementos[comeco];
            comeco++;
            return elemento;
        } else {
            throw new IllegalStateException("Fila vazia");
        }
    }

    //Exercício 3-3 - Verificar Fila Vazia
    public void estaVazia() {
        if (comeco == topo) {
            System.out.println("Fila vazia");
        } else {
            System.out.println("Fila não está vazia");
        }
    }

    public void imprimirFila() {
        if (comeco == topo) {
            System.out.println("Fila vazia.");
        } else {
            System.out.print("Fila: ");
            for (int i = comeco; i < topo; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}