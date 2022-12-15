package exerciciosFaccat;
import java.util.Scanner;
public class ConverterParaCelsius {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

       System.out.println("Informe uma temperatura em Fahrenheit");
       int grausFahrenheit = leitor.nextInt();

       float grausCelsius = (grausFahrenheit-32)*5/9 ;
       System.out.println("----------------------------------------------------");
       System.out.println(grausFahrenheit + "°F é igual a " + grausCelsius + "°C");
    }
}
