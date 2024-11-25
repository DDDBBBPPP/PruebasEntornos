package ejerciciotdd;

public class EjercicioTDD {

    public static String invertirCadena(String cadena){

        String cadenaInvertida = "";

        for(int i = 0;i<cadena.length();i++){
            cadenaInvertida = cadena.charAt(i) + cadenaInvertida;
        }

        return cadenaInvertida;
    }

    public static boolean palindromo(String cadena){
        String cadenaInvertida = "";

        for(int i = 0;i<cadena.length();i++){
            cadenaInvertida = cadena.charAt(i) + cadenaInvertida;
        }
        
        return(cadenaInvertida.equals(cadena));


    }

    public static int contarConsonantes(String cadena){
        int contador = 0;
        
        for(int i = 0;i<cadena.length();i++){
          
            if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'){

            }else{
                contador +=1;
            }
        }
        return contador;

    }

    public static boolean mayuscula(String cadena){
        int i;
        for(i = 0;i<cadena.length();i++){
          if(Character.isUpperCase(cadena.charAt(i))){

          }else{
            i = (cadena.length() + 1);
          }
        }
        return (i==cadena.length());

    }
    
    

}
;