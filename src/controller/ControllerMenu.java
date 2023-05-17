package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import view.CadastroBairro;
import view.CadastroCidade;
import view.CadastroCliente;
import view.CadastroEndereco;
import view.CadastroFornecedor;
import view.CadastroFuncionario;
import view.CadastroProduto;
import view.Login;
import view.Menu;


public class ControllerMenu implements MouseListener, ActionListener {

    Menu telaMenu;

    public ControllerMenu(Menu telaMenu) {
        this.telaMenu = telaMenu;      
        addListeners();
        
    }

    private void addListeners(){
        this.telaMenu.getMenuBairro().addActionListener(this);
        this.telaMenu.getMenuCliente().addActionListener(this);
        this.telaMenu.getMenuCidade().addActionListener(this);
        this.telaMenu.getMenuEndereco().addActionListener(this);
        this.telaMenu.getMenuFornecedor().addActionListener(this);
        this.telaMenu.getMenuFuncionario().addActionListener(this);
        this.telaMenu.getMenuProduto().addActionListener(this);
        this.telaMenu.getMenuDeslogar().addMouseListener(this);
        this.telaMenu.getPanelDeslogar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {   
         if (e.getSource() == this.telaMenu.getMenuDeslogar() || e.getSource() == this.telaMenu.getPanelDeslogar()) {
            Login telaLogin = new Login();
            telaLogin.setVisible(true); 
            telaMenu.dispose();  
        } 
       }

    @Override
    public void mousePressed(MouseEvent e) {
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
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.telaMenu.getMenuBairro()) {
            CadastroBairro telaCadastro = new CadastroBairro();
            telaCadastro.setVisible(true);

        } else if (e.getSource() == this.telaMenu.getMenuCidade()) {
            CadastroCidade telaCadastro = new CadastroCidade();
            telaCadastro.setVisible(true);

        } else if (e.getSource() == this.telaMenu.getMenuCliente()) {
            CadastroCliente telaCadastro = new CadastroCliente();
            telaCadastro.setVisible(true);

        } else if (e.getSource() == this.telaMenu.getMenuEndereco()) {
            CadastroEndereco telaCadastro = new CadastroEndereco();
            telaCadastro.setVisible(true);
            
        } else if (e.getSource() == this.telaMenu.getMenuFornecedor()) {
            CadastroFornecedor telaCadastro = new CadastroFornecedor();
            telaCadastro.setVisible(true);

        } else if (e.getSource() == this.telaMenu.getMenuFuncionario()) {
            CadastroFuncionario telaCadastro = new CadastroFuncionario();
            telaCadastro.setVisible(true);

        } else if (e.getSource() == this.telaMenu.getMenuProduto()) {
            CadastroProduto telaCadastro = new CadastroProduto();
            telaCadastro.setVisible(true);

        }
        }

}
