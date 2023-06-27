package controller.cadastros;

import DAO.ClasseDados;
import static controller.cadastros.ControllerCadastroCidade.codigo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.bo.Cidade;
import model.bo.Produto;
import utilities.Utilities;
import view.Busca;
import view.CadastroProduto;

public class ControllerCadastroProduto implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    CadastroProduto telaCadastroProduto;
    public static Integer codigo;

    //Passando a tela que iremos controlar como parametro de invocação
    public ControllerCadastroProduto(CadastroProduto telaCadastroProduto) {
        //Repassando o valor(tela) do parâmetro para o objeto global
        this.telaCadastroProduto = telaCadastroProduto;

        //Adicionando ouvintes(Listeners) para escutar ações nos botões da tela
        inicializeActionListener();

        //Executando os métodos da classe de utilitários
        //para ativar/desativar/limpar botões e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroProduto.getPanelButtons());
        Utilities.limpaComponentes(false, this.telaCadastroProduto.getPanelCadastro());
    }

    private void inicializeActionListener() {
        this.telaCadastroProduto.getBtnNovo().addActionListener(this);
        this.telaCadastroProduto.getBtnSair().addActionListener(this);
        this.telaCadastroProduto.getBtnCancelar().addActionListener(this);
        this.telaCadastroProduto.getBtnGravar().addActionListener(this);
        this.telaCadastroProduto.getBtnBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroProduto.getBtnNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroProduto.getPanelButtons());
            Utilities.limpaComponentes(true, this.telaCadastroProduto.getPanelCadastro());
            this.telaCadastroProduto.getTxtId().setEnabled(false);

        } else if (e.getSource() == this.telaCadastroProduto.getBtnCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroProduto.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroProduto.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroProduto.getBtnGravar()) {
            Produto produto = new Produto();
            ClasseDados.getInstance();
            produto.setDescricao(this.telaCadastroProduto.getTxtObcervacao().getText());
            produto.setCodigoBarra(this.telaCadastroProduto.getTxtUF().getText());

            if (this.telaCadastroProduto.getTxtId().getText().equalsIgnoreCase("")) {
                produto.setId(ClasseDados.listaProduto.size() + 1);
                ClasseDados.listaProduto.add(produto);
            } else {
                produto.setId(Integer.parseInt(this.telaCadastroProduto.getTxtId().getText()));
                ClasseDados.listaProduto.remove(produto.getId() - 1);
                ClasseDados.listaProduto.add(produto.getId() - 1, produto);
            }
            utilities.Utilities.ativaDesativa(true, this.telaCadastroProduto.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroProduto.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroProduto.getBtnBuscar()) {
            codigo = 0;
            Busca telaBuscaBairro = new Busca(null, true, "produto");
            telaBuscaBairro.setVisible(true);

            if (codigo != 0) {
                Produto produto = new Produto();
                produto = DAO.ClasseDados.listaProduto.get(codigo - 1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroProduto.getPanelButtons());
                Utilities.limpaComponentes(true, this.telaCadastroProduto.getPanelCadastro());

                this.telaCadastroProduto.getTxtId().setText(produto.getId() + "");
                this.telaCadastroProduto.getTxtObcervacao().setText(produto.getDescricao());
                this.telaCadastroProduto.getTxtUF().setText(produto.getCodigoBarra());
                this.telaCadastroProduto.getTxtId().setEnabled(false);
            }

        } else if (e.getSource() == this.telaCadastroProduto.getBtnSair()) {
            this.telaCadastroProduto.dispose();

        }
    }

}
