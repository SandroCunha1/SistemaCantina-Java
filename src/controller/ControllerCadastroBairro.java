package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utilities.Utilities;
import view.CadastroBairro;


public class ControllerCadastroBairro implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    CadastroBairro telaCadastroBairro;

    //Passando a tela que iremos controlar como parametro de invocação
    public ControllerCadastroBairro(CadastroBairro telaCadastroBairro) {
        //Repassando o valor(tela) do parâmetro para o objeto global
        this.telaCadastroBairro = telaCadastroBairro;

        //Adicionando ouvintes(Listeners) para escutar ações nos botões da tela
        inicializeActionListener();

        //Executando os métodos da classe de utilitários
        //para ativar/desativar/limpar botões e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getPanelButtons());
        Utilities.limpaComponentes(false, this.telaCadastroBairro.getPanelCadastro());
    }
    
    private void inicializeActionListener(){
        this.telaCadastroBairro.getBtnNovo().addActionListener(this);
        this.telaCadastroBairro.getBtnSair().addActionListener(this);
        this.telaCadastroBairro.getBtnCancelar().addActionListener(this);
        this.telaCadastroBairro.getBtnGravar().addActionListener(this);
        this.telaCadastroBairro.getBtnBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroBairro.getBtnNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroBairro.getPanelButtons());
            Utilities.limpaComponentes(true, this.telaCadastroBairro.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroBairro.getBtnCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroBairro.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroBairro.getBtnGravar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroBairro.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroBairro.getBtnBuscar()) {
           // BuscaBairro telaBuscaBairro = new BuscaBairro(null, true);
            //Inserir o controller da busca d bairros
            //telaBuscaBairro.setVisible(true);
            

        } else if (e.getSource() == this.telaCadastroBairro.getBtnSair()) {
            this.telaCadastroBairro.dispose();

        }
    }

}
