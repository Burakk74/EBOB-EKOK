package ebobekok;

import java.util.Scanner;

public class ebobEkok {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		 System.out.print("Birinci sayıyı giriniz :");
		int a = input.nextInt();
		input.nextLine();
		
		System.out.print("İkinci sayıyı giriniz : ");
		int b = input.nextInt();
		input.nextLine();
		
		int n = Math.min(a, b);
		int ebob = 1 ;
		int ekok = 1;
		for(int i = 1 ; i <= n ; i++) {
			
			if((a % i == 0) && (b % i == 0)) {
				
				 ebob = i;
			}
		}
		
		 ekok = ( a * b) / ebob;
			
		System.out.println("Ebob :" + ebob);
		System.out.print("Ekok :" + ekok);
	}
}
