package exerciciosFaccat;

import java.util.Scanner;

public class Temporizador {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe quantos minutos gostaria de contar?");
        int minn = leitor.nextInt();
        System.out.println("A partir de quantos segundos?");
        int segg = leitor.nextInt();
        System.out.println("-------------------------------");

        for(int min = minn ; min >= 0; min--){
            for(int seg = segg ; seg >= 0; seg--){
                System.out.println(min + ":" + seg);
            }
        }
        leitor.close();
    }
}


