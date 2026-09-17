/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class LT02_ESTDEC27 {
    public static void main(String[]args){
        int voltas;
        double velocidade,tempo_h,extensao,tempo,distancia_m,distancia_km;
        
        
        voltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de voltas: "));
        extensao = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensao do circuito em metros: "));
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo em min: "));
        
        distancia_m = voltas*extensao;
        distancia_km = distancia_m * 1000;
        tempo_h = tempo / 60;
        
        velocidade = distancia_km/tempo_h;
        
        
        JOptionPane.showMessageDialog(null,"Velocidade media "+velocidade);
        
        
    }
}
