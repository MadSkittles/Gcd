
//import javax.swing.JOptionPane;
import java.util.Scanner;
public class Gcd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "Welcome to Java!","Disply Message",JOptionPane.INFORMATION_MESSAGE);
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		int number1=input.nextInt();
		int number2=input.nextInt();
		while(number1!=number2){
			if (number1<number2){
				int temp=number1;
				number1=number2;
				number2=temp;
			}
			number1-=number2;
		}
		System.out.println(number1);
	}

}
