public class testavalores {
    public static void main(String[] args) {


       conta03 novaConta04 = new conta03( 1337 , 24226);

       System.out.println("Agencia: " + novaConta04.getAgencia());
       System.out.println("Cocnta: " + novaConta04.getConta());
       System.out.println("Saldo Inicial:" + novaConta04.getSaldo());

       //novaConta04.setAgencia(-50); // Retorna como valor invalido ( if setAgencia )
       //System.out.println();

       conta03 novaConta05 = new conta03( 1337 , 16549 );
       System.out.println("Agencia: " + novaConta05.getConta());
       System.out.println("Conta: " + novaConta05.getConta());
       System.out.println("Saldo Inicial: "+ novaConta05.getSaldo());

       System.out.println("Total de contas criadas: " + conta03.getTotal());

    }
}
