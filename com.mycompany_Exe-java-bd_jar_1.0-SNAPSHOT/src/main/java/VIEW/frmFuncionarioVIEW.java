
package VIEW;

import DAO.FuncionarioDAO;
import DTO.FuncionarioDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmFuncionarioVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmFuncionarioVIEW
     */
    public frmFuncionarioVIEW() {
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

        jLabel1 = new javax.swing.JLabel();
        txtNome_Usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEndereco_Usuario = new javax.swing.JTextField();
        btnCadastar = new javax.swing.JButton();
        btn_Pesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Funcionario = new javax.swing.JTable();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCarregarCampos = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        bntAlterar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 108, 42, -1));
        getContentPane().add(txtNome_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 105, 234, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Endereço");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 148, -1, -1));
        getContentPane().add(txtEndereco_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 145, 234, -1));

        btnCadastar.setText("Cadastrar");
        btnCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastar, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 200, -1, -1));

        btn_Pesquisar.setText("Pesquisar");
        btn_Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Pesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 246, -1, -1));

        table_Funcionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Endereço"
            }
        ));
        jScrollPane1.setViewportView(table_Funcionario);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 281, 375, 289));

        txtCodigo.setEnabled(false);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 65, 234, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 145, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Código");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 68, -1, -1));

        btnCarregarCampos.setText("Carregar Campos");
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarregarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 588, -1, -1));

        btnLimpar.setText("  Limpar  ");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 200, -1, -1));

        btnExcluir.setText("     Excluir    ");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 200, -1, -1));

        bntAlterar.setText("    Alterar    ");
        bntAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(bntAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 200, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/poltrona-horadeaventura.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 420, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastarActionPerformed
  CadastrarFuncionario();
    }//GEN-LAST:event_btnCadastarActionPerformed

    private void btn_PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesquisarActionPerformed
     listarValores();
    }//GEN-LAST:event_btn_PesquisarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed
      CarregarCampos();
    }//GEN-LAST:event_btnCarregarCamposActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
    LimparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
     ExcluirCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void bntAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAlterarActionPerformed
     AlterarCampos();
    }//GEN-LAST:event_bntAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(frmFuncionarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFuncionarioVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAlterar;
    private javax.swing.JButton btnCadastar;
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btn_Pesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_Funcionario;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEndereco_Usuario;
    private javax.swing.JTextField txtNome_Usuario;
    // End of variables declaration//GEN-END:variables

    private void listarValores(){
        
        try {
            FuncionarioDAO objfuncionariodao = new FuncionarioDAO();
            
            DefaultTableModel model = (DefaultTableModel)table_Funcionario.getModel();
            model.setNumRows(0);
            
            ArrayList<FuncionarioDTO> lista = objfuncionariodao.PesquisarFuncionario();
            
            for(int num = 0; num <lista.size(); num++){
                
                
                model.addRow(new Object[]{
                lista.get(num).getId_funcionario(),
                lista.get(num).getNome_funcionario(),
                lista.get(num).getEndereco_funcionario()
                
            
            });
            }
            
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores"+ erro);
        }
        
        
    }

    private void listarValoresFuncionario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    private void  CarregarCampos(){
        int setar = table_Funcionario.getSelectedRow();
        
        txtCodigo.setText(table_Funcionario.getModel().getValueAt(setar, 0).toString());
        txtNome_Usuario.setText(table_Funcionario.getModel().getValueAt(setar, 1).toString());
        txtEndereco_Usuario.setText(table_Funcionario.getModel().getValueAt(setar, 2).toString());
        
    }
    private void CadastrarFuncionario(){
        
        String nome_funcionario, endereco_funcionario;
        nome_funcionario = txtNome_Usuario.getText();
        endereco_funcionario = txtEndereco_Usuario.getText();
        
        FuncionarioDTO objfuncionariodto = new FuncionarioDTO();
        objfuncionariodto.setNome_funcionario(nome_funcionario);
        objfuncionariodto.setEndereco_funcionario(endereco_funcionario);
        
        FuncionarioDAO objfuncionariodao = new FuncionarioDAO();
        objfuncionariodao.cadastrarFuncionario(objfuncionariodto);
        
    }
    private void LimparCampos(){
        txtCodigo.setText("");
        txtNome_Usuario.setText(" ");
        txtEndereco_Usuario.setText("");
        
        txtNome_Usuario.requestFocus();
        
    }
   private void  ExcluirCampos(){
   
    if (txtCodigo.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Selecione um funcionário na tabela para excluir.");
    } else {
        int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o funcionário selecionado?", "Confirmação de exclusão", JOptionPane.YES_NO_OPTION);
        if (confirmacao == JOptionPane.YES_OPTION) {
            int linhaSelecionada = table_Funcionario.getSelectedRow();
            String id_funcionario = table_Funcionario.getValueAt(linhaSelecionada, 0).toString();

            FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
            funcionarioDTO.setId_funcionario(Integer.parseInt(txtCodigo.getText()));
           

            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
            funcionarioDAO.excluirFuncionario(funcionarioDTO);
        }
    }
   }

    private void  AlterarCampos(){     

  String nome_funcionario, endereco_funcionario;
        int id_funcionario;
        if (txtCodigo.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Selecione um funcionário na tabela para alterar.");
        } else {
        id_funcionario = JOptionPane.showConfirmDialog(null, "Deseja realmente Alterar o funcionário selecionado?", "Confirmação de Alteração", JOptionPane.YES_NO_OPTION);
        if (id_funcionario == JOptionPane.YES_OPTION) {
        int linhaSelecionada = table_Funcionario.getSelectedRow();
        nome_funcionario = txtNome_Usuario.getText();
        endereco_funcionario = txtEndereco_Usuario.getText();
        String id_funcionario_str = table_Funcionario.getValueAt(linhaSelecionada, 0).toString();
        id_funcionario = Integer.parseInt(id_funcionario_str);
        
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
        funcionarioDTO.setId_funcionario(id_funcionario);
        funcionarioDTO.setNome_funcionario(nome_funcionario);
        funcionarioDTO.setEndereco_funcionario(endereco_funcionario);
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        funcionarioDAO.alterarFuncionario(funcionarioDTO);
        }
        }
    }

}







