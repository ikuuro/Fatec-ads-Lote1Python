/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class LT02_ESTDEC25 {
    public static void main(String[]args){
        int duracao,horainicio, horafinal, minutoi, minutof,inicio,fim,horas,minutos;
          
        horainicio= Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de inicio: "));
        minutoi= Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto de inicio: "));
        
        horafinal= Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de termino do jogo: "));
        minutof= Integer.parseInt(JOptionPane.showInputDialog("Digite i minuto final: "));
        
        inicio = horainicio * 60 + minutoi;
        fim= horafinal * 60 + minutof;
        
        if(fim<inicio){
            fim = 24*60;
            
            duracao= fim - inicio;
            
            horas= duracao / 60;
            minutos= duracao*60;
            
            JOptionPane.showMessageDialog(null,"Duracao: "+ horas +"horas e "+ minutos + "minutos");
        }
        
        
        
        
        
        
    }
    
}
