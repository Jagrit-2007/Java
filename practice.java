public class practice {
    public static void main(String[] args) {
        
        // Q1.
        // *******
        // *****
        // ***
        // *

        // Q2.
        // print every odd from 1 to 100

        // Q3.
        // print every number from 1 to 100

        // Q4.
        // Input : aaaabbbdddddg
        // Ouput : a4b3d5g1

        String str = "aaaabbbdddddg";
        int n = str.length();
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++)
        {
            if(i < n - 1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
            }
            else
            {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        System.out.println(sb);

        // Q5.
        // equals() and ==

        // Q6.
        // Find first repeating character in CAMERA

        String str2 = "camera";
        int len_str2 = str2.length();

        for(int i = 0; i < len_str2; i++)
        {
            for(int j = i+1; j < len_str2; j++)
            {
                if(str2.charAt(i)==str2.charAt(j))
                {
                    System.out.println("found repeating character: " + str2.charAt(i));
                    break;
                }
            }
        }

    }
}