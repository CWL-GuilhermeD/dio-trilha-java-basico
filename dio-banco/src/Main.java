public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();

        
        
        Conta cc = new ContaCorrente(cliente1);
        Conta cp = new ContaPoupanca(cliente1);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
