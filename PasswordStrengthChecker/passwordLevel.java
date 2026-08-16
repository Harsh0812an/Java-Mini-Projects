//PROJECT TO DETERMINE THE LEVEL OF ENTERED PASSWORD AND SUGGEST 
import java.util.Scanner;

class passwordLevel
{
    public static void main(String args[])  
    {
        Scanner sc = new Scanner(System.in);
        String pass;
        System.out.println("Enter your password");
        pass = sc.nextLine();
        int length = pass.length();
        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;
        for(int i = 0; i < length; i++)
        {
            char ch = pass.charAt(i);

            if(Character.isDigit(ch))
                hasDigit = true;
            else if(Character.isLowerCase(ch))
                hasLower = true;
            else if(Character.isUpperCase(ch))
                hasUpper = true;
            else
                hasSpecial = true;
        }
        int score = 0;
        if(length >= 8) score=score+1;
        if(hasDigit) score=score+1;
        if(hasLower) score=score+1;
        if(hasUpper) score=score+1;
        if(hasSpecial) score=score+1;
        int category;

        if(score == 5)
        {
            category = 1;
            System.out.println("Password is strong");
        }
        else if(score >= 3)
        {
            category = 2;
            System.out.println("Password is medium");
        }
        else
        {
            category = 3;
            System.out.println("Password is weak");
        }

        if(category == 1)
        {
            System.out.println("No change needed in password");
        }
        else
        {
            String user;
            System.out.println("Enter user name");
            user = sc.nextLine();
            System.out.println("enter number of character needed");
            int c=sc.nextInt();
            String cha="";
            char arr[] = {'a','b','c','d','e','f'};
            String result = "";
            for(int i = 0; i < c; i++)
            {
                int index = (int)(Math.random() * arr.length);
                result = result + arr[index];   
            }
            String newPass = user + (int)(Math.random()*1000) + result+ "@#";
            System.out.println("Suggested password is:");
            System.out.println(newPass);
        }
        sc.close();
    }
}
