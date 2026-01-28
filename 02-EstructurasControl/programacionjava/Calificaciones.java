
import javax.swing.JOptionPane;

public class Calificaciones {

    public static void main(String[] args) {
        //Declaracion de variables
        double calif1 = 0.0, calif2 = 0.0, calif3 = 0.0;
        double promedio = 0.0;

        //Entrada de datos
        calif1 = Double.parseDouble(JOptionPane.showInputDialog("introduce la calificacion"));
        calif2 = Double.parseDouble(JOptionPane.showInputDialog("introduce la calificacion"));
        calif3 = Double.parseDouble(JOptionPane.showInputDialog("introduce la calificacion"));

        //operacion calcular promedio
        promedio = (calif1 + calif2 + calif3) / 3.0;
        //Estructura de seleccion simple
        if (promedio >= 7.0) {
            JOptionPane.showMessageDialog(null, "Aprovado");

        }//cierra el if

    }//Cierra main
}//Cierra clase
