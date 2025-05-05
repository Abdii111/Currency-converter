package org.example;

import org.example.converter.Converter;

import java.util.Scanner;
import java.util.ServiceLoader;

public class App {
    public static void main(String[] args) {
        ServiceLoader<Converter> loader = ServiceLoader.load(Converter.class);
        Scanner scanner = new Scanner(System.in);

        Converter[] converters = loader.stream()
                .map(ServiceLoader.Provider::get)
                .toArray(Converter[]::new);

        System.out.println("Välj en konverterare:");
        for (int i = 0; i < converters.length; i++) {
            System.out.println((i + 1) + ". " + converters[i].getName());
        }

        int choice = scanner.nextInt();
        System.out.println("Ange belopp att konvertera:");
        double amount = scanner.nextDouble();

        Converter selected = converters[choice - 1];
        double result = selected.convert(amount);
        System.out.println("Resultat: " + result + " SEK");
    }
}
