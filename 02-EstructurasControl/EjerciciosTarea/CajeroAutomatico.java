package EjerciciosTarea;
import javax.swing.JOptionPane;
/*Simula un cajero automático con saldo inicial de $1000. Permite consultar saldo,
depositar, retirar y salir.

 */
public class CajeroAutomatico {

    public static void main(String[] args) {

                double saldo = 1000; // Saldo inicial del cajero
                int opcion;          // Variable para guardar la opción elegida

                // C ete es el molde de un codigo realizado en clase
                do {

                    // Menú principal
                    String menu = "----- CAJERO AUTOMÁTICO -----\n"
                            + "1. Consultar saldo\n"
                            + "2. Depositar\n"
                            + "3. Retirar\n"
                            + "4. Salir\n"
                            + "Seleccione una opción:";

                    opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));//asignamos opcion para poder llamar el menu en un switch

                    // Estructura para evaluar la opción seleccionada
                    switch (opcion) {

                        case 1: // Consultar saldo este es el primer case
                            JOptionPane.showMessageDialog(null, "Saldo actual: $" + saldo);
                            break;//cierra case

                        case 2: // Depositar dinero
                            double deposito = Double.parseDouble(
                                    JOptionPane.showInputDialog("Ingrese cantidad a depositar:")
                            );
                            saldo += deposito; // Se suma al saldo
                            JOptionPane.showMessageDialog(null, "Nuevo saldo: $" + saldo);
                            break;

                        case 3: // Retirar dinero
                            double retiro = Double.parseDouble(
                                    JOptionPane.showInputDialog("Ingrese cantidad a retirar:")
                            );

                            // Verifica si hay suficiente saldo
                            if (retiro <= saldo) {
                                saldo -= retiro; // Se descuenta del saldo
                                JOptionPane.showMessageDialog(null, "Nuevo saldo: $" + saldo);
                            } else {
                                JOptionPane.showMessageDialog(null, "Fondos insuficientes.");
                            }
                            break;

                        case 4: // Salir
                            JOptionPane.showMessageDialog(null, "Gracias por usar nuestro cajero.");
                            break;

                        default: // Opción inválida
                            JOptionPane.showMessageDialog(null, "Opción inválida.");
                    }

                } while (opcion != 4); // Se repite hasta elegir salir
            }
        }

