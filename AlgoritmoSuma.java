import java.util.*;
public class AlgoritmoSuma {
    public static void main(String[] args) {
        //Suma de 2 numero sin hacer suma entre ellos y no guardar variable el resultado.
        int num1;
        int num2;

        System.out.println("Indique el numero 1: ");
        Scanner sc= new Scanner (System.in);
        num1=sc.nextInt();

        System.out.println("Indique el numero 2: ");
        num2=sc.nextInt();

        for (;num2>0;num2--) num1++;
        /*otra opción
        while (num2>0) {
            num1++;
            num2--;
        }*/
        System.out.println("La suma es: " + num1);
    }
}
