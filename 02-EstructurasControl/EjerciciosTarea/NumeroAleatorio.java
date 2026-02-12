package EjerciciosTarea;
import javax.swing.JOptionPane;
import java.util.Random;

/*Genera un número aleatorio entre 1 y 50 y permite al usuario adivinarlo, indicando si es
mayor o menor en cada intento.
 */
public class NumeroAleatorio {
    public static void main(String[] args) {

                Random random = new Random(); // Objeto para generar números aleatorios investigacion de java.practicas
                int numeroSecreto = random.nextInt(50) + 1; // Número entre 1 y 50 investigado de java. practicas
                int intento; // Variable para guardar el número ingresado

                // Ciclo que se repite hasta que el usuario adivine
                do {

                    intento = Integer.parseInt(
                            JOptionPane.showInputDialog("Adivina el número (1-50):")
                    );

                    // Comparaciones
                    if (intento < numeroSecreto) {
                        JOptionPane.showMessageDialog(null, "El número es mayor.");
                    } else if (intento > numeroSecreto) {
                        JOptionPane.showMessageDialog(null, "El número es menor.");
                    } else {
                        JOptionPane.showMessageDialog(null, "¡Correcto! Adivinaste el número.");
                    }

                } while (intento != numeroSecreto); // Se repite hasta acertar
            }
        }

