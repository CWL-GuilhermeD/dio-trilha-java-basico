public abstract class Conta implements IConta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    private static final int AGENCIA_PADRAO = 1;
    protected Cliente cliente;

    private static int SEQUENCIAL = 1;
    
    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    
    @Override
    public void depositar(double valor) {
        this.saldo += valor;

    }
    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        
    }
    @Override
    public void trasnferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
        
    }

    protected void imprimirInformacoes(){
        System.out.println(String.format("Nome: %s", cliente.getNome()));
        System.out.println(String.format("Sobrenome: %s", cliente.getSobreNome()));
        System.out.println(String.format("CPF: %s", cliente.getCpf()));
        System.out.println(String.format("Idade: %d", cliente.getIdade()));
        System.out.println(String.format("CEP: ", cliente.getCep()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}