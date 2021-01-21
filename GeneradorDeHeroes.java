import java.util.*;

public class GeneradorDeHeroes {
    public static void main(String[] args) {

        String[] nombres = new String[8];
        String[] poderes = new String[10];
        String[] alias = new String[10];
        String[] nacionalidad = new String[10];
        String[] heroes = new String[8];

        nombres[0] = "Ines";
        nombres[1] = "Adolfo";
        nombres[2] = "Sergio";
        nombres[3] = "Felicidad";
        nombres[4] = "Uriel";
        nombres[5] = "Pablo";
        nombres[6] = "Adriana";
        nombres[7] = "Leire";

        poderes[0] = "Super Fuerza";
        poderes[1] = "Saliva corrosiva";
        poderes[2] = "Invisivilidad";
        poderes[3] = "Elasticidad";
        poderes[4] = "Mocos explosivos";
        poderes[5] = "Hablar con ardillas";
        poderes[6] = "Se convierte en piedra";
        poderes[7] = "Super velocidad";
        poderes[8] = "Dobla Cucharas";
        poderes[9] = "Es capaz de ver el presente";

        alias[0] = "El Hombre de negro";
        alias[1] = "Papichulo";
        alias[2] = "Petardilla";
        alias[3] = "Matador";
        alias[4] = "Cara de Huevo";
        alias[5] = "Negrito ojos claros";
        alias[6] = "Boca Seca";
        alias[7] = "Minguito";
        alias[8] = "Hocico perro";
        alias[9] = "Mugroso";

        nacionalidad[1] = "España";
        nacionalidad[2] = "Argentina";
        nacionalidad[3] = "Mexico";
        nacionalidad[4] = "Estados Unidos";
        nacionalidad[5] = "Francia";
        nacionalidad[6] = "Gran Bretaña";
        nacionalidad[7] = "Rusia";
        nacionalidad[8] = "Italia";
        nacionalidad[9] = "Brasil";



        for(int i=0;i<heroes.length;i++){
            heroes[i] = nombres[(int)(Math.random()*8)]+ " " + poderes[(int)(Math.random()*10)]
             + " alias el/la " + alias[(int)(Math.random()*10)] + " de " + nacionalidad[(int)(Math.random()*10)];  
        }

        for(int i=0;i<heroes.length;i++){
            System.out.println(heroes[i]);
        }

    }
}