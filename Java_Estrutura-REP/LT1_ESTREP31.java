import javax.swing.JOptionPane;
public class LT1_ESTREP31{
    public static void main(String[]args){
        
        for (int i = 10;i < 150; i++ ){
            double qua = Math.pow(i, 2);
            JOptionPane.showMessageDialog(null,"Quadrado: "+ qua);
        }
    }
    
}
