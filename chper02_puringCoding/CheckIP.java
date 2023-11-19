package chper02_puringCoding;


public class CheckIP {
    public static void main(String[] args) {
        // 1. "123.9.2.0" legal
        // String ip1 = "123.9.2.0";
        // System.out.println(isValidate(ip1));
        
        // String ip2 = "223. 33   . 13 . 33 ";
        // System.out.println(isValidate(ip2));

        // String ip3 = "232. 22  1. 223. 1" ;
        // System.out.println(isValidate(ip3));

        // String ip4 = " 222. 319. 2. 4" ;
        // System.out.println(isValidate(ip4));

        // String ip5 = "2ba. 23. 34.11" ;
        // System.out.println(isValidate(ip5));

        // String ip6 = "232. 232.11";
        // System.out.println(isValidate(ip6));

        // String ip7 = "233. .33.2";
        // System.out.println(isValidate(ip7));

        // "" or null 
        // String ip8 = null;
        // System.out.println(isValidate(ip8));

        String ip9 = "a1.b2.c3.d4";
        System.out.println(isValidate(ip9));

    }
    /* Problem:
    a validate IP can only have space, number and "."
    a validate IP was consist with four numbers, within range [0,255]
    each number can have leading and tailing space, but no space between numbers, 
    e.g. "123.92.2 . 34" is legal, but "12 3.9 2.2.34" is illegal */
    
    /* Problem Soving steps:
    step1. Use example to learn problem's request
    step2. Write test cases
    step3. Summarize the repeated logic
    (check if there are repeated logic, and abstract it)
    step4. first round code writing 
    (write comments to modulize code, and tidy your problem sovling logic)
    step5. use test cases to validate, and optimize your code*/

    /* Step2. Test Cases:
    1. "123.9.2.0" legal
    2. "223. 33. 13 . 33 " legal
    3. "232. 22 1. 223. 1" illegal
    4. " 222. 319. 2. 4" illegal
    5. "2ba. 23. 34.11" illegal
    6. "232. 232.11" illegal
    7. "233. .33.2" illegal
    8. "" or null illegal
    */

    /* Step3. Summarize the repeated logic
     use "." to split the String into subString, and check the validality of each subString by using a reuseable function
     3.1 the splitted subString must be 4
     3.2 each of the subString can't be "" or null
     3.3 each of the subString shouldn't contain character other than space, number and dot
     3.3 each of the subString can't have space between numbers
     */
    public static boolean isValidate(String ipAddress) {
        // 3.2 each of the subString can't be "" or null
        if (ipAddress == null){
            return false;
        }

        // check if ip was consist of by 4 sub string
        String[] splittedIP = ipAddress.split("//.");
        // 3.1 the splitted subString must be 4
        if (splittedIP.length != 4) {
            return false;
        }

        // check each subString
        for (String subStr: splittedIP){
            boolean result = checkSubStr(subStr);
            if (!result) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkSubStr(String subStr) {
        // is subString is ""
        if (subStr.equals("")){
            return false;
        }
        // 3.3 each of the subString shouldn't contain character other than space, number
        // each subStr can start with 0 more space, have at least one number, and end with 0 or more space
        if (subStr.matches("^\\s*\\d+\\s*$")){
            // remove leading and tailing space
            String trimedStr = subStr.trim();
            // check if inside range [0,255]
            int numSubStr = Integer.parseInt(trimedStr);
            if (numSubStr < 0 || numSubStr > 255) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

}