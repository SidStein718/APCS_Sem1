/* 
    Lecture note example - Methods
*/
import java.util.Scanner;

class LectureMethod{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Numero 1:");
        int num1 = input.nextInt();
        System.out.println("Numero 2:");
        int num2 = input.nextInt();
        
        System.out.println(squared(num1));
        System.out.println(absolute(num2));
	}
	
	public static int squared(int a){
	    int answer = a * a;
	    return answer;
	}
	
	public static int absolute(int a){
	    if(a<0)
	    {
	        return a*(-1);
	    }
	    else
	    {
	        return a;
	    }
	}
}