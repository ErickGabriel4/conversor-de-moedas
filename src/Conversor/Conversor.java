package Conversor;

import Model.Rate;

public class Conversor {
    ConsultaExchangerateAPI exchangerateAPI;
    Rate rate;

    public Conversor() {
        this.exchangerateAPI = new ConsultaExchangerateAPI();
        this.rate = exchangerateAPI.consultar("usd");
    }

    public double dolarPraReal(double dolar) {
        return dolar * rate.brl();
    }

    public double realPraDolar(double real){
        return real / rate.brl();
    }

    public double dolarPraPesoArgentino(double dolar){
        return dolar * rate.ars();
    }

    public double pesoArgentinoPraDolar(double peso){
        return peso / rate.ars();
    }

    public double dolarPraPesoColombiano(double dolar){
        return dolar * rate.cop();
    }

    public double pesoColombianoPraDolar(double peso){
        return peso / rate.cop();
    }
}
