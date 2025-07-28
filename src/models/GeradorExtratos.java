package models;
import interfaces.Conta;

public class GeradorExtratos {
    public void geradorConta(Conta conta){
        System.out.println("Saldo atual: " + conta.getSaldo());
        System.out.println("Operações realizadas: ");
        conta.getTransacoes();
    }

}
