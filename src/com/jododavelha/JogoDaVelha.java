package com.jododavelha;

import javax.swing.JOptionPane;

/**
 * @author RafaelRodrigues1
 */
public class JogoDaVelha extends javax.swing.JFrame {

    
    public JogoDaVelha() {
        initComponents();
        bola00.setVisible(false);
        x00.setVisible(false);
        bola01.setVisible(false);
        x01.setVisible(false);       
        bola02.setVisible(false);
        x02.setVisible(false);
        bola10.setVisible(false);
        x10.setVisible(false);
        bola11.setVisible(false);
        x11.setVisible(false);       
        bola12.setVisible(false);
        x12.setVisible(false);
        bola20.setVisible(false);
        x20.setVisible(false);
        bola21.setVisible(false);
        x21.setVisible(false);       
        bola22.setVisible(false);
        x22.setVisible(false);
        vez = JOptionPane.showConfirmDialog(null, "Primeira jogada do X?", "Primeira jogada", JOptionPane.YES_NO_OPTION);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl00 = new javax.swing.JLabel();
        lbl01 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        x00 = new javax.swing.JLabel();
        x01 = new javax.swing.JLabel();
        x10 = new javax.swing.JLabel();
        x11 = new javax.swing.JLabel();
        x22 = new javax.swing.JLabel();
        x20 = new javax.swing.JLabel();
        x21 = new javax.swing.JLabel();
        x12 = new javax.swing.JLabel();
        bola20 = new javax.swing.JLabel();
        bola21 = new javax.swing.JLabel();
        bola22 = new javax.swing.JLabel();
        bola01 = new javax.swing.JLabel();
        bola10 = new javax.swing.JLabel();
        bola11 = new javax.swing.JLabel();
        bola12 = new javax.swing.JLabel();
        lbl02 = new javax.swing.JLabel();
        bola02 = new javax.swing.JLabel();
        bola00 = new javax.swing.JLabel();
        x02 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da velha");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl00MouseClicked(evt);
            }
        });
        getContentPane().add(lbl00, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 40, 40));

        lbl01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl01MouseClicked(evt);
            }
        });
        getContentPane().add(lbl01, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 40, 40));

        lbl12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl12MouseClicked(evt);
            }
        });
        getContentPane().add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 40, 40));

        lbl22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl22MouseClicked(evt);
            }
        });
        getContentPane().add(lbl22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 40, 40));

        lbl11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl11MouseClicked(evt);
            }
        });
        getContentPane().add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 40, 40));

        lbl21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl21MouseClicked(evt);
            }
        });
        getContentPane().add(lbl21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 40, 40));

        lbl20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl20MouseClicked(evt);
            }
        });
        getContentPane().add(lbl20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 40, 40));

        lbl10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl10MouseClicked(evt);
            }
        });
        getContentPane().add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 40, 40));

        x00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        getContentPane().add(x00, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        x01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        getContentPane().add(x01, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        x10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        getContentPane().add(x10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        x11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        getContentPane().add(x11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        x22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        getContentPane().add(x22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        x20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        getContentPane().add(x20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        x21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        getContentPane().add(x21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        x12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        getContentPane().add(x12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        bola20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        getContentPane().add(bola20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        bola21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        getContentPane().add(bola21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        bola22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        getContentPane().add(bola22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        bola01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        getContentPane().add(bola01, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        bola10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        getContentPane().add(bola10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        bola11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        getContentPane().add(bola11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        bola12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        getContentPane().add(bola12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        lbl02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl02MouseClicked(evt);
            }
        });
        getContentPane().add(lbl02, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 40, 40));

        bola02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        getContentPane().add(bola02, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        bola00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        getContentPane().add(bola00, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        x02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        getContentPane().add(x02, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/jgvelha.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 214, 209));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aviso(){
        JOptionPane.showMessageDialog(null, "Já jogaram aqui, amigão!");
    }
    
    private void verificaEmpate(int j00, int j01, int j02, int j10, int j11, int j12, int j20, int j21, int j22){
        if(j00==1 && j01==1 && j02==1 && j10==1 && j11==1 && j12==1 && j20==1 && j21==1 && j22==1){
            JOptionPane.showMessageDialog(null, "EMPATE!", "Empate", 1);
        }
    }
    
    private void verificaX(int x00, int x01, int x02, int x10, int x11, int x12, int x20, int x21, int x22){
        if((x00==1 && x01==1 && x02==1) || (x00==1 && x10==1 && x20==1) || (x00==1 && x11==1 && x22==1) ||
                (x01==1 && x11==1 & x21==1) || (x02==1 && x12==1 && x22==1) || (x02==1 && x11==1 && x20==1) || 
                (x10==1 && x11==1 && x12==1) || (x20==1 && x21==1 && x22==1)){
            JOptionPane.showMessageDialog(null, "X ganhou!", "Vencedor", 1);       
        }        
    }
    
    private void verificaBola(int b00, int b01, int b02, int b10, int b11, int b12, int b20, int b21, int b22){
        if((b00==1 && b01==1 && b02==1) || (b00==1 && b10==1 && b20==1) || (b00==1 && b11==1 && b22==1) ||
                (b01==1 && b11==1 & b21==1) || (b02==1 && b12==1 && b22==1) || (b02==1 && b11==1 && b20==1) || 
                (b10==1 && b11==1 && b12==1) || (b20==1 && b21==1 && b22==1)){
            JOptionPane.showMessageDialog(null, "Bola ganhou!", "Vencedor", 1);       
        }
    }
    
    private void lbl02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl02MouseClicked
        if(jogou02 == 1){
            aviso();
        }else if(vez == 1 || vez == 2){
            bola02.setVisible(true);
            jogou02 = 1;
            vez = 0;
            jogB02=1;
            verificaBola(jogB00, jogB01, jogB02, jogB10, jogB11, jogB12, jogB20, jogB21, jogB22);
        }else if(vez == 0 || vez == 2){
            x02.setVisible(true);
            jogou02 = 1; 
            vez = 1;
            jogX02=1;
            verificaX(jogX00, jogX01, jogX02, jogX10, jogX11, jogX12, jogX20, jogX21, jogX22);
        }
        verificaEmpate(jogou00, jogou01, jogou02, jogou10, jogou11, jogou12, jogou20, jogou21, jogou22);
    }//GEN-LAST:event_lbl02MouseClicked

    private void lbl00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl00MouseClicked
        if(jogou00 == 1){
            aviso();
        }
        else if(vez == 1 || vez == 2){
            bola00.setVisible(true);
            jogou00 = 1;
            vez = 0;
            jogB00=1;
            verificaBola(jogB00, jogB01, jogB02, jogB10, jogB11, jogB12, jogB20, jogB21, jogB22);
        }else if(vez == 0 || vez == 2){
            x00.setVisible(true);
            jogou00 = 1; 
            vez = 1;
            jogX00=1;
            verificaX(jogX00, jogX01, jogX02, jogX10, jogX11, jogX12, jogX20, jogX21, jogX22);
        }
        verificaEmpate(jogou00, jogou01, jogou02, jogou10, jogou11, jogou12, jogou20, jogou21, jogou22);
    }//GEN-LAST:event_lbl00MouseClicked

    private void lbl01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl01MouseClicked
        if(jogou01 == 1){
            aviso();
        }
        else if(vez == 1 || vez == 2){
            bola01.setVisible(true);
            jogou01 = 1;
            vez = 0;
            jogB01=1;
            verificaBola(jogB00, jogB01, jogB02, jogB10, jogB11, jogB12, jogB20, jogB21, jogB22);
        }else if(vez == 0 || vez == 2){
            x01.setVisible(true);
            jogou01 = 1; 
            vez = 1;
            jogX01=1;
            verificaX(jogX00, jogX01, jogX02, jogX10, jogX11, jogX12, jogX20, jogX21, jogX22);
        }
        verificaEmpate(jogou00, jogou01, jogou02, jogou10, jogou11, jogou12, jogou20, jogou21, jogou22);
    }//GEN-LAST:event_lbl01MouseClicked

    private void lbl12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl12MouseClicked
        if(jogou12 == 1){
            aviso();
        }
        else if(vez == 1 || vez == 2){
            bola12.setVisible(true);
            jogou12 = 1;
            vez = 0;
            jogB12=1;
            verificaBola(jogB00, jogB01, jogB02, jogB10, jogB11, jogB12, jogB20, jogB21, jogB22);
        }else if(vez == 0 || vez == 2){
            x12.setVisible(true);
            jogou12 = 1; 
            vez = 1;
            jogX12=1;
            verificaX(jogX00, jogX01, jogX02, jogX10, jogX11, jogX12, jogX20, jogX21, jogX22);
        }
        verificaEmpate(jogou00, jogou01, jogou02, jogou10, jogou11, jogou12, jogou20, jogou21, jogou22);
    }//GEN-LAST:event_lbl12MouseClicked

    private void lbl22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl22MouseClicked
        if(jogou22 == 1){
            aviso();
        }
        else if(vez == 1 || vez == 2){
            bola22.setVisible(true);
            jogou22 = 1;
            vez = 0;
            jogB22=1;
            verificaBola(jogB00, jogB01, jogB02, jogB10, jogB11, jogB12, jogB20, jogB21, jogB22);
        }else if(vez == 0 || vez == 2){
            x22.setVisible(true);
            jogou22 = 1; 
            vez = 1;
            jogX22=1;
            verificaX(jogX00, jogX01, jogX02, jogX10, jogX11, jogX12, jogX20, jogX21, jogX22);
        }
        verificaEmpate(jogou00, jogou01, jogou02, jogou10, jogou11, jogou12, jogou20, jogou21, jogou22);
    }//GEN-LAST:event_lbl22MouseClicked

    private void lbl11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl11MouseClicked
        if(jogou11 == 1){
            aviso();
        }
        else if(vez == 1 || vez == 2){
            bola11.setVisible(true);
            jogou11 = 1;
            vez = 0;
            jogB11=1;
            verificaBola(jogB00, jogB01, jogB02, jogB10, jogB11, jogB12, jogB20, jogB21, jogB22);
        }else if(vez == 0 || vez == 2){
            x11.setVisible(true);
            jogou11 = 1; 
            vez = 1;
            jogX11=1;
            verificaX(jogX00, jogX01, jogX02, jogX10, jogX11, jogX12, jogX20, jogX21, jogX22);
        }
        verificaEmpate(jogou00, jogou01, jogou02, jogou10, jogou11, jogou12, jogou20, jogou21, jogou22);
    }//GEN-LAST:event_lbl11MouseClicked

    private void lbl21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl21MouseClicked
        if(jogou21 == 1){
            aviso();
        }
        else if(vez == 1 || vez == 2){
            bola21.setVisible(true);
            jogou21 = 1;
            vez = 0;
            jogB21=1;
            verificaBola(jogB00, jogB01, jogB02, jogB10, jogB11, jogB12, jogB20, jogB21, jogB22);
        }else if(vez == 0 || vez == 2){
            x21.setVisible(true);
            jogou21 = 1; 
            vez = 1;
            jogX21=1;
            verificaX(jogX00, jogX01, jogX02, jogX10, jogX11, jogX12, jogX20, jogX21, jogX22);
        }
        verificaEmpate(jogou00, jogou01, jogou02, jogou10, jogou11, jogou12, jogou20, jogou21, jogou22);
    }//GEN-LAST:event_lbl21MouseClicked

    private void lbl20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl20MouseClicked
        if(jogou20 == 1){
            aviso();
        }
        else if(vez == 1 || vez == 2){
            bola20.setVisible(true);
            jogou20 = 1;
            vez = 0;
            jogB20=1;
            verificaBola(jogB00, jogB01, jogB02, jogB10, jogB11, jogB12, jogB20, jogB21, jogB22);
        }else if(vez == 0 || vez == 2){
            x20.setVisible(true);
            jogou20 = 1; 
            vez = 1;
            jogX20=1;
            verificaX(jogX00, jogX01, jogX02, jogX10, jogX11, jogX12, jogX20, jogX21, jogX22);
        }
        verificaEmpate(jogou00, jogou01, jogou02, jogou10, jogou11, jogou12, jogou20, jogou21, jogou22);
    }//GEN-LAST:event_lbl20MouseClicked

    private void lbl10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl10MouseClicked
        if(jogou10 == 1){
            aviso();
        }
        else if(vez == 1 || vez == 2){
            bola10.setVisible(true);
            jogou10 = 1;
            vez = 0;
            jogB10=1;
            verificaBola(jogB00, jogB01, jogB02, jogB10, jogB11, jogB12, jogB20, jogB21, jogB22);
        }else if(vez == 0 || vez == 2){
            x10.setVisible(true);
            jogou10 = 1; 
            vez = 1;
            jogX10=1;
            verificaX(jogX00, jogX01, jogX02, jogX10, jogX11, jogX12, jogX20, jogX21, jogX22);
        }
        verificaEmpate(jogou00, jogou01, jogou02, jogou10, jogou11, jogou12, jogou20, jogou21, jogou22);
    }//GEN-LAST:event_lbl10MouseClicked

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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }
    int vez = 2;
    int jogou00=0, jogou01=0, jogou02=0, jogou10=0, jogou11=0, jogou12=0, jogou20=0, jogou21=0, jogou22=0;
    int jogX00=0, jogX01=0, jogX02=0, jogX10=0, jogX11=0, jogX12=0, jogX20=0, jogX21=0, jogX22=0;
    int jogB00=0, jogB01=0, jogB02=0, jogB10=0, jogB11=0, jogB12=0, jogB20=0, jogB21=0, jogB22=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bola00;
    private javax.swing.JLabel bola01;
    private javax.swing.JLabel bola02;
    private javax.swing.JLabel bola10;
    private javax.swing.JLabel bola11;
    private javax.swing.JLabel bola12;
    private javax.swing.JLabel bola20;
    private javax.swing.JLabel bola21;
    private javax.swing.JLabel bola22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl00;
    private javax.swing.JLabel lbl01;
    private javax.swing.JLabel lbl02;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel x00;
    private javax.swing.JLabel x01;
    private javax.swing.JLabel x02;
    private javax.swing.JLabel x10;
    private javax.swing.JLabel x11;
    private javax.swing.JLabel x12;
    private javax.swing.JLabel x20;
    private javax.swing.JLabel x21;
    private javax.swing.JLabel x22;
    // End of variables declaration//GEN-END:variables
}
