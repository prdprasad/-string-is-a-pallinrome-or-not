import java.util.*;
class StringPallindrome{
	public static void main(String args[]){
		String a="";
        Scanner s = new Scanner(System.in);
            System.out.print("Enter the string: ");
            String b =s.nextLine();
		    int n= a.length();
         for(int i=n-1;i>=0;i--){
            a = a + b.charAt(i);
		 }
         if(a.equalsIgnoreCase(a)){
			System.out.println("The string is a palindrome");
        }
		else{
			System.out.println("The string is not a palindrome");
		}
	}
}