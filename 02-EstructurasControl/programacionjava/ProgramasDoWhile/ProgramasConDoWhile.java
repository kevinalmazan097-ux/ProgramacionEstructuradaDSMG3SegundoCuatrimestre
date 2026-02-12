
   
        String opcion = "";
        boolean sentinel = true;
        do{




              opcion  = obtenerMenu();
              switch (opcion){
                  case "1":{
                      JOptionPane.showMessageDialog(null,"Soy tu mejor opcion");
                      break;

                  }
                  case "2":{
                      break;
                  }
                  case "3":{
                      break;
                  }
                  case "4":{
                      JOptionPane.showMessageDialog(null,"I will Be Back");
                      sentinel = false;

                      break;
                  }

                  default:
                  {
                      JOptionPane.showMessageDialog(null,"Opcion no valida");
                  }
              }
        }while (sentinel);//sierra el do
    } //Cierra main

 public static String obtenerMenu(){

        String menu =  "==========MENU==========\n" +
                "1)Opcion 1\n" +
                "2)Opcion 2\n" +
                "3)Opcion 3\n" +
                "4)Salir \n"  +
                "5)Elegir Opcion: ";
        String opcion = JOptionPane.showInputDialog(menu);
        return opcion;

 }
} //Cierra clase