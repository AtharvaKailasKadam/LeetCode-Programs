import java.util.HashMap;

public class Solution
{
    public int romanToInt(String s)
    {
        HashMap<Character, Integer> RomanMap = new HashMap<>();
        RomanMap.put('I',1);
        RomanMap.put('V',5);
        RomanMap.put('X', 10);
        RomanMap.put('L', 50);
        RomanMap.put('C', 100);
        RomanMap.put('D', 500);
        RomanMap.put('M', 1000);

        int total = 0;
        int CurrentValue = 0;
        int PrevValue = 0;

        for(int i = 0; i < s.length(); i++)
        {
            CurrentValue = RomanMap.get(s.charAt(i));
                if(CurrentValue > PrevValue)
                {
                    total = total + CurrentValue - 2 * PrevValue;
                }
                else
                {
                    total = total + CurrentValue;
                }
                PrevValue = CurrentValue;
        }

        System.out.println(s + " in Integer is: " + total);
        return total;
    }
    public static void main(String[] args)
    {
        String RomanNumber1 = "III";

        Solution sol = new Solution();
        sol.romanToInt(RomanNumber1);
    }
}