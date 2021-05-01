package com.jododavelha;

import javax.swing.JOptionPane;

/**
 * @author RafaelRodrigues1
 */
public class X {
    
    private int x1;
    private int x2;
    private int x3;
    private int x4;
    private int x5;
    private int x6;
    private int x7;
    private int x8;
    private int x9;

    public void verifica(){
        if(x1==1 && x2==1 && x3==1 || x4==1 && x5==1 && x6==1 || x7==1 && x8==1 && x9==1 || x1==1 && x4==1 && x7==1 ||
                x2==1 && x5==1 && x8==1 || x3==1 && x6==1 && x9==1 || x1==1 && x5==1 && x9==1 || x3==1 && x5==1 && x7==1){
            JOptionPane.showMessageDialog(null, "X ganhou!", "Vencedor", 1);
        }
    }
    
    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public void setX5(int x5) {
        this.x5 = x5;
    }

    public void setX6(int x6) {
        this.x6 = x6;
    }

    public void setX7(int x7) {
        this.x7 = x7;
    }

    public void setX8(int x8) {
        this.x8 = x8;
    }

    public void setX9(int x9) {
        this.x9 = x9;
    }
    
    
}
