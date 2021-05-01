package com.jododavelha;

import javax.swing.JOptionPane;

/**
 * @author RafaelRodrigues1
 */
public class Bola {
    
    private int b1;
    private int b2;
    private int b3;
    private int b4;
    private int b5;
    private int b6;
    private int b7;
    private int b8;
    private int b9;

    public void verifica(){
        if(b1==1 && b2==1 && b3==1 || b4==1 && b5==1 && b6==1 || b7==1 && b8==1 && b9==1 || b1==1 && b4==1 && b7==1 ||
                b2==1 && b5==1 && b8==1 || b3==1 && b6==1 && b9==1 || b1==1 && b5==1 && b9==1 || b3==1 && b5==1 && b7==1){
            JOptionPane.showMessageDialog(null, "X ganhou!", "Vencedor", 1);
        }
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    public void setB2(int b2) {
        this.b2 = b2;
    }

    public void setB3(int b3) {
        this.b3 = b3;
    }

    public void setB4(int b4) {
        this.b4 = b4;
    }

    public void setB5(int b5) {
        this.b5 = b5;
    }

    public void setB6(int b6) {
        this.b6 = b6;
    }

    public void setB7(int b7) {
        this.b7 = b7;
    }

    public void setB8(int b8) {
        this.b8 = b8;
    }

    public void setB9(int b9) {
        this.b9 = b9;
    }
}
