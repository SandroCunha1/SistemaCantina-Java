package controller.cadastros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utilities.Utilities;
import view.CadastroFuncionario;



public class ControllerCadastroFuncionario implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    CadastroFuncionario telaCadastroFuncionario;

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
    
    private void inicializeActionListener(){
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

        } else if (e.getSource() == this.telaCadastroFuncionario.getBtnCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroFuncionario.getBtnGravar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroFuncionario.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroFuncionario.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroFuncionario.getBtnBuscar()) {
           // BuscaBairro telaBuscaBairro = new BuscaBairro(null, true);
            //Inserir o controller da busca d bairros
            //telaBuscaBairro.setVisible(true);
            

        } else if (e.getSource() == this.telaCadastroFuncionario.getBtnSair()) {
            this.telaCadastroFuncionario.dispose();

        }
    }

}
