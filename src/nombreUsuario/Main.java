package nombreUsuario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NombreUsuario nu = new NombreUsuario();
        String usuario = "";
        boolean comprobador = false;

        while(!comprobador) {
            System.out.println("Escribe un nombre de usuario: \n" +
                    "Solo se permiten caracteres de la a-z y A-Z.");
            usuario = sc.nextLine();
            comprobador = nu.check(usuario);
            if(!comprobador){
                System.out.println("Caracteres no permitidos.");
            }
        }

        System.out.println("Nombre de usuario: " + usuario);
    }
}
