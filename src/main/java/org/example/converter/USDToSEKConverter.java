package org.example.converter;

public class USDToSEKConverter implements Converter {
    @Override
    public String getName() {
        return "USD to SEK";
    }

    @Override
    public double convert(double amount) {
        return amount * 10.5; // exempelväxelkurs
    }
}
