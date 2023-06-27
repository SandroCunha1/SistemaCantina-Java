package controller.cadastros;

import DAO.ClasseDados;
import static controller.cadastros.ControllerCadastroFornecedor.codigo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.bo.Fornecedor;
import utilities.Utilities;
import view.Busca;
import view.CadastroFornecedor;

public class ControllerCadastroFornecedor implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    CadastroFornecedor telaCadastroFornecedor;
    public static Integer codigo;

    //Passando a tela que iremos controlar como parametro de invocação
    public ControllerCadastroFornecedor(CadastroFornecedor telaCadastroFornecedor) {
        //Repassando o valor(tela) do parâmetro para o objeto global
        this.telaCadastroFornecedor = telaCadastroFornecedor;

        //Adicionando ouvintes(Listeners) para escutar ações nos botões da tela
        inicializeActionListener();

        //Executando os métodos da classe de utilitários
        //para ativar/desativar/limpar botões e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getPanelButtons());
        Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getPanelCadastro());
    }

    private void inicializeActionListener() {
        this.telaCadastroFornecedor.getBtnNovo().addActionListener(this);
        this.telaCadastroFornecedor.getBtnSair().addActionListener(this);
        this.telaCadastroFornecedor.getBtnCancelar().addActionListener(this);
        this.telaCadastroFornecedor.getBtnGravar().addActionListener(this);
        this.telaCadastroFornecedor.getBtnBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroFornecedor.getBtnNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroFornecedor.getPanelButtons());
            Utilities.limpaComponentes(true, this.telaCadastroFornecedor.getPanelCadastro());
            this.telaCadastroFornecedor.getTxtId().setEnabled(false);
        } else if (e.getSource() == this.telaCadastroFornecedor.getBtnCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroFornecedor.getBtnGravar()) {
            Fornecedor fornecedor = new Fornecedor();
            ClasseDados.getInstance();
            fornecedor.setRazaoSocial(this.telaCadastroFornecedor.getTxtRazao().getText());
            fornecedor.setCnpj(this.telaCadastroFornecedor.getTxtCNPJ().getText());
            fornecedor.setInscricaoEstadual(this.telaCadastroFornecedor.getTxtInscricao().getText());
            fornecedor.setNome(this.telaCadastroFornecedor.getTxtNome().getText());
            fornecedor.setEmail(this.telaCadastroFornecedor.getTxtEmail().getText());
            fornecedor.setComplementoEndereco(this.telaCadastroFornecedor.getTxtComplemento().getText());
            fornecedor.setFone1(this.telaCadastroFornecedor.getTxtFone1().getText());
            fornecedor.setFone2(this.telaCadastroFornecedor.getTxtFone2().getText());
            if (this.telaCadastroFornecedor.getTxtId().getText().equalsIgnoreCase("")) {
                fornecedor.setId(ClasseDados.listaFornecedor.size() + 1);
                ClasseDados.listaFornecedor.add(fornecedor);
            } else {
                fornecedor.setId(Integer.parseInt(this.telaCadastroFornecedor.getTxtId().getText()));
                ClasseDados.listaFornecedor.remove(fornecedor.getId() - 1);
                ClasseDados.listaFornecedor.add(fornecedor.getId() - 1, fornecedor);
            }
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroFornecedor.getBtnBuscar()) {
            codigo = 0;
            Busca telaBuscaBairro = new Busca(null, true, "fornecedor");
            telaBuscaBairro.setVisible(true);

            if (codigo != 0) {
                Fornecedor fornecedor = new Fornecedor();
                fornecedor = DAO.ClasseDados.listaFornecedor.get(codigo - 1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroFornecedor.getPanelButtons());
                Utilities.limpaComponentes(true, this.telaCadastroFornecedor.getPanelCadastro());

                this.telaCadastroFornecedor.getTxtId().setText(fornecedor.getId() + "");
                this.telaCadastroFornecedor.getTxtRazao().setText(fornecedor.getRazaoSocial());
                this.telaCadastroFornecedor.getTxtCNPJ().setText(fornecedor.getCnpj());
                this.telaCadastroFornecedor.getTxtInscricao().setText(fornecedor.getInscricaoEstadual());
                this.telaCadastroFornecedor.getTxtNome().setText(fornecedor.getNome());
                this.telaCadastroFornecedor.getTxtEmail().setText(fornecedor.getEmail());
                this.telaCadastroFornecedor.getTxtCEP().setText(fornecedor.getEndereco().getCep());
                this.telaCadastroFornecedor.getTxtComplemento().setText(fornecedor.getComplementoEndereco());
                this.telaCadastroFornecedor.getTxtLogradouro().setText(fornecedor.getEndereco().getLogradouro());
                this.telaCadastroFornecedor.getTxtFone1().setText(fornecedor.getFone1());
                this.telaCadastroFornecedor.getTxtFone2().setText(fornecedor.getFone2());
                this.telaCadastroFornecedor.getTxtBairro().setText(fornecedor.getEndereco().getBairro().getDescricao());
                this.telaCadastroFornecedor.getTxtCidade().setText(fornecedor.getEndereco().getCidade().getDescricao());

                this.telaCadastroFornecedor.getTxtId().setEnabled(false);
                this.telaCadastroFornecedor.getTxtBairro().setEnabled(false);
                this.telaCadastroFornecedor.getTxtCidade().setEnabled(false);
                this.telaCadastroFornecedor.getTxtLogradouro().setEnabled(false);

            }
        } else if (e.getSource() == this.telaCadastroFornecedor.getBtnSair()) {
            this.telaCadastroFornecedor.dispose();

        }
    }

}
