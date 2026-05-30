public abstract class Drink {

    protected String nome;
    protected double preco;

    public Drink(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract void mostrarInfo();
}