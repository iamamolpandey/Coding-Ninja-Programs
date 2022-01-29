/*
Sum of Even Numbers till N
Send Feedback
Given a number N, print sum of all even numbers from 1 to N.
Input Format :
Integer N
Output Format :
Required Sum 
Sample Input 1 :
 6
Sample Output 1 :
12
*/

import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int i = 0;
	    int sum = 0;
	    while(i<=n) {
	    	sum = i+sum;
	    	i+=2;
		}
	    System.out.println(sum);

	}

}
