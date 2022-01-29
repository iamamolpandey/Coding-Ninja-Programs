/*
Factors

Write a program to print all the factors of a number other than 1 and the number itself.
Input Format :
A single integer, n
Output Format :
All the factors of n excluding 1 and the number itself
Constraints :
0 <= n <= 10,000
Sample Input 1 :
8
Sample Output 1 :
2 4
Sample Input 2 :
11
*/

import java.util.Scanner;
public class Factors {
    
    public static void main(String[] args) {
        // Write your code here
         	Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int d = 2;
			while (d <= n-1) {
				if (n%d == 0) {
					System.out.print( d +" ");
				}
				d++;
			}
        
    }
}
