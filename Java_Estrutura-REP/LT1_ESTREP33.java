import javax.swing.JOptionPane;

public class LT1_ESTREP33 {
    public static void main(String[]args){
        double serie,numero;
        
        serie = 0;
        
        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
        
        for(double i = 1; i <= numero;i++ ){
            serie = serie +(1/i);
            System.out.println(serie);
        }
    }    
}
