
package g4s21p8cafa;

import java.util.StringTokenizer;

public class JRespuestas {

    String[] respuestas = {
      "1978","12 de octubre","Adolfo Suarez","1991","4 de julio"
    };
    
    String[] radioR = {
        "1978,1980,1800,1878",
        "12 de octubre,6 de agosto,1 de mayo,25 de diciembre",
        "Francisco Franco,Luis Carrero Blanco,Adolfo Suarez,Juan Carlos I",
        "1991,1992,1990,1989",
        "5 de marzo,15 de mayo,26 de septtiembre,4 de julio"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
