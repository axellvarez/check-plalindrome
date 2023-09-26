import java.util.Scanner;
public class CheckPalindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Character> myStack = new Stack<>();
        int choice = 0;
        String word = "";
        while(choice != 3)
        {
            System.out.println("---------------MAIN MENU--------------");
            System.out.println("1 - Read input string");
            System.out.println("2 - Check if palindrome");
            System.out.println("3 - Exit program\n");
            System.out.print("Enter option number: ");
            choice = sc.nextInt();
            System.out.println();
            switch(choice)
            {
                case 1:
                    System.out.print("Please input a string: ");
                    sc.nextLine();
                    word = sc.nextLine();
                    System.out.println();
                    break;

                case 2:
                    if(word.isEmpty())
                    {
                        System.out.println("Please input a string first"); //empty string case
                    }
                    else
                    {
                        String tempWord = word.toLowerCase(); //creates a tempWord and sets it to word in lower case so case doesn't matter
                        for(int i = 0; i < tempWord.length(); i++)
                        {
                            myStack.push(tempWord.charAt(i)); //loops through and pushes every letter of tempWord onto the stack
                        }
                        boolean isPalindrome = true; //makes a bool isPalindrome and set it to true
                        for(int i = 0; i < tempWord.length(); i++)
                        {
                            if(tempWord.charAt(i) != myStack.top()) //loops through tempWord to see if the first char is the same as the last and goes through the string and checks every letter.
                            {
                                isPalindrome = false; //if the char isn't the same as it's matching position then set isPalindrome to false
                            }
                            myStack.pop(); //pop the top of the stack to compare the next element of the stack
                        }
                        System.out.print("Entered String:   "); //prints out the original string
                        System.out.println(word);
                        System.out.print("Judgement:        ");
                        if(isPalindrome) //checks if isPalindrome ended up being true and prints accordingly
                        {
                            System.out.println("Palindrome");
                        }
                        else
                        {
                            System.out.println("Not Palindrome");
                        }
                    }
                    System.out.println();
                    break;
            }
        }
    }
}
