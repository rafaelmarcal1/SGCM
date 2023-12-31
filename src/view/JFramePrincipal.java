/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author popolin
 */
public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuAdmnistrativo = new javax.swing.JMenu();
        jMenuItemConsultaEspecialidades = new javax.swing.JMenuItem();
        jMenuItemCadastroEspecialidades = new javax.swing.JMenuItem();
        jMenuAgendamento = new javax.swing.JMenu();
        jMenuAtentimento = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gerenciamento de Clínica Médica");

        jPanelLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );

        jMenuAdmnistrativo.setText("Adiministrativo");

        jMenuItemConsultaEspecialidades.setText("Consulta Especilidades");
        jMenuItemConsultaEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultaEspecialidadesActionPerformed(evt);
            }
        });
        jMenuAdmnistrativo.add(jMenuItemConsultaEspecialidades);

        jMenuItemCadastroEspecialidades.setText("Cadastro Especialidades");
        jMenuItemCadastroEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroEspecialidadesActionPerformed(evt);
            }
        });
        jMenuAdmnistrativo.add(jMenuItemCadastroEspecialidades);

        jMenuBar.add(jMenuAdmnistrativo);

        jMenuAgendamento.setText("Agendamento");
        jMenuBar.add(jMenuAgendamento);

        jMenuAtentimento.setText("Atentimento");
        jMenuBar.add(jMenuAtentimento);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemConsultaEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultaEspecialidadesActionPerformed
        // TODO add your handling code here:
        
        try {
                     
            JFrameConsultaEspecialidade jFrameConsultaEspecialidade;
            jFrameConsultaEspecialidade = 
                    new JFrameConsultaEspecialidade( false, true);
            jFrameConsultaEspecialidade.setVisible(true);
            
        } catch( Exception ex ){
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jMenuItemConsultaEspecialidadesActionPerformed

    private void jMenuItemCadastroEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroEspecialidadesActionPerformed
        // TODO add your handling code here:
        
        try {
                     
           JFrameEspecialidadeCRUD jFrameEspecialidadeCRUD;
            jFrameEspecialidadeCRUD = 
                    new JFrameEspecialidadeCRUD( null, true);
            jFrameEspecialidadeCRUD.setVisible(true);
            
        } catch( Exception ex ){
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jMenuItemCadastroEspecialidadesActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAdmnistrativo;
    private javax.swing.JMenu jMenuAgendamento;
    private javax.swing.JMenu jMenuAtentimento;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemCadastroEspecialidades;
    private javax.swing.JMenuItem jMenuItemConsultaEspecialidades;
    private javax.swing.JPanel jPanelLogin;
    // End of variables declaration//GEN-END:variables
}
