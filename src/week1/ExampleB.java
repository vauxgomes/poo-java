package week1;

import javax.swing.JOptionPane;

public class ExampleB {

	public static void main(String[] args) {
		// Primeiro número
		String tmp = JOptionPane.showInputDialog("Digite um valor");
		int numA = Integer.parseInt(tmp);

		// Segundo número
		tmp = JOptionPane.showInputDialog("Digite outro valor");
		int numB = Integer.parseInt(tmp);

		// Verificando qual é o maior número
		if (numA > numB) {
			JOptionPane.showMessageDialog(null, numA + " é maior que " + numB);
		} else if (numA < numB) {
			JOptionPane.showMessageDialog(null, numA + " é menor que " + numB);
		} else {
			JOptionPane.showMessageDialog(null, numA + " é igual a " + numB);
		}
	}

}
