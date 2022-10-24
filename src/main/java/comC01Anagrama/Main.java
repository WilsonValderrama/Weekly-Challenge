package comC01Anagrama;

/*
* RETO #1
* Funcion que reciba dos palabras y retorne verdadero o falso sea o no anagramas
* - Un anagrama consiste en formar una palabra reordenada TODAS
* las letas de otra palabra inicial
* -No hace falta comrpobar que ambas palabras existen
* -Dos palabras exactamente iguales no son anagrama.
*
* */

public class Main {

    public static String isAnagram(String p1, String p2){
        boolean flat = false;
        int count = 0;
        if (p1.length() == p2.length()){
            for(int i = 0;i < p1.length();i++){
                char letra = p1.charAt(i);
                for(int j = 0; j< p2.length();j++){
                    char letra2 = p2.charAt(j);
                    if(letra == letra2){
                        count++;
                        if (p1.length() == count){
                            return "true";
                        }
                    }
                }
            }
        }
        return "false";
    }


    public static void main(String[] args) {

        String p1 = "sergio";
        String p2 = "riesgu";
        System.out.println(isAnagram(p1,p2));

    }



}
