public class ContaCorrente extends Conta {
    


    @Override
    public void imprimirExtrato() {
       System.out.println("=== Extrato da conta conrrente ===");
       System.out.println(String.format("Agencia: %d", super.agencia));
       System.out.println(String.format("Conta: %d", super.numero));
       System.out.println(String.format("Saldo: %.2f", super.saldo));
    }


}
