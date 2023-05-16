package controller.cadastros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utilities.Utilities;
import view.CadastroCliente;
import view.CadastroEndereco;



public class ControllerCadastroEndereco implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    CadastroEndereco telaCadastroEndereco;

    //Passando a tela que iremos controlar como parametro de invocação
    public ControllerCadastroEndereco(CadastroEndereco telaCadastroEndereco) {
        //Repassando o valor(tela) do parâmetro para o objeto global
        this.telaCadastroEndereco = telaCadastroEndereco;

        //Adicionando ouvintes(Listeners) para escutar ações nos botões da tela
        inicializeActionListener();

        //Executando os métodos da classe de utilitários
        //para ativar/desativar/limpar botões e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getPanelButtons());
        Utilities.limpaComponentes(false, this.telaCadastroEndereco.getPanelCadastro());
    }
    
    private void inicializeActionListener(){
        this.telaCadastroEndereco.getBtnNovo().addActionListener(this);
        this.telaCadastroEndereco.getBtnSair().addActionListener(this);
        this.telaCadastroEndereco.getBtnCancelar().addActionListener(this);
        this.telaCadastroEndereco.getBtnGravar().addActionListener(this);
        this.telaCadastroEndereco.getBtnBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroEndereco.getBtnNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroEndereco.getPanelButtons());
            Utilities.limpaComponentes(true, this.telaCadastroEndereco.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroEndereco.getBtnCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroEndereco.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroEndereco.getBtnGravar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroEndereco.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroEndereco.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroEndereco.getBtnBuscar()) {
           // BuscaBairro telaBuscaBairro = new BuscaBairro(null, true);
            //Inserir o controller da busca d bairros
            //telaBuscaBairro.setVisible(true);
            

        } else if (e.getSource() == this.telaCadastroEndereco.getBtnSair()) {
            this.telaCadastroEndereco.dispose();

        }
    }

}
