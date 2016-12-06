package impresion;

import java.awt.Color;
import java.awt.Font;
import java.util.*;

public class Ejecutable {

    public static void main(String[] args) {
        
        List <String> tempLista=new ArrayList<String>();
        tempLista.add("ESTO ES UNA IMPRESIÓN DE PRUEBA DE UNA LÍNEAS DE TEXTO");
        tempLista.add("La esclavitud no se abolio, se cambio a 8 hs. diarias.");
        tempLista.add("Errar es humano pero hecharle la culpa a otro es más humano todavía.");
        tempLista.add("Si la cara es el espejo del alma, el cuello es el manguito.");
        tempLista.add("Ser supersticioso trae mucha, pero que mucha, mala suerte.");
        
        Font fuente=new Font("Serif", Font.PLAIN, 12);
        Color color=new Color(255,0,0);
        
        Impresora impresora=new Impresora();
        try{
        impresora.imprimirCadenas(tempLista, fuente, color, 842, 595, 60, 60, 10);
        }catch (SecurityException ex){
            System.err.println("No tiene permiso para imprimir. "+ex.getMessage());
        }catch (NullPointerException ex){
            System.err.println("Error al imprimir. "+ex.getMessage());
        }
        System.exit(0);
    }
}
