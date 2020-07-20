package palindromo;

public class Palindromo {

    public char[] spacerQuit(char[] arrayWithSpaces){
        int contador = arrayWithSpaces.length; //contador servirá para calcular la longitud de la array sin espacios
        for (int i = 0; i < arrayWithSpaces.length; i++){
            while(arrayWithSpaces[i] == ' '){ //while por si se juntan dos espacios.
                for(int j = i; j< arrayWithSpaces.length-1; j++) { //con este 'for' se mueve el espacio al final de la array
                    arrayWithSpaces[j] = arrayWithSpaces[j+1];
                }
                contador--; //por cada espacio apartado al final de la array, la array sin espacios tendrá -1 de longitud.
            }
        }
        char[] arrayWithoutSpaces = new char[contador];
        for(int i = 0; i < arrayWithoutSpaces.length; i++){  //se copia la array con los espacios a la derecha en una array sin espacios
            arrayWithoutSpaces[i] = arrayWithSpaces[i];

        }
        return arrayWithoutSpaces;
    }

    public boolean isPolindromo(char[] array){  //boolean empieza en true, si encuentra que una de las dos letras 'espejo' no coinciden, se quedará en false
        boolean isOrNot = true;
        for(int i = 0; i<array.length; i++){
            if(array[i] != array[array.length-i-1]){
                isOrNot = false;
            }
        }
        return isOrNot;
    }
}
