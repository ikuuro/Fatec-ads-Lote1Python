/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class LT02_ESTDEC26 {
      public static void main(String[]args){
          int n1,n2;
          
          
          n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
          n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
          
          if(n1>n2){
              if(n1 % n2 ==0){
                  JOptionPane.showMessageDialog(null,"o numero "+ n1 + " é divisivel por "+ n2);
              }
              else{
                  JOptionPane.showMessageDialog(null,n1 +" nao é divisivel por "+n2);
              }
              }
              
                
          
          else if(n2>n1){
               if(n2 % n1 == 0 ){
                   JOptionPane.showMessageDialog(null, n2 + " é divisivel por "+ n1);
               }
               else{
                   JOptionPane.showMessageDialog(null,n2 + " não é divisivel por "+n1);
                   
               }
          }
          
      } 
}
