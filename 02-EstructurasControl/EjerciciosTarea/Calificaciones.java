package EjerciciosTarea;
/*
Solicita 10 calificaciones entre 0 y 100. Muestra el promedio, el número de aprobados y
reprobados.
 */
import javax.swing.*;

public class Calificaciones  {
    public static void main(String[] args) {

                double suma = 0;//Declaramos suma como Double para los numeros con decimales
                int aprobados = 0, reprobados = 0;//declaramos aprovados y reprovados como enteros porque contara cantidad de reprovados o aprovados enteros


                // Solicitar 10 calificaciones
                for (int i = 1; i <= 10; i++) {//for qui evalue lo que fue a i intentos i = 1 para partir al siguiente i<= 10 para que tengamos un rango de 1 a 10 y que valla en incremento

                    double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación " + i + ""));//aqui colocamos nuestra variable como Double para poder pedir calificacion con i de incremento para que el contador balla incrementando);

                    suma += calificacion;//aqui estamos indicando que suma es a += a calificacion padra mas abajo utilizarlo

                    if (calificacion >= 60) {//este if nos sirve para evaluar a nuestros aprovados
                        aprobados++;
                    } else { //el else es por la la sentencia de arriva no entra o es false pueda evaluar reprovados
                        reprobados++;
                    }
                }

                double promedio = suma / 10; //suma se dividira entre 10 para que de este modo se pueda sacar el promedio

                JOptionPane.showMessageDialog(null,//este apartado nos muestra el promedio los aprobados y nuestros reprovados
                        "Promedio: " + promedio +
                                "\nAprobados: " + aprobados +
                                "\nReprobados: " + reprobados);

            }
        }

