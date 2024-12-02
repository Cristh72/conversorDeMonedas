package com.conversor;

import com.conversor.connections.ConsultaApiMoneda;
import com.conversor.view.View;

public class Main {
    public static void main(String[] args) {

        View.menu();

        ConsultaApiMoneda consultaApiMoneda = new ConsultaApiMoneda();

        System.out.println(consultaApiMoneda.ricercaDivisa("COP","USD").getClass());

    }
}