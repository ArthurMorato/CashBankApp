public class Cliente {
    private String nome;
    private String cpf;
    private double saldoContaCorrente;
    private double divida;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldoContaCorrente = 0;
        this.divida = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldoContaCorrente() {
        return saldoContaCorrente;
    }

    public void setSaldoContaCorrente(double saldoContaCorrente) {
        this.saldoContaCorrente = saldoContaCorrente;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public void abrirConta() {
        saldoContaCorrente += 100.0;
    }

    public void depositar(double valor) {
        saldoContaCorrente += valor;
    }

    public double verificarSaldo() {
        return saldoContaCorrente;
    }

    public boolean sacar(double valor) {
        if (valor <= saldoContaCorrente) {
            saldoContaCorrente -= valor;
            return true;
        }
        return false;
    }

    public void pedirEmprestimo(Banco banco, double valor) {
        banco.disponibilizarEmprestimo(this, valor);
    }

    public void adicionarDivida(double valor) {
        divida += valor;
    }

    public double getDivida() {
        return divida;
    }
}
