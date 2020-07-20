package palindromo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Palindromo palind = new Palindromo();
        System.out.println("Escribe una palabra o una frase para saber si es un palíndromo: ");
        String palabra = sc.nextLine();
        char[] matrizFrase = palabra.toCharArray();
        char[] matrizSinEspacios = palind.spacerQuit(matrizFrase);



        for(int i = 0; i < matrizSinEspacios.length; i++){
            System.out.print(matrizSinEspacios[i]);

        }

        System.out.println();
        System.out.println("La frase es un palíndromo? " + palind.isPolindromo(matrizSinEspacios));


    }
}
