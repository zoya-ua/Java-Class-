package com.practice;

import javax.swing.JOptionPane;

public class DialogBox {
	public static void main(String[] args) {
		String name;
		name =JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null,"Hello "+name);
	}

}