import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaracion de constantes
        final String ARAM = "aram";
        final String NORMAL = "normal";
        final String URF = "urf";
        final String RANKED = "ranked";
        //Declaracion de variables
        String modoDeJuego;

        Scanner read = new Scanner(System.in);


        // Ingresa modo de juego
        System.out.println("Ingrese modo de juego : ");
        modoDeJuego = read.next().toLowerCase();

        /*
            Estructura basica

            switch(condicion){
                case valor_1:
                    Accion 1
                    break;
                case valor_2:
                    Accion 2
                    break;
                default:  //Default es opcional
                    Accion por defecto
            }

         */

        switch(modoDeJuego){
            case ARAM:
                System.out.println("ARAM");
                break;
            case URF:
                System.out.println("URF");
                break;
            case NORMAL:
                System.out.println("NORMAL");
                break;
            case RANKED:
                System.out.println("RANKED");
                break;
            default:
                System.out.println("No existe el modo de juego");
        }

        Scanner read1 = new Scanner(System.in);

        int dia;
        // Ingresa modo de juego
        System.out.println("Ingrese dia : ");
        dia = read1.nextInt();

        switch (dia) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia laboral");
                break;
            case 1:
            case 7:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("La semana solo tiene 7 dias");
                break;
        }
    }
}