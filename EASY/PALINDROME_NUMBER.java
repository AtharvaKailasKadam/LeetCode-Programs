public class PALINDROME_NUMBER
{
    public boolean isPalindrome(int x)
    {
        int Num = x;
        int digit = 0;
        int reverse = 0;

        if(x < 0)
        {
            return false;
        }

        while(x != 0)
        {
            digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        return reverse == Num;
    }
    public static void main(String[] args)
    {
        int Num = 121;

        PALINDROME_NUMBER sol = new PALINDROME_NUMBER();
        System.out.println(sol.isPalindrome(Num));
    }
}