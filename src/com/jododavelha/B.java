package com.jododavelha;

import javax.swing.JOptionPane;

/**
 * @author RafaelRodrigues1
 */
public class B {
    
    private static int b1;
    private static int b2;
    private static int b3;
    private static int b4;
    private static int b5;
    private static int b6;
    private static int b7;
    private static int b8;
    private static int b9;

    public static void verifica(){
        if(b1==1 && b2==1 && b3==1 || b4==1 && b5==1 && b6==1 || b7==1 && b8==1 && b9==1 || b1==1 && b4==1 && b7==1 ||
                b2==1 && b5==1 && b8==1 || b3==1 && b6==1 && b9==1 || b1==1 && b5==1 && b9==1 || b3==1 && b5==1 && b7==1){
            JOptionPane.showMessageDialog(null, "Bola ganhou!", "Vencedor", 1);
            Velha.vencedor();
            System.exit(0);
        }
    }

    public static void setB1(int b1) {
        B.b1 = b1;
        verifica();
    }

    public static void setB2(int b2) {
        B.b2 = b2;
        verifica();
    }

    public static void setB3(int b3) {
        B.b3 = b3;
        verifica();
    }

    public static void setB4(int b4) {
        B.b4 = b4;
        verifica();
    }

    public static void setB5(int b5) {
        B.b5 = b5;
        verifica();
    }

    public static void setB6(int b6) {
        B.b6 = b6;
        verifica();
    }

    public static void setB7(int b7) {
        B.b7 = b7;
        verifica();
    }

    public static void setB8(int b8) {
        B.b8 = b8;
        verifica();
    }

    public static void setB9(int b9) {
        B.b9 = b9;
        verifica();
    }
}
