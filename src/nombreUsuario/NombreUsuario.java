package nombreUsuario;

public class NombreUsuario {

    public boolean check(String usuario){
        char[] matrizUsuario = usuario.toCharArray();
        for(int i = 0; i < matrizUsuario.length; i++) {
            if (matrizUsuario[i] >= 65 && matrizUsuario[i] <= 90 || matrizUsuario[i] >= 97 && matrizUsuario[i] <= 122) {
                }else{
                return false;
            }
        }
        return true;
    }
}
