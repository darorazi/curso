

public class Main {
    public static void main(String[] args) {
        String nombre = "julian di santi";
        String nombre1 = new String("GUILLERMO");
        String nombre2 = "saddsadsadsa";
        String nombre3 = "              saddsadsadsa          ";

        //Concatenacion
        System.out.println(nombre + nombre1);
        System.out.println(nombre.concat(nombre1).concat(nombre2));

        //Lenght la cantidad de caracteres
        System.out.println(nombre.length());

        //Contains si un string contiene otro string
        System.out.println(nombre.contains("AH"));

        //starsWith si un string empieza con otro string
        System.out.println(nombre.startsWith("A"));

        //endsWith si un string termina con otro string
        System.out.println(nombre.endsWith("ler"));

        //toLowerCase
        System.out.println(nombre.toLowerCase());

        //toUpperCase
        System.out.println(nombre2.toUpperCase());

        //toLowerCase
        System.out.println(nombre.toLowerCase().endsWith("ler"));

        //trim
        System.out.println(nombre3.trim());
        
    }
}