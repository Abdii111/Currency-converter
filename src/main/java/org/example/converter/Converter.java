package org.example.converter;

public interface Converter {
    String getName();             // T.ex. "USD to SEK"
    double convert(double amount); // Konvertera till SEK
}
