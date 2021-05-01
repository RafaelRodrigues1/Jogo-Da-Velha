package com.jododavelha;

import javax.swing.JOptionPane;

/**
 * @author RafaelRodrigues1
 */
public abstract class Velha {
    
    private static int campo1;
    private static int campo2;
    private static int campo3;
    private static int campo4;
    private static int campo5;
    private static int campo6;
    private static int campo7;
    private static int campo8;
    private static int campo9;
    private static boolean vencedor;
    private static boolean xJogada;
    private static boolean bJogada;
    
    public static void primeiraJogada(int jogada){
        if(jogada!=1){
            xJogada=true;
        }else{
            bJogada=true;
        }
    }
    
    public static void jogada(){
        if(xJogada){
            xJogada=false;
            bJogada=true;
        }else if(bJogada){
            bJogada=false;
            xJogada=true;
        }
    }
    
    public static boolean verificaJogada(){
        if(xJogada){
            jogada();
            return true;
        }else{
            jogada();
            return false;
        }   
    }
    
    public static void vencedor(){
        vencedor = true;
    }
    
    public static void verificaEmpate(){
        if(!vencedor){
           if(campo1 == 1 && campo2 == 1 && campo3 == 1 && campo4 == 1 && campo5 == 1 && 
                campo6 == 1 && campo7 == 1 && campo8 == 1 && campo9 == 1){
            JOptionPane.showMessageDialog(null, "EMPATE!", "Empate", 1);
            System.exit(0);
            } 
            
        }    
    }
    
    public static boolean verificaCampo(int campo){
        if(campo==1){
            JOptionPane.showMessageDialog(null, "Já jogaram aqui, amigão!");
            return false;
        }else{
            return true;
        }
    }

    public static int getCampo1() {
        return campo1;
    }

    public static void setCampo1(int campo1) {
        Velha.campo1 = campo1;
    }

    public static int getCampo2() {
        return campo2;
    }

    public static void setCampo2(int campo2) {
        Velha.campo2 = campo2;
    }

    public static int getCampo3() {
        return campo3;
    }

    public static void setCampo3(int campo3) {
        Velha.campo3 = campo3;
    }

    public static int getCampo4() {
        return campo4;
    }

    public static void setCampo4(int campo4) {
        Velha.campo4 = campo4;
    }

    public static int getCampo5() {
        return campo5;
    }

    public static void setCampo5(int campo5) {
        Velha.campo5 = campo5;
    }

    public static int getCampo6() {
        return campo6;
    }

    public static void setCampo6(int campo6) {
        Velha.campo6 = campo6;
    }

    public static int getCampo7() {
        return campo7;
    }

    public static void setCampo7(int campo7) {
        Velha.campo7 = campo7;
    }

    public static int getCampo8() {
        return campo8;
    }

    public static void setCampo8(int campo8) {
        Velha.campo8 = campo8;
    }

    public static int getCampo9() {
        return campo9;
    }

    public static void setCampo9(int campo9) {
        Velha.campo9 = campo9;
    }

    public static boolean isbJogada() {
        return bJogada;
    }

    public static void setbJogada(boolean bJogada) {
        Velha.bJogada = bJogada;
    }

}