
import javax.swing.JOptionPane;
public class Menu {
    
public static void main(String[] args) {
        String menu = "", opcion="";
        boolean sentinel = true;
        menu = "==========MENU==========\n" +
                        "1)Opcion 1\n" +
                       "2)Opcion 2\n" +
                       "3)Opcion 3\n" +
                       "4)Salir \n"  +
                       "5)Elegir Opcion: ";
        do {
            //Mostrar menu
            opcion = JOptionPane.showInputDialog(menu);
            switch (opcion.toUpperCase()) {

                case "1":
                case "A":

                    JOptionPane.showMessageDialog(null, "Opcion1");
                    break;

                case "2":
                case "B":
                    JOptionPane.showMessageDialog(null, "Opcion2");
                    break;
//opcion 3
                case "3":
                case "C":

                    JOptionPane.showMessageDialog(null, "Opcion3");
                    break;

                case "4":
                case "S":
                    JOptionPane.showMessageDialog(null, "El programa a terminado ");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");

            }
        //cierre del do
        }while (sentinel);

    } //cierre del main
}//cierre de la clase

