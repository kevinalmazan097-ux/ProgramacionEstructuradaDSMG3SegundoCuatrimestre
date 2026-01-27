import javax.swing.*;

public class Calificaciones2 {
    public static void main(String[] args) {
        //Declaracion de variables
        double calif1, calif2, calif3, promedio;
        final int NUM_CALIF = 3;

        calif1 = Double.parseDouble(JOptionPane.showInputDialog( "Introduce la calificasion 1"));
        calif2 = Double.parseDouble(JOptionPane.showInputDialog( "Introduce la calificasion 2"));
        calif3 = Double.parseDouble(JOptionPane.showInputDialog( "Introduce la calificasion 3"));
         //proceso
        promedio=(calif1+calif2+calif3)/NUM_CALIF;
        //Comparacion con una estructura selectiva double
        if(promedio >= 7.0){
            JOptionPane.showMessageDialog(null,"Aprovado");
        }
        else{
            JOptionPane.showMessageDialog(null,"No Aprovado");
        }
    }
}