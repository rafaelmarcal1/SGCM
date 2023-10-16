package view;

import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import controller.ResultSetTableModel;
import java.sql.SQLException;
import javax.swing.RowFilter;
import model.Especialidade;

/**
 *
 * @author popolin
 */
public class JFrameConsultaEspecialidade extends javax.swing.JFrame {
    
    private boolean select;
    private boolean disconnectOnClose;
    
    private String query = "SELECT codigo_especialidade as ID, descricao_especialidade as Nome FROM especialidades ORDER BY Nome";
    
    private ResultSetTableModel result;   
    private final TableRowSorter< TableModel > filter;

    public JFrameConsultaEspecialidade(boolean select, boolean disconnectOnClose) throws SQLException {
        initComponents();
        
        this.select = select;
        jButtonSelecionar.setEnabled( this.select );
        
        this.disconnectOnClose = disconnectOnClose;
        
        result = new ResultSetTableModel( query );
        jTableConsulta.setModel( result );
        
        filter = new TableRowSorter< TableModel >( result );
        jTableConsulta.setRowSorter( filter );     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsulta = new javax.swing.JTable();
        jLabelFiltro = new javax.swing.JLabel();
        jTextFieldFiltro = new javax.swing.JTextField();
        jButtonFiltrar = new javax.swing.JButton();
        jButtonSelecionar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Especialidade");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableConsulta);

        jLabelFiltro.setText("Filtro:");

        jButtonFiltrar.setText("Filtrar");
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        jButtonSelecionar.setText("Selecionar");

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelFiltro)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFiltro)
                    .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFiltrar)
                    .addComponent(jButtonSelecionar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonAdicionar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        // TODO add your handling code here:
        System.out.println("Filtrar");
        
        String filtro = jTextFieldFiltro.getText();
        if ( filtro.isEmpty() ) {
            filter.setRowFilter( null );
        } else {
            filter.setRowFilter( RowFilter.regexFilter( filtro ) );
        }
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        // TODO add your handling code here:
        JFrameEspecialidadeCRUD jFrameEspecialidadeCRUD;
        jFrameEspecialidadeCRUD = 
                new JFrameEspecialidadeCRUD( null, false );
        
        jFrameEspecialidadeCRUD.addWindowListener( new java.awt.event.WindowAdapter(){
                @Override
                public void windowClosed(java.awt.event.WindowEvent evt) {
                     System.out.println("Atualizar");
                     try {
                         result.setQuery( query );
                     } catch ( Exception ex ) {
                         ex.printStackTrace();
                     }
                }
            } );
        
        jFrameEspecialidadeCRUD.setVisible( true );
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
        
        int row = jTableConsulta.getSelectedRow();
        if( row != -1 ) {
            
            System.out.println("Alterar");
            
            int codigo = (int) result.getValueAt( row, 0 );
            
            Especialidade especialidade = new Especialidade();
            especialidade.setCodigoEspecialidade(codigo);
            
            try {
                
                especialidade.load();
                
                JFrameEspecialidadeCRUD jFrameEspecialidadeCRUD;
                jFrameEspecialidadeCRUD = 
                        new JFrameEspecialidadeCRUD( especialidade, false );

                jFrameEspecialidadeCRUD.addWindowListener( new java.awt.event.WindowAdapter(){
                        @Override
                        public void windowClosed(java.awt.event.WindowEvent evt) {
                             System.out.println("Atualizar");
                             try {
                                 result.setQuery( query );
                             } catch ( Exception ex ) {
                                 ex.printStackTrace();
                             }
                        }
                    } );

                jFrameEspecialidadeCRUD.setVisible( true );
                
                
            } catch( Exception ex ) {
                ex.printStackTrace();
            }
            
            
        }
        
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        try {
            if( disconnectOnClose ) {
                result.disconnectFromDatabase();
            }
        } catch ( Exception ex ) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(JFrameConsultaEspecialidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaEspecialidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaEspecialidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameConsultaEspecialidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                try {
                    new JFrameConsultaEspecialidade(false, true).setVisible(true);
                } catch ( Exception ex ) {
                    ex.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonSelecionar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabelFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableConsulta;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
