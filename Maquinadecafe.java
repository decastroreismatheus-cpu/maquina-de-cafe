import javax.swing.JOptionPane;

public class Maquinadecafe {

    public static void main(String[] args) {

        int opcao;
        Drink bebida = null;

        do {

            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "=== MÁQUINA DE CAFÉ ===\n\n" +
                    "1 - Café com Leite\n" +
                    "2 - Cappuccino\n" +
                    "3 - Latte\n" +
                    "4 - Café Java\n" +
                    "5 - Chocolate\n" +
                    "6 - Café Forte\n" +
                    "0 - Sair"
            ));

            switch (opcao) {

                case 1:
                    bebida = new Cafe("Café com Leite", 5.00);
                    break;

                case 2:
                    bebida = new Cafe("Cappuccino", 6.50);
                    break;

                case 3:
                    bebida = new Cafe("Latte", 7.00);
                    break;

                case 4:
                    bebida = new Cafe("Café Java", 8.00);
                    break;

                case 5:
                    bebida = new Cafe("Chocolate", 6.00);
                    break;

                case 6:
                    bebida = new Cafe("Café Forte", 4.50);
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null,
                            "Obrigado por utilizar a Máquina de Café!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null,
                            "Opção inválida!");
                    break;
            }

            if (bebida != null && opcao != 0) {

                JOptionPane.showMessageDialog(
                        null,
                        "Bebida: " + bebida.nome +
                        "\nPreço: R$ " + bebida.preco
                );

                bebida.mostrarInfo();
            }

        } while (opcao != 0);
    }
}