# maquina-de-cafe
 # Avaliação P2 - Linguagem de Programação - Prof. Bruno Zolotareff

- Nome: Matheus de Castro Reis

- Máquina de café com POO. Resposta da pergunta:
- No desenvolvimento da aplicação da Máquina de Café foi utilizada a Programação Orientada a Objetos (POO) por meio de uma classe abstrata chamada Drink, uma classe concreta chamada Cafe e uma classe principal chamada Maquinadecafe, responsável pela execução do sistema e interação com o usuário.

**Encapsulamento**: O encapsulamento foi aplicado na classe Drink através dos atributos nome e preco, que representam as características de uma bebida. Esses atributos ficam centralizados na classe responsável pela bebida, permitindo organizar e controlar os dados do objeto.

**Herança**: A herança foi utilizada quando a classe Cafe herdou as características da classe abstrata Drink através da instrução:

public class Cafe extends Drink

Dessa forma, a classe Cafe reutiliza os atributos e comportamentos definidos em Drink, evitando repetição de código e facilitando a manutenção do sistema.

**Abstração**: A abstração foi aplicada por meio da classe abstrata Drink. Ela representa o conceito genérico de uma bebida, contendo informações comuns a qualquer café da máquina. Por ser abstrata, não pode ser instanciada diretamente, servindo apenas como modelo para as classes concretas.

**Polimorfismo**: O polimorfismo foi utilizado na declaração:

Drink bebida = new Cafe("Cappuccino", 6.50);

Nesse caso, a variável bebida é do tipo Drink, mas recebe um objeto da classe Cafe. Isso permite tratar diferentes tipos de bebidas de forma genérica.

Caso o sistema possuísse outras classes concretas, como Cappuccino, Latte ou Chocolate, seria possível utilizar a mesma variável Drink para armazenar qualquer uma dessas bebidas:

Drink bebida = new Cappuccino();
Drink bebida = new Latte();
Drink bebida = new Chocolate();

Assim, uma única referência poderia assumir comportamentos diferentes dependendo do objeto criado, caracterizando o polimorfismo.

Além dos conceitos de POO, o sistema utiliza um laço de repetição do tipo do...while para manter o menu da máquina de café em funcionamento até que o usuário escolha a opção de sair. Dessa forma, a aplicação demonstra os conceitos de abstração, encapsulamento, herança e polimorfismo em uma simulação prática de uma máquina de café com seis sabores.

