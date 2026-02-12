package EjerciciosTarea;
import javax.swing.JOptionPane;
/*
Solicita una palabra y cuenta cuántas vocales contiene.
 */
public class Vocales {
    public static void main(String[] args) {
                String palabra;
        int contador = 0;
                // Pedimos una palabra
                 palabra = JOptionPane.showInputDialog("Ingrese una palabra:");

                palabra = palabra.toLowerCase(); // Convertimos a minúsculas fue investigado de java practicas



                // Recorremos cada letra de la palabra
                for (int i = 0; i < palabra.length(); i++) {//length sirve para saber el tamaño o la cantidad de elementos que tiene algo.

                    char letra = palabra.charAt(i); // charAt sirve para obtener un carácter (una letra) específico de un texto (String) según su posición.

                    // Verifica si la letra es vocal
                    if (letra == 'a' || letra == 'e' || letra == 'i'
                            || letra == 'o' || letra == 'u') {
                        contador++; // Aumenta contador
                    }
                }

                // Mostrar resultado
                JOptionPane.showMessageDialog(null,
                        "La palabra tiene " + contador + " vocal(es).");
            }
        }


