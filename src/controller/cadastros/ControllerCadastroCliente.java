package controller.cadastros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import utilities.Utilities;
import view.CadastroCliente;



public class ControllerCadastroCliente implements ActionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    CadastroCliente telaCadastroCliente;

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
    
    private void inicializeActionListener(){
        this.telaCadastroCliente.getBtnNovo().addActionListener(this);
        this.telaCadastroCliente.getBtnSair().addActionListener(this);
        this.telaCadastroCliente.getBtnCancelar().addActionListener(this);
        this.telaCadastroCliente.getBtnGravar().addActionListener(this);
        this.telaCadastroCliente.getBtnBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroCliente.getBtnNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroCliente.getPanelButtons());
            Utilities.limpaComponentes(true, this.telaCadastroCliente.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroCliente.getBtnCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroCliente.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroCliente.getBtnGravar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCliente.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroCliente.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroCliente.getBtnBuscar()) {
           // BuscaBairro telaBuscaBairro = new BuscaBairro(null, true);
            //Inserir o controller da busca d bairros
            //telaBuscaBairro.setVisible(true);
            

        } else if (e.getSource() == this.telaCadastroCliente.getBtnSair()) {
            this.telaCadastroCliente.dispose();

        }
    }

}
