import java.util.ArrayList;

public class Banco {
    private double saldoInicial;
    private ArrayList<Cliente> clientes;
    private ArrayList<Funcionario> funcionarios;

    public Banco(double saldoInicial) {
        this.saldoInicial = saldoInicial;
        this.clientes = new ArrayList<Cliente>();
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double verificarSaldo() {
        return saldoInicial;
    }

    public void disponibilizarEmprestimo(Cliente cliente, double valor) {
        double custoEmprestimo = valor * 0.1;
        saldoInicial -= valor;
        cliente.adicionarDivida(valor + custoEmprestimo);
    }
}
