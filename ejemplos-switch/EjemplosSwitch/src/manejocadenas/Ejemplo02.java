/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {
    
    public static void main(String[] args) {
        String pais;
        
        pais = "Ecuador";
        /* el metodo charArt en este caso sirve para que relacione los numeros\
        con las letras, por ejemplo la el cero es la primera letra del pais que 
        seria la E*/
        char letra = pais.charAt(0);
        System.out.printf("%s\n", letra);
        
    }
}
