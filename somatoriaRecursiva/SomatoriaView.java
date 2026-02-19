package somatoriaRecursiva;

import javax.swing.JOptionPane;

public class SomatoriaView {
	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero inteiro:"));
		
		if( num <= 0 ) {
			JOptionPane.showConfirmDialog(null, "tem que ser maior que 0");
		}else {
			SomatoriaController somatoria = new SomatoriaController();
			
			double resultSomatoria = somatoria.somatoria(num);
			
			JOptionPane.showConfirmDialog(null, resultSomatoria);
			
		}
	}
}
