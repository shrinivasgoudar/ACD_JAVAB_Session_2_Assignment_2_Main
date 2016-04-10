/**
 * 
 */
package com.acadgild.controlstructure;

/**
 * @author shrinivasa.goudar
 *
 */
public class PrimeNumberProgram {

	/**
	 * @param args
	 */
	public static void main(String args[]) {

		System.out.println("Prime Numbers between 1 and 100");
		
		String output = "";
		
		for (int i = 1; i <= 100; i++) {
			int flag =0;
			for (int j=i;j>=1;j--) {
				if (i%j==0) {
					flag +=1;
				}
			}
			if(i==1) {
				output =output + i +  " ";
			}
			if (flag ==2) {
				output =output + i +  " ";
			}
		}
		System.out.println(output);
	}

}
