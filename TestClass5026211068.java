import javax.swing.JOptionPane;

public class TestClass5026211068{
	public static void main(String[] Args){
	int a, b, dice1, dice2;
	double degreesF;
	
	ComputeMethods5026211068 enter = new ComputeMethods5026211068();

	JOptionPane.showMessageDialog(null, "Converter Fahrenheit to Celcius Program\nHypotenuse Counter Program\nTwo Dice Program");

	degreesF = Double.parseDouble(JOptionPane.showInputDialog("Masukan suhu Fahrenheit: " +"(misal : 30)"));

	a = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah alas:"));
	b = Integer.parseInt(JOptionPane.showInputDialog("Masukan jumlah tinggi:"));

	double suhuF = enter.fToC(degreesF);
	double sisimiring= enter.hypotenuse (a,b);
	dice1 = enter.roll();
	dice2 = enter.roll();
	int totaldice = dice1 + dice2;
	JOptionPane.showMessageDialog(null, "Temp in celsius is " + suhuF +"\nHypotenuse is " + sisimiring + "\nThe sum of the dice values is " + totaldice);
	

}
}