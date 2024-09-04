public class App {
    public static void main(String[] args) throws Exception {
       Conta cc =  new ContaCorrente();
       Conta cp =  new ContaPoupanca();
       
       
       cc.imprimirExtrato();
       cp.imprimirExtrato();
       
    }
}
