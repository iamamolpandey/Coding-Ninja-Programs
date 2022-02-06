/*
All Prime Numbers

Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.
Input Format :
Integer N
Output Format :
Prime numbers in different lines
Constraints :
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19
*/

import java.util.Scanner;
public class AllPrimeNumbers {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int d=2; d<=n; d++){
			int flag = 0;
			for(int i = 2;i<=d/2;i++) {
				if(d%i==0){
					flag = 1;
	                break;
	            }
			}
			if(flag == 0) {
				System.out.println(d);
			}
        }
	}
}