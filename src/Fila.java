public class Fila {
    private static final int MAX = 5;
    private int[] fila;
    private int inicio;
    private int fim;

    public Fila() {
        fila = new int[MAX];
        inicio = 0;
        fim = 0;
    }

    public boolean cheia() {
        return (fim + 1) % MAX == inicio;
    }

    public boolean vazia() {
        return inicio == fim;
    }

    public void insere(int elemento) {
        if (cheia()) {
            System.out.println("Erro: Fila cheia");
            return;
        }
        fila[fim] = elemento;
        fim = (fim + 1) % MAX;
    }

    public int remove() {
        if (vazia()) {
            System.out.println("Erro: Fila vazia");
            return -1;
        }
        int elemento = fila[inicio];
        inicio = (inicio + 1) % MAX;
        return elemento;
    }

    public void imprime() {
        System.out.print("Fila: ");
        int i = inicio;
        while (i != fim) {
            System.out.print(fila[i] + " ");
            i = (i + 1) % MAX;
        }
        System.out.println();
    }
}
