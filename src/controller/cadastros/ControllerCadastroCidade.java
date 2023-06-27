package controller.cadastros;

import DAO.ClasseDados;
import static controller.cadastros.ControllerCadastroBairro.codigo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import model.bo.Bairro;
import model.bo.Cidade;
import utilities.Utilities;
import view.Busca;
import view.CadastroCidade;

public class ControllerCadastroCidade implements ActionListener, MouseListener, MouseMotionListener {

    //Criando um objeto Global do tipo da tela que iremos controllar
    CadastroCidade telaCadastroCidade;
    public static Integer codigo;

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

    private void inicializeActionListener() {
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
            this.telaCadastroCidade.getTxtId().setEnabled(false);
        } else if (e.getSource() == this.telaCadastroCidade.getBtnCancelar()) {
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroCidade.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroCidade.getBtnGravar()) {
            Cidade cidade = new Cidade();
            ClasseDados.getInstance();
            cidade.setId(ClasseDados.listaCidade.size() + 1);
            cidade.setDescricao(this.telaCadastroCidade.getTxtObcervacao().getText());
            cidade.setUf(this.telaCadastroCidade.getTxtUF().getText());

            if (this.telaCadastroCidade.getTxtId().getText().equalsIgnoreCase("")) {
                ClasseDados.getInstance().listaCidade.add(cidade);
            } else {
                cidade.setId(Integer.parseInt(this.telaCadastroCidade.getTxtId().getText()));
                ClasseDados.getInstance().listaCidade.remove(cidade.getId() - 1);
                ClasseDados.getInstance().listaCidade.add(cidade.getId() - 1, cidade);
            }
            utilities.Utilities.ativaDesativa(true, this.telaCadastroCidade.getPanelButtons());
            Utilities.limpaComponentes(false, this.telaCadastroCidade.getPanelCadastro());

        } else if (e.getSource() == this.telaCadastroCidade.getBtnBuscar()) {
            codigo = 0;
            Busca telaBuscaBairro = new Busca(null, true, "cidade");
            telaBuscaBairro.setVisible(true);

            if (codigo != 0) {
                Cidade cidade = new Cidade();
                cidade = DAO.ClasseDados.listaCidade.get(codigo - 1);
                utilities.Utilities.ativaDesativa(false, this.telaCadastroCidade.getPanelButtons());
                Utilities.limpaComponentes(true, this.telaCadastroCidade.getPanelCadastro());

                this.telaCadastroCidade.getTxtId().setText(cidade.getId() + "");
                this.telaCadastroCidade.getTxtObcervacao().setText(cidade.getDescricao());
                this.telaCadastroCidade.getTxtUF().setText(cidade.getUf());
                this.telaCadastroCidade.getTxtId().setEnabled(false);

            }
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
        if (e.getSource() == this.telaCadastroCidade.getPanelTitulo()) {
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
        if (e.getSource() == this.telaCadastroCidade.getPanelTitulo()) {
            this.telaCadastroCidade.setLocation(this.telaCadastroCidade.getX() + e.getX() - mouseX, this.telaCadastroCidade.getY() + e.getY() - mouseY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}
