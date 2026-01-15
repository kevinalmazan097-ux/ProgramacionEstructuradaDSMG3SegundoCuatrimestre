import javax.swing.JOptionPane;
public class expresiones {
    

    public static void main(String[] args) {


        //Declaracion de variables
        /*
        *En esta parte del codigo  se van a
        * declarar varios tipos de variables
         */
        int suma;
        int resta;
        int multi, div, mod, area;

        double resultado = 0.0;
        boolean valor = true, valor2 = false;
        float f1 = 8.9f, f2 = (float)10.3;
        double d1 = 12, potencia;

        //Definir una constante
        final double PI = 3.1416;
        String salida = "";

        //Expresiones aritmeticas
        suma = 4 + 5;
        resta = 10-12;
                multi = 24*23;
                div = 10/2;
                mod = 10%2;
                potencia = Math.pow(4, 2);


                salida = "===== Expresiones Aritmeticas =====" +
                        "\nLa suma es: " + suma +
                        "\nLa resta es: " + resta +
                        "\nLa multi es: " + multi +
                        "\nLa div es: " + div +
                        "\nLa mod es: " + mod +
                        "\nLa potencia es: " + potencia;

                JOptionPane.showMessageDialog(null,salida);



    }

}


