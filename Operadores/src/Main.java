public class Main {
    public static void main(String[] args) {
        //region Operadores Aritmeticos
        int numero1 = 20, numero2= 10;
        int resultado;

        resultado = numero1 + numero2;
        resultado = numero1 * numero2;
        resultado = numero1 - numero2;
        resultado = numero1 / numero2;

        numero1--; // numero1 = numero1 - 1
        //numero1++; // numero1 = numero1 + 1

        System.out.println(numero1);

        numero1+=100; // numero1 = numero1 + 100
        numero1-=100; // numero1 = numero1 - 100
        numero1*=100; // numero1 = numero1 * 100
        numero1/=100; // numero1 = numero1 / 100


        System.out.println(numero1);
        //endregion

        //region Operadores Relacionales
        int opRela1 = 20, opRela2= 10;
        boolean resultadoOpRel;
        resultadoOpRel = opRela1 > opRela2;
        System.out.println("Mayor "+ resultadoOpRel);
        resultadoOpRel = opRela1 < opRela2;
        System.out.println("Menor "+resultadoOpRel);
        resultadoOpRel = opRela1 >= opRela2;
        System.out.println("Mayor igual "+resultadoOpRel);
        resultadoOpRel = opRela1 <= opRela2;
        System.out.println("Menor igual "+resultadoOpRel);

        resultadoOpRel = opRela1 == opRela2;

        System.out.println("Igual "+resultadoOpRel);

        resultadoOpRel = opRela1 != opRela2;
        System.out.println("Distinto "+resultadoOpRel);
        //endregion

        //region Operadores logicos
        // && AND
        // || OR
        // ! NOT
        int numLog1 = 10, numLog2= 20;
        boolean resLogicos;
        resLogicos = true && (10 + 20 == 30);
        System.out.println("Res "+resLogicos);

        resLogicos = ( 10 * 1 == 10)&& (10 + 20 != 30);
        System.out.println("Res "+resLogicos);
        //endregion
    }
}