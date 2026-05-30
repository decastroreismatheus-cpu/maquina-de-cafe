public class Cafe extends Drink {

    public Cafe(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Bebida: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}