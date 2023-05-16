package controller.cadastros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utilities.Utilities;
import view.CadastroFuncionario;
import view.CadastroProduto;



public class ControllerCadastroProduto implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    CadastroProduto telaCadastroProduto;

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
    
    private void inicializeActionListener(){
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

        } else if (e.getSource() == this.telaCadastroProduto.getBtnCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroProduto.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroProduto.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroProduto.getBtnGravar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroProduto.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroProduto.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroProduto.getBtnBuscar()) {
           // BuscaBairro telaBuscaBairro = new BuscaBairro(null, true);
            //Inserir o controller da busca d bairros
            //telaBuscaBairro.setVisible(true);
            

        } else if (e.getSource() == this.telaCadastroProduto.getBtnSair()) {
            this.telaCadastroProduto.dispose();

        }
    }

}
