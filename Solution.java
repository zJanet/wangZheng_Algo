class Solution {
    public static void main(String[] args) {
        String testIP = "1.1.1.1";
        System.out.println(Solution.defangIPaddr(testIP));
        
    }
    public static String defangIPaddr(String address) {
        // String replacedAaddr = address.replace(".","[.]");
        int addLen = address.length();
        int parsedLen = addLen + 6;
        char[] result = new char[parsedLen];
        int j = 0;
        for(int i=0;i< addLen;i++)
        {
            // char[] result
            char temp = address.charAt(i);
            if(temp == '.')
            {
                result[j] = '[';
                result[j+1] = '.';
                result[j+2] = ']';
                j += 3;
                // for(int j=i + 1 ;j<address.length+2;j++)
                // {

                // }
            } else {
                result[j] = temp;
                j += 1;
            }
        }
        // System.out.println(replacedAaddr);
        
        // System.out.println(Arrays.toString(result));
        System.out.println(new String(result));

        return new String(result);
    }
}