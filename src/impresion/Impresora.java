package impresion;

import java.awt.*;

/**
 * @author www.borjaro2000.tk
 */
public class Impresora {
    private PrintJob pj;
    private Graphics pagina;

    Impresora() {
    }

    //Método para imprimir cadenas de texto.
    public void imprimirCadenas(java.util.List<String> cadenas, Font fuente, Color color, int alturaImpresion, int anchoImpresion, int margenIzquierdo, int margenSuperior, int margenEntreLineas) throws NullPointerException, SecurityException {
        Frame marco = new Frame();
        marco.setSize(anchoImpresion, alturaImpresion); //Establecemos el tamaño de impresión
        pj = Toolkit.getDefaultToolkit().getPrintJob(marco, "Impresión de prueba", null); //Objeto padre, nombre, propiedades.

            pagina = pj.getGraphics();
            pagina.setFont(fuente);
            pagina.setColor(color);

            for (int i = 0; i < cadenas.size(); i++) {
                pagina.drawString(cadenas.get(i), margenIzquierdo, margenSuperior + ((fuente.getSize() + margenEntreLineas) * i));
            }
            //Cerramos todos los flujos abiertos.
            pagina.dispose();
            pj.end();

    }
}
