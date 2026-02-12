package EjerciciosTarea;
import javax.swing.JOptionPane;
/*
Solicita un número entero n y muestra todos sus múltiplos entre 1 y 100.
 */
public class Multiplos {
    public static void main(String[] args) {
        int n;
        String resultado;
                // Solicita un número entero
                 n = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese un número entero:")
                );

                 resultado = "Múltiplos de " + n + " entre 1 y 100:\n";

                // Recorre los números del 1 al 100
                for (int i = 1; i <= 100; i++) {

                    // Si el residuo de dividir i entre n es 0, es múltiplo
                    if (i % n == 0) {
                        resultado += i + "\n";
                    }
                }

                // Mostrar los múltiplos encontrados
                JOptionPane.showMessageDialog(null, resultado);
            }
        }
