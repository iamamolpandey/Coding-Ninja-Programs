/*
Binary to decimal

Given a binary number as an integer N, convert it into decimal and print.
Input format :
An integer N in the Binary Format
Output format :
Corresponding Decimal number (as integer)
Constraints :
0 <= N <= 10^9
Sample Input 1 :
1100
Sample Output 1 :
12
Sample Input 2 :
111
Sample Output 2 :
7
*/

import java.util.Scanner;
import java.lang.Math;
public class BinaryToDecimal {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();	
		int sum = 0,i = 0;
		while(x>0) {
			int digit = x%10;
			x = x/10;
			sum += digit*Math.pow(2,i);
			i++;
		}
		System.out.print(sum);

	}
}
