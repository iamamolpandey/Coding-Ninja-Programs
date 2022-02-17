 /*
 Count Words
Send Feedback
For a given input string(str), find and return the total number of words present in it.
It is assumed that two words will have only a single space in between. Also, there wouldn't be any leading and trailing spaces in the given input string.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints an integer value denoting the tool number of words present in the string.
Note:
You are not required to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 sec
Sample Input 1:
Coding Ninjas!
Sample Output 1:
2
Sample Input 2:
this is a sample string
Sample Output 2:
5
*/

public class CountWords {

	public static int countWords(String str) {	//isme jo str hai usi me pura sentence store hai
		int  count = 0;
        
        if(str.length()==0){	//ye check krega ki str ki length agr 0 hai to wo return ans me 0 kr dega
            return 0;
        }
        
        	//agr upr length 0 wala condition sahi ni huwa..i mean kuchh lenth hai uski to niche wala ayega..condition
        
        for (int i=0;i<str.length();i++){		//ye line code bolega ki har letter pr jao sentence ke
            if(Character.isWhitespace(str.charAt(i))){  //ye space check krega
                count++;									// agr space huwa to count badh jayega.
            }
        }
        return count+1;  //final count jo aya usme ek jod dega
        
	}

}
