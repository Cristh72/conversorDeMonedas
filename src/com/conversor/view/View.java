package com.conversor.view;

import javax.swing.*;

public class View {
    public static int menu() {

        Integer scelta = Integer.parseInt(JOptionPane.showInputDialog(null,"\n********😀 Sea bienvenido/a al conversor de Moneda 😀********\n"
                + "\n"
                + "1) Dólar =>> Peso Argentino 😀 \n"
                + "2) Peso Argentino =>> Dólar 😎\n"
                + "3) Dólar =>> Real brasileño 💃\n"
                + "4) Real Brasileño =>> Dólar 👯\n"
                + "5). Modifica una persona. 🐵\n"
                + "6) Peso colombiano =>> Dólar 🥲\n"
                +"7) Salir\n"
                + "\nElija una opción válida:\b"
                +"\n*********************************\n "));


        return (scelta instanceof Integer && (scelta < 8 && scelta > 0))? scelta:menu();
    }
}
