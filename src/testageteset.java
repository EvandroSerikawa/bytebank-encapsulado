public class testageteset {
    public static void main(String[] args) {

        conta03 conta03 = new conta03(1337 , 24226 );
        // conta.numero = 7831; Não compila, o atributo está encapsulado.
        // utilizar o método Set para a alteração.

        //conta03.setAgencia(1337); - Valores definidos no Construtor
        //System.out.println(conta03.getAgencia());

        cliente03 novoCliente04 = new cliente03();
        //conta03.titular = nomeCliente03

        novoCliente04.setNome("Evandro Serikawa ");
        conta03.setTitular(novoCliente04);

        System.out.println(conta03.getTitular().getNome());

        conta03.getTitular().setProfissão("Programador"); // Selecionar a conta ( GET ) e seta a profissão
        System.out.println(conta03.getTitular().getProfissão());

        //Exemplo em duas linhas
        cliente03 titularDaConta = conta03.getTitular();
        titularDaConta.setProfissão("Coder Java");

        System.out.println(conta03.getTitular().getProfissão());

        //Impressão da referencia - posição da memória
        System.out.println(titularDaConta);
        System.out.println(conta03.getTitular());
        System.out.println(novoCliente04);

    }
}
