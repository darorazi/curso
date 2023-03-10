import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declaracion de constantes
        final String YASUO = "yasuo";
        final String NIDALEE = "nidalee";
        final String SHACO = "shaco";
        final String ARAM = "aram";
        final String NORMAL = "normal";

        //Declaracion de variables
        String juliCarreaCon;
        String modoDeJuego;

        Scanner read = new Scanner(System.in);
        // Ingresa personaje
        System.out.println("Ingrese con que personaje carrea juli: ");
        juliCarreaCon = read.next().toLowerCase();

        // Ingresa modo de juego
        System.out.println("Ingrese modo de juego : ");
        modoDeJuego = read.next().toLowerCase();

        /*
            AND --> &&
                false && false = false
                false && true = false
                true && false = false
                true && true = true

            OR --> ||
                false && false = false
                false && true = true
                true && false = true
                true && true = true

           ! --> NOT
         */

        //Condicion
        if((juliCarreaCon.equals(YASUO) || juliCarreaCon.equals(SHACO))
                && !modoDeJuego.equals(ARAM)){ //Entra si personaje ingresado es yasuo
            //Condicional anidado
            System.out.println("Modo es aram y champ yasuo o shaco" );
        }else{
            //Si la condicion no se cumple realizas otra accion
            System.out.println("Juli No carrea con :" + juliCarreaCon);
        }
    }
}