/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del día de la semana");
        String cadena = entrada.nextLine();
        
        switch(cadena){
            case "Lunes":
            case "lunes":
                System.out.printf("%s, es el primer dia de la semana\n", cadena);
                break;
            
            case "Martes":
            case "martes":
                System.out.printf("%s, es el segundo dia de la semana\n", cadena);
                break;
            case "Miercoles":
            case "miercoles":
                System.out.printf("%s, es el tercer dia de la semana\n", cadena);
                break;
            case "Jueves":
            case "jueves":
                System.out.printf("%s, es el cuarto dia de la semana\n", cadena);
                break;
            case "Viernes":
            case "VIERNES":
            case "viernes":
                System.out.printf("%s, es el quinto dia de la semana\n", cadena);
                break;
            case "Sabado":
            case "sabado":
                System.out.printf("%s, es el sexto dia de la semana\n", cadena);
                break;
            case "Domingo":
            case "domingo":
                System.out.printf("%s, es el septimo dia de la semana\n", cadena);
                break; 
            default:
                System.out.println("ninguna de las anteriores");
                break;
        }
        
    }
}
