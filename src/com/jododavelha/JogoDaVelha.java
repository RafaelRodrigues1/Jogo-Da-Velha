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
        java.awt.GridBagConstraints gridBagConstraints;

        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
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
        bola02 = new javax.swing.JLabel();
        bola00 = new javax.swing.JLabel();
        x02 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da velha");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl1MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 70, 0, 0);
        getContentPane().add(lbl1, gridBagConstraints);

        lbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl2MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 20, 0, 0);
        getContentPane().add(lbl2, gridBagConstraints);

        lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl3MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 20, 0, 0);
        getContentPane().add(lbl3, gridBagConstraints);

        lbl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl4MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 70, 0, 0);
        getContentPane().add(lbl4, gridBagConstraints);

        lbl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl5MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        getContentPane().add(lbl5, gridBagConstraints);

        lbl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl6MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        getContentPane().add(lbl6, gridBagConstraints);

        lbl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl7MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 70, 0, 0);
        getContentPane().add(lbl7, gridBagConstraints);

        lbl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl8MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        getContentPane().add(lbl8, gridBagConstraints);

        lbl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl9MouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        getContentPane().add(lbl9, gridBagConstraints);

        x00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 70, 0, 0);
        getContentPane().add(x00, gridBagConstraints);

        x01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 20, 0, 0);
        getContentPane().add(x01, gridBagConstraints);

        x10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 70, 0, 0);
        getContentPane().add(x10, gridBagConstraints);

        x11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        getContentPane().add(x11, gridBagConstraints);

        x22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        getContentPane().add(x22, gridBagConstraints);

        x20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 70, 0, 0);
        getContentPane().add(x20, gridBagConstraints);

        x21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        getContentPane().add(x21, gridBagConstraints);

        x12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        getContentPane().add(x12, gridBagConstraints);

        bola20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 70, 0, 0);
        getContentPane().add(bola20, gridBagConstraints);

        bola21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        getContentPane().add(bola21, gridBagConstraints);

        bola22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        getContentPane().add(bola22, gridBagConstraints);

        bola01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 20, 0, 0);
        getContentPane().add(bola01, gridBagConstraints);

        bola10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 70, 0, 0);
        getContentPane().add(bola10, gridBagConstraints);

        bola11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        getContentPane().add(bola11, gridBagConstraints);

        bola12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        getContentPane().add(bola12, gridBagConstraints);

        bola02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 20, 0, 0);
        getContentPane().add(bola02, gridBagConstraints);

        bola00.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/bola.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 70, 0, 0);
        getContentPane().add(bola00, gridBagConstraints);

        x02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/x.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 20, 0, 0);
        getContentPane().add(x02, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jododavelha/imagens/jgvelha.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 50, 48, 63);
        getContentPane().add(jLabel1, gridBagConstraints);

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
    
    private void lbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl3MouseClicked
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
    }//GEN-LAST:event_lbl3MouseClicked

    private void lbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl1MouseClicked
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
    }//GEN-LAST:event_lbl1MouseClicked

    private void lbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl2MouseClicked
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
    }//GEN-LAST:event_lbl2MouseClicked

    private void lbl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl6MouseClicked
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
    }//GEN-LAST:event_lbl6MouseClicked

    private void lbl9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl9MouseClicked
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
    }//GEN-LAST:event_lbl9MouseClicked

    private void lbl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl5MouseClicked
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
    }//GEN-LAST:event_lbl5MouseClicked

    private void lbl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl8MouseClicked
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
    }//GEN-LAST:event_lbl8MouseClicked

    private void lbl7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl7MouseClicked
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
    }//GEN-LAST:event_lbl7MouseClicked

    private void lbl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl4MouseClicked
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
    }//GEN-LAST:event_lbl4MouseClicked

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
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
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
