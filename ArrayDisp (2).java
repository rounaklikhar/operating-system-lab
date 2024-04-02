/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;
public class ArrayDisp
{
	public static void main(String[] args) {
		S[] array=new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Original array:");
		for(int i=0;i<array.length;i++){
		    System.out.println("Enter integer:");
		    array[i]=sc.nextInt();
		}
		Arrays.sort(array);
		for(int i=0;i<array.length;i++){
		    System.out.println(array[i]);
		}

	}
}
