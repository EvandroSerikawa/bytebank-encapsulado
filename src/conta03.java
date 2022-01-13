public class conta03 {

    // Conta02 TODA CONTA TEM UMA REFERÊNCIA A UM CLIENTE ( LIGAÇÃO ).

    private double saldo = 100; // Exemplos de valores Default
    // criar um método getSaldo para poder imprimir o saldo da conta
    private int agencia;
    private int conta;
    //String titular; Substiuir o tipo String pelo nome da classe cliente para fazer a ligação das classes
    // Atribuir a referencia (flecha ) de titular para cliente.
    private cliente03 titular;// = new cliente(); ex: sempre que alguem abrir uma conta já cria um novo cliente por Default
    // Titular recebe os parametros da classe cliente
    private static int total ; // atributo criado para contar a quantidade de contas criadas
    // Parametro da classe e não do Objeto - atributo compartilhado DA CLASSE



    // CRIAR UM CONSTRUTOR - Caso o construtor nao seja construido o Java cria um construtor padrão
    public conta03 ( int agencia , int conta ){
        conta03.total ++;
        System.out.println("O total de contas criadas é de: " + total );

        this.agencia = agencia;
        this.conta = conta;

        System.out.println("Estou criando a sua conta: " + this.conta );
    }




    // Métodos - Comportamentos do Objeto

    // o que ele devolve ( void )
    // o que ele recebe ( double )
    public void deposita( double valor ){
        this.saldo += valor;

    }

    // Retorna um booleano confirmando se o saque é TRUE ou FALSE
    public boolean saca ( double valor ){
        if( this.saldo >= valor ){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean transfere(double valor  , conta03 destino ){
        if( this.saldo >= valor ){
            this.saldo -= valor;
            // destino.deposita(valor);
            return true;
        }
        else{
            return false;
        }
        // Mostra o saldo sem o acesso direto ao atributo.
        // Mostra somente o parametro criado no método mostraSaldo
        }

        public double getSaldo() {
            return this.saldo;
            }
        //Não há necessidade de ter um setSlado nessa situação.
        public int getAgencia(){
            return this.agencia;
            }
        public void setAgencia(int novaAgencia){
            if ( novaAgencia <= 0 ){
                System.out.println("Valor inválido.");
                return; // Para a execução ( não precisa do Else )
            }
            this.agencia = novaAgencia;
            }
        public int getConta(){
            return this.conta;
            }
        public void setConta(int novaConta) {
            if( novaConta <= 0 ){
                System.out.println("Valor Invalido.");
                return;
            }
            this.conta = conta;
            }

        public cliente03 getTitular() {
            return titular;
        }

        public void setTitular(cliente03 titular) {
                this.titular = titular;
                }
        public static int getTotal(){
                return conta03.total;
        }

}

