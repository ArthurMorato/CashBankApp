import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Criação do banco e adição de um cliente
        Banco banco = new Banco(10000.0);
        Cliente cliente1 = new Cliente("Fulano", "123.456.789-10");
        banco.adicionarCliente(cliente1);

        // Criação da janela
        JFrame frame = new JFrame("CashBankApp");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Criação dos componentes da tela
        JLabel saldoLabel = new JLabel("Saldo do banco: R$ " + banco.verificarSaldo());
        JLabel clienteLabel = new JLabel("Clientes:");
        JTextArea clienteArea = new JTextArea(5, 20);
        JScrollPane clienteScroll = new JScrollPane(clienteArea);
        JButton adicionarClienteButton = new JButton("Adicionar cliente");

        // Adição dos componentes à tela
        JPanel panel = new JPanel();
        panel.add(saldoLabel);
        panel.add(clienteLabel);
        panel.add(clienteScroll);
        panel.add(adicionarClienteButton);
        frame.getContentPane().add(panel);

        // Adição dos clientes à área de texto
        for (Cliente cliente : banco.getClientes()) {
            clienteArea.append(cliente.getNome() + " (" + cliente.getCpf() + ")\n");
        }

        // Ação do botão de adicionar cliente
        adicionarClienteButton.addActionListener(e -> {
            String nome = JOptionPane.showInputDialog(frame, "Digite o nome do cliente:");
            String cpf = JOptionPane.showInputDialog(frame, "Digite o CPF do cliente:");
            Cliente novoCliente = new Cliente(nome, cpf);
            banco.adicionarCliente(novoCliente);
            clienteArea.append(novoCliente.getNome() + " (" + novoCliente.getCpf() + ")\n");
        });

        // Exibição da janela
        frame.setVisible(true);
    }
}
