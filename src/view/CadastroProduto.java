/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.cadastros.ControllerCadastroProduto;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class CadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form TestejFrame
     */
    public CadastroProduto() {
        initComponents();
        ControllerCadastroProduto controller = new ControllerCadastroProduto(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        panelTotal = new javax.swing.JPanel();
        panelTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelConteudo = new javax.swing.JPanel();
        panelCadastro = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        txtObcervacao = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        txtUF = new javax.swing.JTextField();
        lblDescricao1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        panelButtons = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        brnBuscar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catina do Zé  - Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(880, 473));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        panelTotal.setBackground(new java.awt.Color(255, 255, 255));

        panelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        panelTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelTituloMouseDragged(evt);
            }
        });
        panelTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelTituloMousePressed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/formulario-de-contato (1).png"))); // NOI18N
        lblTitulo.setText("   Cadastro de produto");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTituloLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelConteudo.setBackground(new java.awt.Color(172, 177, 214));
        panelConteudo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        panelCadastro.setBackground(new java.awt.Color(167, 175, 198));
        panelCadastro.setMinimumSize(new java.awt.Dimension(800, 312));
        panelCadastro.setPreferredSize(new java.awt.Dimension(800, 312));
        panelCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblID.setText("Id");
        panelCadastro.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 20, 30));

        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        panelCadastro.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 50, -1));

        lblDescricao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDescricao.setText("Descrição");
        panelCadastro.add(lblDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 90, 30));
        panelCadastro.add(txtObcervacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 700, -1));

        lblUF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblUF.setText("Código de barras");
        panelCadastro.add(lblUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 140, 30));
        panelCadastro.add(txtUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 770, -1));

        lblDescricao1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDescricao1.setText("Status");
        panelCadastro.add(lblDescricao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 90, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        panelCadastro.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, -1, -1));

        panelButtons.setBackground(new java.awt.Color(167, 175, 198));
        panelButtons.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 35));

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Create.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setBorder(null);
        btnNovo.setBorderPainted(false);
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.setDefaultCapable(false);
        btnNovo.setMinimumSize(new java.awt.Dimension(100, 300));
        btnNovo.setPreferredSize(new java.awt.Dimension(120, 45));
        panelButtons.add(btnNovo);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setEnabled(false);
        btnCancelar.setPreferredSize(new java.awt.Dimension(120, 45));
        panelButtons.add(btnCancelar);

        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/OK.png"))); // NOI18N
        btnGravar.setText("Gravar");
        btnGravar.setEnabled(false);
        btnGravar.setPreferredSize(new java.awt.Dimension(120, 45));
        panelButtons.add(btnGravar);

        brnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Find.png"))); // NOI18N
        brnBuscar.setText("Buscar");
        brnBuscar.setPreferredSize(new java.awt.Dimension(120, 45));
        brnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnBuscarActionPerformed(evt);
            }
        });
        panelButtons.add(brnBuscar);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setPreferredSize(new java.awt.Dimension(120, 45));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        panelButtons.add(btnSair);

        javax.swing.GroupLayout panelConteudoLayout = new javax.swing.GroupLayout(panelConteudo);
        panelConteudo.setLayout(panelConteudoLayout);
        panelConteudoLayout.setHorizontalGroup(
            panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConteudoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelConteudoLayout.setVerticalGroup(
            panelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelTotalLayout = new javax.swing.GroupLayout(panelTotal);
        panelTotal.setLayout(panelTotalLayout);
        panelTotalLayout.setHorizontalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelTotalLayout.setVerticalGroup(
            panelTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalLayout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelConteudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelTotal);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void brnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brnBuscarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSairActionPerformed

    private void panelTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTituloMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelTituloMousePressed

    private void panelTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelTituloMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_panelTituloMouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDescricao1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUF;
    private javax.swing.JPanel panelButtons;
    private javax.swing.JPanel panelCadastro;
    private javax.swing.JPanel panelConteudo;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelTotal;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtObcervacao;
    private javax.swing.JTextField txtUF;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnBuscar() {
        return brnBuscar;
    }

    public void setBrnBuscar(JButton brnBuscar) {
        this.brnBuscar = brnBuscar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnGravar() {
        return btnGravar;
    }

    public void setBtnGravar(JButton btnGravar) {
        this.btnGravar = btnGravar;
    }

    public JButton getBtnNovo() {
        return btnNovo;
    }

    public void setBtnNovo(JButton btnNovo) {
        this.btnNovo = btnNovo;
    }

    public JButton getBtnSair() {
        return btnSair;
    }

    public void setBtnSair(JButton btnSair) {
        this.btnSair = btnSair;
    }

    public ButtonGroup getGrupoSexo() {
        return grupoSexo;
    }

    public void setGrupoSexo(ButtonGroup grupoSexo) {
        this.grupoSexo = grupoSexo;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }

    public JLabel getLblDescricao() {
        return lblDescricao;
    }

    public void setLblDescricao(JLabel lblDescricao) {
        this.lblDescricao = lblDescricao;
    }

    public JLabel getLblDescricao1() {
        return lblDescricao1;
    }

    public void setLblDescricao1(JLabel lblDescricao1) {
        this.lblDescricao1 = lblDescricao1;
    }

    public JLabel getLblID() {
        return lblID;
    }

    public void setLblID(JLabel lblID) {
        this.lblID = lblID;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JLabel getLblUF() {
        return lblUF;
    }

    public void setLblUF(JLabel lblUF) {
        this.lblUF = lblUF;
    }

    public JPanel getPanelButtons() {
        return panelButtons;
    }

    public void setPanelButtons(JPanel panelButtons) {
        this.panelButtons = panelButtons;
    }

    public JPanel getPanelCadastro() {
        return panelCadastro;
    }

    public void setPanelCadastro(JPanel panelCadastro) {
        this.panelCadastro = panelCadastro;
    }

    public JPanel getPanelConteudo() {
        return panelConteudo;
    }

    public void setPanelConteudo(JPanel panelConteudo) {
        this.panelConteudo = panelConteudo;
    }

    public JPanel getPanelTitulo() {
        return panelTitulo;
    }

    public void setPanelTitulo(JPanel panelTitulo) {
        this.panelTitulo = panelTitulo;
    }

    public JPanel getPanelTotal() {
        return panelTotal;
    }

    public void setPanelTotal(JPanel panelTotal) {
        this.panelTotal = panelTotal;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtObcervacao() {
        return txtObcervacao;
    }

    public void setTxtObcervacao(JTextField txtObcervacao) {
        this.txtObcervacao = txtObcervacao;
    }

    public JTextField getTxtUF() {
        return txtUF;
    }

    public void setTxtUF(JTextField txtUF) {
        this.txtUF = txtUF;
    }
    

}
