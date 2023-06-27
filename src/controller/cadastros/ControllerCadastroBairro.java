package controller.cadastros;

import DAO.ClasseDados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.bo.Bairro;
import utilities.Utilities;
import view.Busca;
import view.CadastroBairro;


public class ControllerCadastroBairro implements ActionListener, MouseListener, MouseMotionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    CadastroBairro telaCadastroBairro;
    public static Integer codigo;
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
        this.telaCadastroBairro.getPanelTitulo().addMouseListener(this);
        this.telaCadastroBairro.getPanelTitulo().addMouseMotionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.telaCadastroBairro.getBtnNovo()) {
            utilities.Utilities.ativaDesativa(false, this.telaCadastroBairro.getPanelButtons());
            Utilities.limpaComponentes(true, this.telaCadastroBairro.getPanelCadastro());
            this.telaCadastroBairro.getTxtId().setEnabled(false);
        } else if (e.getSource() == this.telaCadastroBairro.getBtnCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroBairro.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroBairro.getBtnGravar()) {
            ClasseDados.getInstance();
            
            Bairro bairro = new Bairro();
            bairro.setId(DAO.ClasseDados.listaBairro.size() + 1);
            bairro.setDescricao(this.telaCadastroBairro.getjTextField1().getText());
            
            if(this.telaCadastroBairro.getTxtId().getText().equalsIgnoreCase("")){
               DAO.ClasseDados.listaBairro.add(bairro);
            }else{
                bairro.setId(Integer.parseInt(telaCadastroBairro.getTxtId().getText()));
                ClasseDados.listaBairro.remove(bairro.getId() - 1);
                ClasseDados.listaBairro.add(bairro.getId() - 1, bairro);
            }
            utilities.Utilities.ativaDesativa(true, this.telaCadastroBairro.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroBairro.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroBairro.getBtnBuscar()) {
           codigo = 0;
           Busca telaBuscaBairro = new Busca(null, true, "bairro");
           telaBuscaBairro.setVisible(true);
           
            if (codigo != 0) {
                Bairro bairro = new Bairro();
                bairro = DAO.ClasseDados.listaBairro.get(codigo -1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroBairro.getPanelButtons());
                Utilities.limpaComponentes(true, this.telaCadastroBairro.getPanelCadastro());
                
                this.telaCadastroBairro.getTxtId().setText(bairro.getId() + "");
                this.telaCadastroBairro.getjTextField1().setText(bairro.getDescricao());
                this.telaCadastroBairro.getTxtId().setEnabled(false);
            }
          
            

        } else if (e.getSource() == this.telaCadastroBairro.getBtnSair()) {
            this.telaCadastroBairro.dispose();

        }
    }

    int mouseX, mouseY;
    @Override
    public void mouseClicked(MouseEvent e) {
        }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource()== this.telaCadastroBairro.getPanelTitulo()) {
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
         if (e.getSource()== this.telaCadastroBairro.getPanelTitulo()) {
            this.telaCadastroBairro.setLocation(this.telaCadastroBairro.getX() + e.getX() - mouseX, this.telaCadastroBairro.getY() + e.getY() - mouseY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}
