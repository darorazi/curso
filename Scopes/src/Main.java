public class Main {
    public static void main(String[] args) {
        //Scopes Main

        //Declaracion de variables
        Boolean juliCarrea = false;


        if(juliCarrea){
            // Scope if juliCarrea
            Boolean juliCarreaConShaco = true;
            System.out.println("juliCarrea es accesible");
            System.out.println("juliCarreaConShaco tambien es accesible");
            if(juliCarreaConShaco){
                System.out.println("juliCarrea es accesible");
                System.out.println("juliCarreaConShaco tambien es accesible");

                if(true){
                    System.out.println("juliCarrea es accesible");
                    System.out.println("juliCarreaConShaco tambien es accesible");
                }
            }
            // Scope if juliCarrea
        }else{
            // Scope else juliCarrea
            System.out.println("juliCarrea es accesible");
            System.out.println("juliCarreaConShaco no es accesible");
        }

        System.out.println("juliCarrea es accesible");
        System.out.println("juliCarreaConShaco no es accesible");

        //Fin Scopes Main
    }
}