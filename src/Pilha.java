public class Pilha {
    private static final int MAX = 5;
    private int[] pilha;
    private int topo;

    public Pilha() {
        pilha = new int[MAX];
        topo = -1;
    }

    public boolean cheia() {
        return topo == MAX - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public void insere(int elemento) {
        if (cheia()) {
            System.out.println("Erro: Pilha cheia");
            return;
        }
        topo++;
        pilha[topo] = elemento;
    }

    public int remove() {
        if (vazia()) {
            System.out.println("Erro: Pilha vazia");
            return -1;
        }
        int elemento = pilha[topo];
        topo--;
        return elemento;
    }

    public void imprime() {
        System.out.print("Pilha: ");
        for (int i = 0; i <= topo; i++) {
            System.out.print(pilha[i] + " ");
        }
        System.out.println();
    }
}
