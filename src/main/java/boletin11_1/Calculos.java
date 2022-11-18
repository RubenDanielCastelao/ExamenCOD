

package boletin11_1;

import javax.swing.JOptionPane;

public class Calculos {
    int zero = 0;
    int neg = 0;
    int pos = 0;
    
    public void menmay(){
        int i = 0;
        do{
          i++;
          int x = Integer.parseInt(JOptionPane.showInputDialog("Escriba un numero"));
          if(x==0)
              zero++;
          else if(x<0)
              neg++;
          else 
              pos++;       
        }while(i<10);
        System.out.println("Número de ceros:" + zero +"\nNúmero de negativos:" + neg + "\nNúmero de positivos:" + pos);
    }
}
