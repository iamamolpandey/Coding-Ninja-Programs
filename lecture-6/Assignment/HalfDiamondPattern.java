/*
Half Diamond Pattern

Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.

Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
*
*1*
*121*
*12321*
*121*
*1*
*
Sample Input 2 :
 5
Sample Output 2 :
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*

*/

import java.util.Scanner;
public class HalfDiamondPattern {
    
    public static void main(String[] args) {
        // Write your code here
         Scanner s =  new Scanner(System.in);
		 int n = s.nextInt();
		 int i=1;
		 System.out.println("*");
		 while(i<=n) {
			 System.out.print("*");
			 int j=1;
			 while(j<=i) {		//inc no
				 System.out.print(j);
				 j++;
			 }
			 j=i-1;
			 while(j>=1) {		//for dec.
				 System.out.print(j);
				 j--;
			 }
		     i++;
		     System.out.println("*");
		 }
		 i = 1;
		 while(i<=n-1) {
			 System.out.print("*");
			 int j=1;
			 while(j<=n-i) {		//inc no
				 System.out.print(j);
				 j++;
			 }
			 j=n-i-1;
			 while(j>=1) {		//for dec.
				 System.out.print(j);
				 j--;
			 }
		     i++;
		     System.out.println("*");
	   }
	System.out.println("*");
        
    }
}
