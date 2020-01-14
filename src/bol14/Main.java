package bol14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIntroduce unha temperatura en graos centígrados: ");
        float temperatura = sc.nextFloat();

        ConversorTemperaturas obx = new ConversorTemperaturas();
        try {
            System.out.println("Temperatura en graos Farenheit: "+obx.centigradosAFarenheit(temperatura));
            System.out.println("Temperatura en graos Reamur: "+obx.centigradosAReamur(temperatura));
        } catch (TemperaturaErradaExcepcion temperaturaErradaExcepcion) {
            System.out.println("Erro "+temperaturaErradaExcepcion.toString());
        }

    }
}
