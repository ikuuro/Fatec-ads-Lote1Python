import javax.swing.JOptionPane;

public class LT1_ESTREP32 {
    public static void main (String[]args){
        int valor, fat;
        fat = 1;
        valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
       for(int i = valor ; i > 1 ; i--){
           fat = fat*i;
           
       }
       System.out.println("Fatorial: "+ fat);
    
}}
