package org.example.converter;



public class EURToSEKConverter implements Converter {
    @Override
    public String getName() {
        return "EUR to SEK";
    }

    @Override
    public double convert(double amount) {
        return amount * 11.3; // exempelväxelkurs
    }
}
