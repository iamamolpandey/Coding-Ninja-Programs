/*
Number Star pattern 1

Print the following pattern for given number of rows.
Input format :
Integer N (Total number of rows)
Output Format :
Pattern in N lines
Sample Input :
   5
Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
 */
 
 
import java.util.Scanner;
public class NumberStarPattern1 {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int j = n;
            while(j>=1){
                if(j==i){
                    System.out.print("*");
                }
                else
                    System.out.print(j);
                j--;
            }
            System.out.println();
			i++;
        }
	}
}
