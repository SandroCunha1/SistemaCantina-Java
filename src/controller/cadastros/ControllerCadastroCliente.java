package controller.cadastros;

import DAO.ClasseDados;
import static controller.cadastros.ControllerCadastroCidade.codigo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import model.bo.Cidade;
import model.bo.Cliente;
import utilities.Utilities;
import view.Busca;
import view.CadastroCliente;

public class ControllerCadastroCliente implements ActionListener, MouseListener, MouseMotionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    CadastroCliente telaCadastroCliente;
    public static Integer codigo;

    //Passando a tela que iremos controlar como parametro de invocação
    public ControllerCadastroCliente(CadastroCliente telaCadastroCliente) {
        //Repassando o valor(tela) do parâmetro para o objeto global
        this.telaCadastroCliente = telaCadastroCliente;

        //Adicionando ouvintes(Listeners) para escutar ações nos botões da tela
        inicializeActionListener();

        //Executando os métodos da classe de utilitários
        //para ativar/desativar/limpar botões e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getPanelButtons());
        Utilities.limpaComponentes(false, this.telaCadastroCliente.getPanelCadastro());
    }

    private void inicializeActionListener() {
        this.telaCadastroCliente.getBtnNovo().addActionListener(this);
        this.telaCadastroCliente.getBtnSair().addActionListener(this);
        this.telaCadastroCliente.getBtnCancelar().addActionListener(this);
        this.telaCadastroCliente.getBtnGravar().addActionListener(this);
        this.telaCadastroCliente.getBtnBuscar().addActionListener(this);
        this.telaCadastroCliente.getPanelTitulo().addMouseListener(this);
        this.telaCadastroCliente.getPanelTitulo().addMouseMotionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroCliente.getBtnNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCliente.getPanelButtons());
            Utilities.limpaComponentes(true, this.telaCadastroCliente.getPanelCadastro());
            this.telaCadastroCliente.getTxtId().setEnabled(false);

        } else if (e.getSource() == this.telaCadastroCliente.getBtnCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroCliente.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroCliente.getBtnGravar()) {
            Cliente cliente = new Cliente();
            ClasseDados.getInstance();
            cliente.setId(ClasseDados.listaCliente.size() + 1);
            cliente.setMatricula(this.telaCadastroCliente.getTxtMatricula().getText());
            cliente.setDataNascimento(this.telaCadastroCliente.getTxtAniver().getText());
            cliente.setCpf(this.telaCadastroCliente.getTxtCPF().getText());
            cliente.setNome(this.telaCadastroCliente.getTxtNome().getText());
            cliente.setEmail(this.telaCadastroCliente.getTxtEmail().getText());
            cliente.setComplementoEndereco(this.telaCadastroCliente.getTxtComplemento().getText());
            cliente.setRg(this.telaCadastroCliente.getTxtRG().getText());
            cliente.setFone1(this.telaCadastroCliente.getTxtFone1().getText());
            cliente.setFone2(this.telaCadastroCliente.getTxtFone2().getText());
           

            if (this.telaCadastroCliente.getTxtId().getText().equalsIgnoreCase("")) {
                ClasseDados.getInstance().listaCliente.add(cliente);
            } else {
                cliente.setId(Integer.parseInt(this.telaCadastroCliente.getTxtId().getText()));
                ClasseDados.listaCliente.remove(cliente.getId() - 1);
                ClasseDados.listaCliente.add(cliente.getId() - 1, cliente);
            }
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroCliente.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroCliente.getBtnBuscar()) {
            codigo = 0;
            Busca telaBuscaBairro = new Busca(null, true, "cliente");
            telaBuscaBairro.setVisible(true);

            if (codigo != 0) {
                Cliente cliente = new Cliente();
                cliente = DAO.ClasseDados.listaCliente.get(codigo - 1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroCliente.getPanelButtons());
                Utilities.limpaComponentes(true, this.telaCadastroCliente.getPanelCadastro());

                this.telaCadastroCliente.getTxtId().setText(cliente.getId() + "");
                this.telaCadastroCliente.getTxtMatricula().setText(cliente.getMatricula());
                this.telaCadastroCliente.getTxtAniver().setText(cliente.getDataNascimento());
                this.telaCadastroCliente.getTxtCPF().setText(cliente.getCpf());
                this.telaCadastroCliente.getTxtNome().setText(cliente.getNome());
                this.telaCadastroCliente.getTxtEmail().setText(cliente.getEmail());
                this.telaCadastroCliente.getTxtCEP().setText(cliente.getEndereco().getCep());
                this.telaCadastroCliente.getTxtComplemento().setText(cliente.getComplementoEndereco());
                this.telaCadastroCliente.getTxtRG().setText(cliente.getRg());
                this.telaCadastroCliente.getTxtLogradouro().setText(cliente.getEndereco().getLogradouro());
                this.telaCadastroCliente.getTxtFone1().setText(cliente.getFone1());
                this.telaCadastroCliente.getTxtFone2().setText(cliente.getFone2());
                this.telaCadastroCliente.getTxtBairro().setText(cliente.getEndereco().getBairro().getDescricao());
                this.telaCadastroCliente.getTxtCidade().setText(cliente.getEndereco().getCidade().getDescricao());

                this.telaCadastroCliente.getTxtId().setEnabled(false);
                this.telaCadastroCliente.getTxtBairro().setEnabled(false);
                this.telaCadastroCliente.getTxtCidade().setEnabled(false);
                this.telaCadastroCliente.getTxtLogradouro().setEnabled(false);

            }
        } else if (e.getSource() == this.telaCadastroCliente.getBtnSair()) {
            this.telaCadastroCliente.dispose();

        }

    }
    int mouseX, mouseY;

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == this.telaCadastroCliente.getPanelTitulo()) {
            mouseX = e.getX();
            mouseY = e.getY();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getSource() == this.telaCadastroCliente.getPanelTitulo()) {
            this.telaCadastroCliente.setLocation(this.telaCadastroCliente.getX() + e.getX() - mouseX, this.telaCadastroCliente.getY() + e.getY() - mouseY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}
