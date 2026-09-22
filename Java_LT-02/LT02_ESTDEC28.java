/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ikaro
 */
import javax.swing.JOptionPane;

public class LT02_ESTDEC28 {
    
    public static void main(String[]args){
        
        
        double vendaMensal, precoAtual, precoNovo;
        
        vendaMensal =  Double.parseDouble(JOptionPane.showInputDialog("Digite a venda mensal: "));
        precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco atual: "));
        precoNovo = precoAtual;
        
        
        if (vendaMensal < 500 && precoAtual < 30.00){
            precoNovo = precoAtual * 1.10;
        }
        else if(vendaMensal >= 500 && vendaMensal < 1000 && precoAtual >=30.00 && precoAtual < 80.00){
            precoNovo = precoAtual *1.15;
            
            
        }
        else if(vendaMensal >= 1000 && precoAtual >= 80){
            precoNovo = precoAtual* 0.95;
        }
        
        
        JOptionPane.showMessageDialog(null, "Preco novo: " + precoNovo);
        
    }
    
    
}
