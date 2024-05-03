public class ContaTerminal {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public Float saldo;

    public ContaTerminal(int numero, String agencia, String nomeCliente, Float saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + ", s seu saldo " + saldo + " já está disponível";
    }
}
