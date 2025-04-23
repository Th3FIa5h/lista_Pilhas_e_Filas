package estruturas;

public class PilhaVetor {

    private int[] elementos;
    private int topo;
    private int capacidade;


    public PilhaVetor(){
        this.capacidade = 10;
        this.elementos = new int[this.capacidade];
        this.topo = -1;
    }

    private void aumentarCapacidade() {
        int novaCapacidade = capacidade * 2;
        int[] novoVetor = new int[novaCapacidade];
    
        for (int i = 0; i < capacidade; i++) {
            novoVetor[i] = elementos[i];
        }
    
        elementos = novoVetor;
        capacidade = novaCapacidade;
    }
    

    public void empilhar(int elemento){
        if(topo >= capacidade - 1) {
            aumentarCapacidade();
        }
        topo++;
        elementos[topo] = elemento;
    }

    public int desempilhar() {
        if (topo >= 0) {
        int elemento = elementos[topo];
        topo --;
        return elemento;
        }else {
        throw new IllegalStateException("Pilha está vazia");
        }
    }
    
}
