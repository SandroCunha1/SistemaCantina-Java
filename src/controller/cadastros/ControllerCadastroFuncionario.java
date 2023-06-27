package controller.cadastros;

import DAO.ClasseDados;
import static controller.cadastros.ControllerCadastroCliente.codigo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.bo.Cliente;
import model.bo.Funcionario;
import utilities.Utilities;
import view.Busca;
import view.CadastroFuncionario;

public class ControllerCadastroFuncionario implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    CadastroFuncionario telaCadastroFuncionario;
    public static Integer codigo;

    //Passando a tela que iremos controlar como parametro de invocação
    public ControllerCadastroFuncionario(CadastroFuncionario telaCadastroFuncionario) {
        //Repassando o valor(tela) do parâmetro para o objeto global
        this.telaCadastroFuncionario = telaCadastroFuncionario;

        //Adicionando ouvintes(Listeners) para escutar ações nos botões da tela
        inicializeActionListener();

        //Executando os métodos da classe de utilitários
        //para ativar/desativar/limpar botões e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getPanelButtons());
        Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getPanelCadastro());
    }

    private void inicializeActionListener() {
        this.telaCadastroFuncionario.getBtnNovo().addActionListener(this);
        this.telaCadastroFuncionario.getBtnSair().addActionListener(this);
        this.telaCadastroFuncionario.getBtnCancelar().addActionListener(this);
        this.telaCadastroFuncionario.getBtnGravar().addActionListener(this);
        this.telaCadastroFuncionario.getBtnBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroFuncionario.getBtnNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroFuncionario.getPanelButtons());
            Utilities.limpaComponentes(true, this.telaCadastroFuncionario.getPanelCadastro());
            this.telaCadastroFuncionario.getTxtId().setEnabled(false);
        } else if (e.getSource() == this.telaCadastroFuncionario.getBtnCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroFuncionario.getBtnGravar()) {
            Funcionario funcionario = new Funcionario();
            ClasseDados.getInstance();
            funcionario.setUsuario(this.telaCadastroFuncionario.getTxtUsuario().getText());
            funcionario.setSenha(String.valueOf(this.telaCadastroFuncionario.getPasswordField().getPassword()));
            funcionario.setDataNascimento(this.telaCadastroFuncionario.getTxtAniver().getText());
            funcionario.setCpf(this.telaCadastroFuncionario.getTxtCPF().getText());
            funcionario.setNome(this.telaCadastroFuncionario.getTxtNome().getText());
            funcionario.setEmail(this.telaCadastroFuncionario.getTxtEmail().getText());
            funcionario.setComplementoEndereco(this.telaCadastroFuncionario.getTxtComplemento().getText());
            funcionario.setRg(this.telaCadastroFuncionario.getTxtRG().getText());
            funcionario.setFone1(this.telaCadastroFuncionario.getTxtFone1().getText());
            funcionario.setFone2(this.telaCadastroFuncionario.getTxtFone2().getText());
            if (this.telaCadastroFuncionario.getTxtId().getText().equalsIgnoreCase("")) {
                funcionario.setId(ClasseDados.listaFuncionario.size() + 1);
                ClasseDados.listaFuncionario.add(funcionario);
            } else {
                funcionario.setId(Integer.parseInt(this.telaCadastroFuncionario.getTxtId().getText()));
                ClasseDados.listaFuncionario.remove(funcionario.getId() - 1);
                ClasseDados.listaFuncionario.add(funcionario.getId() - 1, funcionario);
            }
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroFuncionario.getBtnBuscar()) {
            codigo = 0;
            Busca telaBuscaBairro = new Busca(null, true, "funcionario");
            telaBuscaBairro.setVisible(true);

            if (codigo != 0) {
                Funcionario funcionario = new Funcionario();
                funcionario = DAO.ClasseDados.listaFuncionario.get(codigo - 1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroFuncionario.getPanelButtons());
                Utilities.limpaComponentes(true, this.telaCadastroFuncionario.getPanelCadastro());

                this.telaCadastroFuncionario.getTxtId().setText(funcionario.getId() + "");
                this.telaCadastroFuncionario.getTxtUsuario().setText(funcionario.getUsuario());
                this.telaCadastroFuncionario.getPasswordField().setText(funcionario.getSenha());
                this.telaCadastroFuncionario.getPasswordConfirmField().setText(funcionario.getSenha());
                this.telaCadastroFuncionario.getTxtAniver().setText(funcionario.getDataNascimento());
                this.telaCadastroFuncionario.getTxtCPF().setText(funcionario.getCpf());
                this.telaCadastroFuncionario.getTxtNome().setText(funcionario.getNome());
                this.telaCadastroFuncionario.getTxtEmail().setText(funcionario.getEmail());
                this.telaCadastroFuncionario.getTxtCEP().setText(funcionario.getEndereco().getCep());
                this.telaCadastroFuncionario.getTxtComplemento().setText(funcionario.getComplementoEndereco());
                this.telaCadastroFuncionario.getTxtRG().setText(funcionario.getRg());
                this.telaCadastroFuncionario.getTxtLogradouro().setText(funcionario.getEndereco().getLogradouro());
                this.telaCadastroFuncionario.getTxtFone1().setText(funcionario.getFone1());
                this.telaCadastroFuncionario.getTxtFone2().setText(funcionario.getFone2());
                this.telaCadastroFuncionario.getTxtBairro().setText(funcionario.getEndereco().getBairro().getDescricao());
                this.telaCadastroFuncionario.getTxtCidade().setText(funcionario.getEndereco().getCidade().getDescricao());

                this.telaCadastroFuncionario.getTxtId().setEnabled(false);
                this.telaCadastroFuncionario.getTxtBairro().setEnabled(false);
                this.telaCadastroFuncionario.getTxtCidade().setEnabled(false);
                this.telaCadastroFuncionario.getTxtLogradouro().setEnabled(false);

            }
        } else if (e.getSource() == this.telaCadastroFuncionario.getBtnSair()) {
            this.telaCadastroFuncionario.dispose();

        }

    }
}
