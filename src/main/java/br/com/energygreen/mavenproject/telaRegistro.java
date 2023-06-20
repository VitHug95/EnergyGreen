/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.energygreen.mavenproject;

import static java.time.Clock.system;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class telaRegistro extends javax.swing.JFrame {

    /**
     * Creates new form telaRegistro
     */
    public telaRegistro() {
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

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtKwh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxRegiao = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        valorConta = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        valorEconomia = new javax.swing.JTextField();
        valorDesconto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbxMes = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Calculo de Conversão");

        jLabel1.setText("Insira o KWh");

        txtKwh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKwhActionPerformed(evt);
            }
        });

        jLabel5.setText("Período Inicial");

        jLabel8.setText("Insira região");

        cbxRegiao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a região", "São Paulo", "Rio de Janeiro", "Belo Horizonte", "Vitória" }));
        cbxRegiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRegiaoActionPerformed(evt);
            }
        });

        jButton5.setText("Calcular");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        valorConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorContaActionPerformed(evt);
            }
        });

        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultados Obtidos");

        jLabel9.setText("Valor de Desconto");

        jLabel10.setText("Valor da Conta");

        valorEconomia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorEconomiaActionPerformed(evt);
            }
        });

        valorDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorDescontoActionPerformed(evt);
            }
        });

        jLabel11.setText("Valor com Economia");

        cbxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um mês", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        cbxMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMesActionPerformed(evt);
            }
        });

        jButton2.setText("Salvar Registro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valorConta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valorEconomia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jButton2))
                                    .addComponent(valorDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(cbxRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKwh, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(cbxMes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKwh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(cbxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbxRegiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorEconomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKwhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKwhActionPerformed
        // TODO add your handling code he
                
    }//GEN-LAST:event_txtKwhActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String selecionarOpcao = cbxRegiao.getSelectedItem().toString();
        double fator = 0;
        
      if (txtKwh.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Digite um valor válido para KWh.");
        return; // Encerrar o método sem continuar o cálculo
        }
      
      if (cbxMes.getSelectedIndex()== 0) {
        JOptionPane.showMessageDialog(null, "Insira um mês.");
        return; // Encerrar o método sem continuar o cálculo
        }
      
      if (cbxRegiao.getSelectedIndex()== 0) {
        JOptionPane.showMessageDialog(null, "Insira uma região.");
        return; // Encerrar o método sem continuar o cálculo
        }
      
      if(selecionarOpcao.isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecionar Opcao válida"
                    + "(Sao Paulo, Rio de Janeiro, Belo Horizonte ou Vitória)");
        } else {
        switch (cbxRegiao.getSelectedItem().toString()){
            case "São Paulo" -> fator = 0.2;
            case "Rio de Janeiro" -> fator = 0.3;
            case "Belo Horizonte" -> fator = 0.4;
            case "Vitória" -> fator = 0.5;  
            }
        }
        
        try {       
        calculoConversao a = new calculoConversao(Double.parseDouble(txtKwh.getText()), fator);
        double b = a.calcularEconomia();
        valorEconomia.setText(String.format("R$ %.2f",b));
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite um valor válido para KWh.");            
            
        }
        
        calculoConversao calculo = new calculoConversao(Double.parseDouble(txtKwh.getText()), fator);
        double tarifaComum = calculo.calcularTarifaComum();
        valorConta.setText(String.format("R$ %.2f",tarifaComum));
        
        calculoConversao desconto = new calculoConversao (Double.parseDouble(txtKwh.getText()), fator);
        double tarifaDesconto = desconto.calculoConversao();
        valorDesconto.setText(String.format("R$ %.2f",tarifaDesconto));
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        new telaCliente().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxRegiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRegiaoActionPerformed

    }//GEN-LAST:event_cbxRegiaoActionPerformed

    private void valorContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorContaActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void valorEconomiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorEconomiaActionPerformed
       
    }//GEN-LAST:event_valorEconomiaActionPerformed

    private void valorDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorDescontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorDescontoActionPerformed

    private void cbxMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        double kwh = Double.parseDouble(txtKwh.getText());
        int mes = cbxMes.getSelectedIndex();
        int ano = Integer.parseInt(txtAno.getText());
        String regiao = cbxRegiao.getSelectedItem().toString();
        
        String[] conversao1;        
        conversao1 = valorConta.getText().split(" ");
        double conv1 = Double.parseDouble(conversao1[1].replace(",", "."));
 
        String[] conversao2;        
        conversao2 = valorDesconto.getText().split(" ");
        double conv2 = Double.parseDouble(conversao2[1].replace(",", "."));
        
        String[] conversao3;        
        conversao3 = valorEconomia.getText().split(" ");
        double conv3 = Double.parseDouble(conversao3[1].replace(",", "."));
        
        Registro novoRegistro = new Registro(kwh, mes, ano, regiao, conv1, conv2, conv3);
        
        RegistroRepository registroRepository = new RegistroRepository();
        registroRepository.addRegis(novoRegistro);
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(telaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxMes;
    private javax.swing.JComboBox<String> cbxRegiao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtKwh;
    private javax.swing.JTextField valorConta;
    private javax.swing.JTextField valorDesconto;
    private javax.swing.JTextField valorEconomia;
    // End of variables declaration//GEN-END:variables
}
