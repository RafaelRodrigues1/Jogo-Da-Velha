package com.jododavelha;

import javax.swing.JOptionPane;

/**
 * @author RafaelRodrigues1
 */
public class X {
    
    private static int x1;
    private static int x2;
    private static int x3;
    private static int x4;
    private static int x5;
    private static int x6;
    private static int x7;
    private static int x8;
    private static int x9;

    public static void verifica(){
        if(x1==1 && x2==1 && x3==1 || x4==1 && x5==1 && x6==1 || x7==1 && x8==1 && x9==1 || x1==1 && x4==1 && x7==1 ||
                x2==1 && x5==1 && x8==1 || x3==1 && x6==1 && x9==1 || x1==1 && x5==1 && x9==1 || x3==1 && x5==1 && x7==1){
            JOptionPane.showMessageDialog(null, "X ganhou!", "Vencedor", 1);
            Velha.vencedor();
        }
    }

    public static void setX1(int x1) {
        X.x1 = x1;
        verifica();
    }

    public static void setX2(int x2) {
        X.x2 = x2;
        verifica();
    }

    public static void setX3(int x3) {
        X.x3 = x3;
        verifica();
    }

    public static void setX4(int x4) {
        X.x4 = x4;
        verifica();
    }

    public static void setX5(int x5) {
        X.x5 = x5;
        verifica();
    }

    public static void setX6(int x6) {
        X.x6 = x6;
        verifica();
    }

    public static void setX7(int x7) {
        X.x7 = x7;
        verifica();
    }

    public static void setX8(int x8) {
        X.x8 = x8;
        verifica();
    }

    public static void setX9(int x9) {
        X.x9 = x9;
        verifica();
    }    
}
