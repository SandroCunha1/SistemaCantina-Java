/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;

/**
 *
 * @author aluno
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form TestejFrame
     */
    public CadastroCliente() {
        initComponents();
        
        GraphicsDevice device  = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        device.setFullScreenWindow(this);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanelFormulário = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        lblRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JTextField();
        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblAniver = new javax.swing.JLabel();
        txtAniver = new javax.swing.JFormattedTextField();
        lblFone1 = new javax.swing.JLabel();
        txtFone1 = new javax.swing.JFormattedTextField();
        lblFone2 = new javax.swing.JLabel();
        txtFone2 = new javax.swing.JFormattedTextField();
        lblLogradouro = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        txtComplemento = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catina do Zé  - Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1000, 667));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/formulario-de-contato (1).png"))); // NOI18N
        jLabel1.setText("   Cadastro de cliente");

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelFormulário.setBackground(new java.awt.Color(172, 177, 214));
        jPanelFormulário.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jPanel1.setBackground(new java.awt.Color(167, 175, 198));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 312));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 312));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblID.setText("Id");
        jPanel1.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 20, 30));

        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 50, -1));

        lblNome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNome.setText("Nome");
        jPanel1.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, 30));

        txtNome.setMaximumSize(new java.awt.Dimension(64, 22));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 290, -1));

        lblCPF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCPF.setText("CPF");
        jPanel1.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 50, 30));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 120, -1));

        lblRG.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblRG.setText("RG");
        jPanel1.add(lblRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 50, 30));
        jPanel1.add(txtRG, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 120, -1));

        lblMatricula.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblMatricula.setText("Matricula");
        jPanel1.add(lblMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 100, 30));
        jPanel1.add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 210, -1));

        lblEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEmail.setText("E-mail");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, 30));

        txtEmail.setMaximumSize(new java.awt.Dimension(64, 22));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 290, -1));

        lblAniver.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAniver.setText("Aniversário");
        jPanel1.add(lblAniver, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 120, 30));

        try {
            txtAniver.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtAniver, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 120, -1));

        lblFone1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblFone1.setText("Telefone 1");
        jPanel1.add(lblFone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 120, 30));

        try {
            txtFone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtFone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 160, -1));

        lblFone2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblFone2.setText("Telefone 2");
        jPanel1.add(lblFone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 120, 30));

        try {
            txtFone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("## #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtFone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 170, -1));

        lblLogradouro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblLogradouro.setText("Logradouro");
        jPanel1.add(lblLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 120, 30));

        lblComplemento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblComplemento.setText("Complemento");
        jPanel1.add(lblComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 120, 30));

        txtLogradouro.setEnabled(false);
        jPanel1.add(txtLogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 170, -1));

        lblCEP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCEP.setText("CEP");
        jPanel1.add(lblCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 30, 30));

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 80, -1));
        jPanel1.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 170, -1));

        lblCidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCidade.setText("Cidade");
        jPanel1.add(lblCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 120, 30));

        txtCidade.setEnabled(false);
        jPanel1.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 150, -1));

        lblBairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblBairro.setText("Bairro");
        jPanel1.add(lblBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 120, 30));

        txtBairro.setEnabled(false);
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 160, -1));

        jPanel4.setBackground(new java.awt.Color(167, 175, 198));
        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 35));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Create.png"))); // NOI18N
        jButton1.setText("Novo");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setDefaultCapable(false);
        jButton1.setMinimumSize(new java.awt.Dimension(100, 300));
        jButton1.setPreferredSize(new java.awt.Dimension(120, 45));
        jPanel4.add(jButton1);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Cancel.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setEnabled(false);
        jButton3.setPreferredSize(new java.awt.Dimension(120, 45));
        jPanel4.add(jButton3);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/OK.png"))); // NOI18N
        jButton4.setText("Gravar");
        jButton4.setEnabled(false);
        jButton4.setPreferredSize(new java.awt.Dimension(120, 45));
        jPanel4.add(jButton4);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Find.png"))); // NOI18N
        jButton5.setText("Buscar");
        jButton5.setPreferredSize(new java.awt.Dimension(120, 45));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/Exit.png"))); // NOI18N
        jButton6.setText("Sair");
        jButton6.setPreferredSize(new java.awt.Dimension(120, 45));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6);

        javax.swing.GroupLayout jPanelFormulárioLayout = new javax.swing.GroupLayout(jPanelFormulário);
        jPanelFormulário.setLayout(jPanelFormulárioLayout);
        jPanelFormulárioLayout.setHorizontalGroup(
            jPanelFormulárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormulárioLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(jPanelFormulárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(225, 225, 225))
        );
        jPanelFormulárioLayout.setVerticalGroup(
            jPanelFormulárioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormulárioLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFormulário, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFormulário, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelFormulário;
    private javax.swing.JLabel lblAniver;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFone1;
    private javax.swing.JLabel lblFone2;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLogradouro;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRG;
    private javax.swing.JFormattedTextField txtAniver;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtFone1;
    private javax.swing.JFormattedTextField txtFone2;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRG;
    // End of variables declaration//GEN-END:variables
}
