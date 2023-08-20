package view;

import javax.swing.JOptionPane;

import controller.QtdDigitos;

public class Principal {

	public static void main(String[] args) {
		QtdDigitos pc = new QtdDigitos();
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("insira um número!"));
		int digitos = 0;
		System.out.println("quantidade de digitos em "+a+" = "+pc.Qtddigi(a, digitos));
	}

}
