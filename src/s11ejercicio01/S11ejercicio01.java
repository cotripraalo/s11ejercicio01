/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s11ejercicio01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S11ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       //Mostrar mensaje
        System.out.println("");
        System.out.println("Ingrese un año: ");
        
        int año = input.nextInt();
        System.out.println("Ingrese un mes: ");
        String mes = input.next();
        
        boolean añoBisiesto =
                ((año%4 == 0) && (año%100 !=0)) || (año%400 == 0);
        //Muestra el numero de dias en un mes 
        System.out.println(mes + " " + año + " tiene ");
        
        boolean tiene31dias = mes.equals("Ene")|| 
                mes.equals("Mar")|| 
                mes.equals("May")||
                mes.equals("Jul")||
                mes.equals("Ago")||
                mes.equals("Oct")||
                mes.equals("Dic");
        boolean tiene30dias = mes.equals("Abr")|| mes.equals("Jun")||mes.equals("Set")||mes.equals("Nov");
                
        if(tiene31dias){
            System.out.println(31+ " dias.");
           }
        else if(tiene30dias){
            System.out.println(30 + " dias.");
        }
        else {
            System.out.println(((añoBisiesto) ? 29 : 28) + " dias.");
        }
    }
}

