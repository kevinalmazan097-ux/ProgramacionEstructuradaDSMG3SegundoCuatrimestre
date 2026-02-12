package ciclosjava;

public class Programasconfor {
    
 public static void main(String[] args) {
        String menu = "", opcion="";
        boolean sentinel = true;
        int n = 0;
        double  promedio = 0.0, calif = 0.0;

        menu = "==========MENU DE PROGRAMAS CON FOR ==========\n" +
                "1)Calcular promedio \n" +
                "2) kevin2\n" +
                "3)Opcion 3\n" +
                "4)Salir    \n"  +
                "5)Elegir Opcion: ";
        do {
            //Mostrar menu
            opcion = JOptionPane.showInputDialog(menu);
            switch (opcion.toUpperCase()) {

                case "1":
                case "A":
                    n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de la calificacion"));

                    if(n>0){
                        for (int i = 1; i <= n ; i++) {
                            calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce la calificacion" + i));
                            if (calif>=0.0 && calif<=10) {
                                promedio += calif;//Promedio es = a promedio  + calif;
                            }else{
                                JOptionPane.showMessageDialog(null,"La calificacion no es valida");
                                i--;
                                continue;

                            }
                        }
                        promedio/=n; //promedio = promedio / n porque n es numero de veses
                        JOptionPane.showMessageDialog(null,"El promedio es: " + promedio);

                    }else{
                        JOptionPane.showMessageDialog(null, "El numero de Calificaciones no puede ser 0 ");
                    }

                    //cierre del case 1


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
    }
}