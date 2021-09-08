class Palidrome {
    public String longestPalindrome(String s) {
        int s_length = s.length();
        String highest = "";
        int longest = 0;
        
        for(int i = 0; i < s_length ; i++){
            int left = i, right = i;
            
            //         Check all odd palodrome
            while(left >= 0 && right < s_length && s.charAt(left) == s.charAt(right)){
                if((right-left + 1) > longest ){
                    highest = s.substring(left,right+1);
                    longest = (right-left + 1);
                }
                left--;
                right++;
            }
            
            //         check all even palidrome
            left = i;
            right = i+1;
            while(left >= 0 && right < s_length && s.charAt(left) == s.charAt(right)){
                if((right-left + 1) > longest ){
                    highest = s.substring(left,right+1);
                    longest = (right-left + 1);
                }
                left--;
                right++;
            }
        }
        return highest;
    }
}