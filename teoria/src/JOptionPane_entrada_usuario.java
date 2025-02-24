import javax.swing.*;

public class JOptionPane_entrada_usuario {
    public static void main(String[] args) {
        String[] paises = new String[2];
        for (int i = 0; i < 2; i++){
            paises[i] = JOptionPane.showInputDialog("Introduce el país " + (i+1) + ": ");
        }
        for (String item: paises){
            System.out.println(item);
        }
        int[] numeros = new int[8];
        for (int i = 0; i < 8; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce números: "));
        }
        for(Integer num: numeros){
            System.out.println(num);
        }
    }
}
