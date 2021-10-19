class Solution {
    public static void main (String args[]){
        String result = longestPalindrome("xaabacxcabaaxcabaax");
        System.out.println(result);
    }

    public static String longestPalindrome(String s) {
        String res = "";
        int length = s.length();
        //initialize three inspect pointers
        int p1 = 0;
        int p2 = length-1;
        int p3 = 0;
        //longest length
        int[] maxl = {0,0};
        int counter = 0; //determine odd or even
        while (p1 < length){
            counter = 0;
            String temp = "";
            boolean isEven = true;
            int restart = -1;
            while(p3<=p2){
                if(s.charAt(p3) == s.charAt(p2)){
                    if (p2 > restart)
                        restart = p2;
                    temp += s.charAt(p3);
                    if(p3 == p2)
                        isEven = false;
                    else
                        isEven = true;
                    p3++;
                    counter ++;
                } else {
                    temp = "";
                    p3 = p3 - counter; //get back the position
                    if (restart != -1){
                        p2 = restart;
                        restart = -1;
                    }
                    counter = 0;
                }
                p2--;

            }

            if((temp.length()) > maxl[0] || (temp.length() == maxl[0] && isEven)){
                res = temp.substring(0,temp.length());
                maxl[0] = temp.length();
                if (isEven)
                    maxl[1] = 0;
                else
                    maxl[1] = 1;
            }
            p1++;
            p3 = p1;
            p2 = length-1;
        }
        String temp = "";
        counter = maxl[1];
        //reverse copy the string
        int i = 0;
        if (counter % 2 == 0)
            i = res.length()-1;
        else
            i = res.length()-2;
        for(int j = i;j>=0;j--){
            temp += res.charAt(j);
        }
        res = res + temp;
        return res;
    }
}

//xaabacxcabaaxcabaax