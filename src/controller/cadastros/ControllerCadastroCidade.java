package controller.cadastros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import utilities.Utilities;
import view.Busca;
import view.CadastroCidade;


public class ControllerCadastroCidade implements ActionListener, MouseListener, MouseMotionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    CadastroCidade telaCadastroCidade;

    //Passando a tela que iremos controlar como parametro de invocação
    public ControllerCadastroCidade(CadastroCidade telaCadastroCidade) {
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
        this.telaCadastroCidade.getPanelTitulo().addMouseListener(this);
        this.telaCadastroCidade.getPanelTitulo().addMouseMotionListener(this);
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
                 Busca telaBuscaBairro = new Busca(null, true);
            telaBuscaBairro.setjLabelTitulo("Cidade");
           telaBuscaBairro.setVisible(true);
            

        } else if (e.getSource() == this.telaCadastroCidade.getBtnSair()) {
            this.telaCadastroCidade.dispose();

        }
    }
    int mouseX, mouseY;
    @Override
    public void mouseClicked(MouseEvent e) {
        }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource()== this.telaCadastroCidade.getPanelTitulo()) {
            mouseX = e.getX();
            mouseY = e.getY();
        }
     }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
         if (e.getSource()== this.telaCadastroCidade.getPanelTitulo()) {
            this.telaCadastroCidade.setLocation(this.telaCadastroCidade.getX() + e.getX() - mouseX, this.telaCadastroCidade.getY() + e.getY() - mouseY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }


}
