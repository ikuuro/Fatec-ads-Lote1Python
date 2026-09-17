/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;
public class LT02_ESTDEC24 {
    public static void main(String[]args){
        int valor;
        
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        
        
        
        if(valor % 2 == 0 && valor % 3 == 0){
            JOptionPane.showMessageDialog(null, "Número divisivel por 2 e 3");
        }
        else if(valor % 2 == 0){
                JOptionPane.showMessageDialog(null, "Divisivel por 2");
        }
        else if (valor % 3 == 0){
                    JOptionPane.showMessageDialog(null,"Divisivel por 3");
                }
         }
    }