import java.util.Random;

public class ComputeMethods5026211068{

	public static double fToC(double degreesF){
	double suhuF = (degreesF -32)*5/9;
	return suhuF;

	
}
	public static double hypotenuse(int a,int b){
	return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
}
	public static int roll(){
	Random dice = new Random();
	int randice = dice.nextInt(6)+1;
	return randice;
	
}
}