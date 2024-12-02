package com.conversor.modelos;

public class MonedaDTO {

    private String monedaInicial;
    private String monedaFinal;

    private Double valutaDivisa;

    public MonedaDTO(String monedaInicial, String monedaFinal, Double valutaDivisa) {
        this.monedaInicial = monedaInicial;
        this.monedaFinal = monedaFinal;
        this.valutaDivisa = valutaDivisa;
    }

    public MonedaDTO(Moneda moneda){
        this.monedaInicial = moneda.base_code();
        this.monedaFinal = moneda.target_code();
        this.valutaDivisa = moneda.conversion_rate();
    }

    public String getMonedaInicial() {
        return monedaInicial;
    }

    public void setMonedaInicial(String monedaInicial) {
        this.monedaInicial = monedaInicial;
    }

    public String getMonedaFinal() {
        return monedaFinal;
    }

    public void setMonedaFinal(String monedaFinal) {
        this.monedaFinal = monedaFinal;
    }

    public Double getValutaDivisa() {
        return valutaDivisa;
    }

    public void setValutaDivisa(Double valutaDivisa) {
        this.valutaDivisa = valutaDivisa;
    }

    @Override
    public String toString() {
        return "MonedaDTO{" +
                "monedaInicial='" + monedaInicial + '\'' +
                ", monedaFinal='" + monedaFinal + '\'' +
                ", valutaDivisa=" + valutaDivisa +
                '}';
    }
}
