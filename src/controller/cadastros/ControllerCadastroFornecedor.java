package controller.cadastros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utilities.Utilities;
import view.CadastroCliente;
import view.CadastroEndereco;
import view.CadastroFornecedor;



public class ControllerCadastroFornecedor implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    CadastroFornecedor telaCadastroFornecedor;

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
    
    private void inicializeActionListener(){
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

        } else if (e.getSource() == this.telaCadastroFornecedor.getBtnCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroFornecedor.getBtnGravar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFornecedor.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroFornecedor.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroFornecedor.getBtnBuscar()) {
           // BuscaBairro telaBuscaBairro = new BuscaBairro(null, true);
            //Inserir o controller da busca d bairros
            //telaBuscaBairro.setVisible(true);
            

        } else if (e.getSource() == this.telaCadastroFornecedor.getBtnSair()) {
            this.telaCadastroFornecedor.dispose();

        }
    }

}
