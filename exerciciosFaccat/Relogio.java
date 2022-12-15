package exerciciosFaccat;

public class Relogio {
    public static void main(String[] args) {

       for(int h = 0; h < 24; h++){
           for (int min = 0 ; min < 60; min++){
               for (int seg = 0; seg < 60; seg++){
                   System.out.println(h + ":" + min + ":" + seg);
               }
           }
       }

    }
}
