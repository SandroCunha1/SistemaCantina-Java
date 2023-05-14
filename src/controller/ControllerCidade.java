/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utilities.Utilities;
import view.CadastroCidade;

/**
 *
 * @author Usuário
 */
public class ControllerCidade implements ActionListener {
        //Criando um objeto Global do tipo da tela que iremos controllar
    CadastroCidade telaCadastroCidade;

    //Passando a tela que iremos controlar como parametro de invocação
    public ControllerCidade(CadastroCidade telaCadastroCidade) {
        //Repassando o valor(tela) do parâmetro para o objeto global
        this.telaCadastroCidade = telaCadastroCidade;

        //Adicionando ouvintes(Listeners) para escutar ações nos botões da tela
        inicializeActionListener();

        //Executando os métodos da classe de utilitários
        //para ativar/desativar/limpar botões e componentes diversos na tela
        utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getPanelButtons());
        Utilities.limpaComponentes(false, this.telaCadastroCidade.getPanelCadastro());
    }
    
    private void inicializeActionListener(){
        this.telaCadastroCidade.getBtnNovo().addActionListener(this);
        this.telaCadastroCidade.getBtnSair().addActionListener(this);
        this.telaCadastroCidade.getBtnCancelar().addActionListener(this);
        this.telaCadastroCidade.getBtnGravar().addActionListener(this);
        this.telaCadastroCidade.getBtnBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroCidade.getBtnNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCidade.getPanelButtons());
            Utilities.limpaComponentes(true, this.telaCadastroCidade.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroCidade.getBtnCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroCidade.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroCidade.getBtnGravar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroCidade.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroCidade.getBtnBuscar()) {
           // BuscaBairro telaBuscaBairro = new BuscaBairro(null, true);
            //Inserir o controller da busca d bairros
            //telaBuscaBairro.setVisible(true);
            

        } else if (e.getSource() == this.telaCadastroCidade.getBtnSair()) {
            this.telaCadastroCidade.dispose();

        }
    }
}
