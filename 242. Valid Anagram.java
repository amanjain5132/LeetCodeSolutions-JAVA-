//1nd method

class Solution {
    public boolean isAnagram(String s, String t) { 

    if(s == null || t == null) return false; 
    // this is the base condition to check that string is not empty

    if(s.length() != t.length()) return false;
    // this is used to find the diffrent length if found it will return false as both string is not equal

    int [] counter = new int[26]; // to count frequency we need to make an array of size 26;

   for(int i = 0; i < s.length(); i++){
        counter[s.charAt(i)-'a']++;
        counter[t.charAt(i)-'a']--;
    }
    for(int i: counter){
            if(i != 0)
                return false;
        }
        return true;
    }
}

//2nd method

class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()) return false;
        char [] S = s.toCharArray();
        char [] T = t.toCharArray();

        Arrays.sort(S);
        Arrays.sort(T);

        return Arrays.equals(S,T);
    }
}
