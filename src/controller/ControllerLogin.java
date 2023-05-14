package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import view.Login;
import view.Menu;

/**
 *
 * @author Sandro Cunha
 */
public class ControllerLogin implements ActionListener, MouseListener, MouseMotionListener  {
    private int mouseX, mouseY;
    Login telaLogin;

    public ControllerLogin(Login telaLogin) {
        this.telaLogin = telaLogin; 
        addMouseListener();
    }
    
    private void addMouseListener(){
        this.telaLogin.getExitButton().addMouseListener(this);
        this.telaLogin.getLoginButton().addMouseListener(this);
        this.telaLogin.getPanelLogin().addMouseListener(this);
        this.telaLogin.getPanelLogin().addMouseMotionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
         if (e.getSource()== this.telaLogin.getExitButton()) {
            telaLogin.dispose();
        } else if (e.getSource()== this.telaLogin.getLoginButton()) {
            telaLogin.dispose();
            Menu menu = new Menu();
            menu.setVisible(true);
        }
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {    
        if (e.getSource()== this.telaLogin.getPanelLogin()) {
            mouseX = e.getX();
            mouseY = e.getY();
        }
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        
    }
    
     @Override
    public void mouseDragged(java.awt.event.MouseEvent e) {
        if (e.getSource()== this.telaLogin.getPanelLogin()) {
            this.telaLogin.setLocation(this.telaLogin.getX() + e.getX() - mouseX, this.telaLogin.getY() + e.getY() - mouseY);
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    

}


