import java.util.Scanner;

public class ProcessAName5026211068 {

public static void main(String[] args) {

String name = " ";

Scanner sc = new Scanner(System.in);

System.out.print("Type your name: ");

name = sc.nextLine();

System.out.println("Your name is: "+name.split(" ")[1]+", "+name.split(" ")[0].charAt(0)+".");


}

}
