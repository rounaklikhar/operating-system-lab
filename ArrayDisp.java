/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class ArrayDisp
{

	public static void main(String[] args) {
	    String[] array = new String[5];
	    
	    array[0]="my";
	    
	    array[1]="name";
	    array[2]="is";
	    array[3]="priyanshu";
	    array[4]="pareek";
		System.out.println("Original Array:");
		for(int i=0;i<array.length;i++){
		    System.out.println("element at index"+i+":"+array[i]);
		    
		}
	}
}
