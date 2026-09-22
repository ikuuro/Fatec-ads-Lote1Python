/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikaro
 */
import javax.swing.JOptionPane;

public class LT02_ESTDEC29 {
    
    public static void main(String[]args){
       
        int tipoinv;
        double valor;
        
        
        tipoinv = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de conta, 1 para poupanca, 2 para renda fixa: "));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
        
        
        if ( tipoinv == 1){
            valor = valor * 1.03;
            JOptionPane.showMessageDialog(null,"Saldo corrigido em 30 dias: "+valor);
        }
        else if( tipoinv == 2){
            valor = valor * 1.05;
            JOptionPane.showMessageDialog(null,"Saldo corrigido em 30 dias"+valor);
        }
        else{
            JOptionPane.showMessageDialog(null,"Tipo de conta invalido");
        }
        
        
    }
    
}
