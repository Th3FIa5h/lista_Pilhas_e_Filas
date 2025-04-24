package estruturas;

public class PilhaVetor {

    private String[] elementos;
    private int topo;
    private int capacidade;


    public PilhaVetor(){
        this.capacidade = 10;
        this.elementos = new String[this.capacidade];
        this.topo = -1;
    }    


    // Exercício 1-1 - Empilhar
    public void empilhar(String elemento){
        topo++;
        elementos[topo] = elemento;
    }

    //Exercício 1-2 - Desempilhar
    public String desempilhar() {
        if (topo >= 0) {
        String elemento = elementos[topo];
        topo --;
        return elemento;
        }else {
        throw new IllegalStateException("Pilha está vazia");
        }
    }

    //Exercício 1-3 - Verificar Pilha Vazia
    public void estaVazia(){
        if(topo <= 0){
            System.out.println("A pilha está vazia");
        }
        else{
            System.out.println("A pilha não está vazia");
        }
    }

    public void limpar(){
        topo = -1;
    }
}