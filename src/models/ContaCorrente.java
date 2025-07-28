package models;
import java.util.ArrayList;


public class ContaCorrente implements Conta{
    private double saldo;
    private double taxaOp = 0.45;
    private ArrayList<String> transacoes = new ArrayList<String>();

    @Override
    public void depositar(double valor){
        this.saldo += valor - taxaOp;
        String transacao = "Depósito: +R$" + valor;
        transacoes.add(transacao);
    }

    @Override
    public void sacar(double valor){
        this.saldo -= valor + taxaOp;
        String transacao = "Saque: -R$" + valor;
        transacoes.add(transacao);
    }

    @Override
    public double getSaldo(){
        return this.saldo;
    }

    @Override
    public String toString(){
        return "Conta corrente - Saldo: " + this.getSaldo();
    }

    @Override
    public void getTransacoes(){
        for(String transacao : this.transacoes){
            System.out.println(transacao);
        }
    }
}
