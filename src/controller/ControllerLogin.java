package controller;

import DAO.ClasseDados;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import model.bo.Bairro;
import model.bo.Funcionario;
import view.Login;
import view.Menu;

/**
 *
 * @author Sandro Cunha
 */
public class ControllerLogin implements ActionListener, MouseListener, MouseMotionListener {

    private int mouseX, mouseY;
    Login telaLogin;
    float btnColor[] = new float[]{0.00F, 0.00F, 0.00F};
    float btnColorHover[] = new float[]{0.00F, 0.00F, 0.00F};

    public ControllerLogin(Login telaLogin) {
        this.telaLogin = telaLogin;
        addMouseListener();
        addMouseMotionListener();
        Color.RGBtoHSB(255, 51, 51, btnColor);
        Color.RGBtoHSB(255, 128, 128, btnColorHover);

    }

    private void addMouseListener() {
        this.telaLogin.getExitButton().addMouseListener(this);
        this.telaLogin.getLoginButton().addMouseListener(this);
        this.telaLogin.getPanelLogin().addMouseListener(this);
        this.telaLogin.getLoginButotnBg().addMouseListener(this);
    }

    private void addMouseMotionListener() {
        this.telaLogin.getPanelLogin().addMouseMotionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        if (e.getSource() == this.telaLogin.getExitButton()) {
            telaLogin.dispose();
        } else if (e.getSource() == this.telaLogin.getLoginButton()) {
            ClasseDados.getInstance();
            String usuario = (String) this.telaLogin.getTxtUsuario().getText();
            String senha = (String) this.telaLogin.getTxtPassword().getText();
            Funcionario funcionario = ClasseDados.listaFuncionario.stream()
                    .filter(b -> b.getUsuario().equals(usuario) && b.getSenha().equals(senha))
                    .findFirst()
                    .orElse(null);
            if (funcionario != null) {
                telaLogin.dispose();
                Menu menu = new Menu();
                menu.setVisible(true);
            }

        }
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        if (e.getSource() == this.telaLogin.getPanelLogin()) {
            mouseX = e.getX();
            mouseY = e.getY();
        }
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {

    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        if (e.getSource() == this.telaLogin.getLoginButton()) {
            this.telaLogin.getLoginButotnBg().setBackground(Color.getHSBColor(btnColorHover[0], btnColorHover[1], btnColorHover[2]));
            this.telaLogin.getLoginButton().setForeground(Color.BLACK);
        }
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        if (e.getSource() == this.telaLogin.getLoginButton()) {
            this.telaLogin.getLoginButotnBg().setBackground(Color.getHSBColor(btnColor[0], btnColor[1], btnColor[2]));
            this.telaLogin.getLoginButton().setForeground(Color.WHITE);
        }
    }

    @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        if (e.getSource() == this.telaLogin.getPanelLogin()) {
            this.telaLogin.setLocation(this.telaLogin.getX() + e.getX() - mouseX, this.telaLogin.getY() + e.getY() - mouseY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}
