package prog2;
 import java.util.Scanner;
public class uppgift1 {

	  public static void summa(int arr[]) {//inisierar metod och retunerar summan.
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        System.out.println("Summan är: " + sum);
	    }

	    public static void main(String[] args) {
	        int nummer;
	        Scanner input = new Scanner(System.in);// 
	        System.out.print("hur många nummer vill du lägga till ");
	        nummer = input.nextInt();//nummer man skriver in
	        int[] arr2 = new int[nummer];
	        for (int i = 0; i < arr2.length; i++) {
	            System.out.print("nummer " + (i + 1) + "?: ");
	            arr2[i] = input.nextInt();
	        }
	        summa(arr2);
	    }

	}
