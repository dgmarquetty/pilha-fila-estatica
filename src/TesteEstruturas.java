public class TesteEstruturas {
    public static void main(String[] args) {

        System.out.println("Testando Pilha:");
        Pilha pilha = new Pilha();
        pilha.insere(10);
        pilha.insere(20);
        pilha.insere(30);
        pilha.imprime();

        System.out.println("Removendo do topo da pilha: " + pilha.remove());
        pilha.imprime();

        System.out.println("\nTestando Fila:");
        Fila fila = new Fila();
        fila.insere(1);
        fila.insere(2);
        fila.insere(3);
        fila.imprime();

        System.out.println("Removendo da frente da fila: " + fila.remove());
        fila.imprime();
    }
}
