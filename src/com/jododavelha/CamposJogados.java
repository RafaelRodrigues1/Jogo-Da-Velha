package com.jododavelha;

import javax.swing.JOptionPane;

/**
 * @author RafaelRodrigues1
 */
public class CamposJogados {
    
    private static int campo1=0;
    private static int campo2=0;
    private static int campo3=0;
    private static int campo4=0;
    private static int campo5=0;
    private static int campo6=0;
    private static int campo7=0;
    private static int campo8=0;
    private static int campo9=0;
    
    public static boolean verifica(int campo){
        if(campo==1){
            JOptionPane.showMessageDialog(null, "Já jogaram aqui, amigão!");
            return false;
        }else{
            return true;
        }
    }

    public static void setCampo1(int campo1) {
        CamposJogados.campo1 = campo1;
    }

    public static void setCampo2(int campo2) {
        CamposJogados.campo2 = campo2;
    }

    public static void setCampo3(int campo3) {
        CamposJogados.campo3 = campo3;
    }

    public static void setCampo4(int campo4) {
        CamposJogados.campo4 = campo4;
    }

    public static void setCampo5(int campo5) {
        CamposJogados.campo5 = campo5;
    }

    public static void setCampo6(int campo6) {
        CamposJogados.campo6 = campo6;
    }

    public static void setCampo7(int campo7) {
        CamposJogados.campo7 = campo7;
    }

    public static void setCampo8(int campo8) {
        CamposJogados.campo8 = campo8;
    }

    public static void setCampo9(int campo9) {
        CamposJogados.campo9 = campo9;
    }
    
}
