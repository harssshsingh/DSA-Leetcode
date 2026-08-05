class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false; // if length not equal
        char arr1[]=s.toCharArray();  //changes to array
        char arr2[]=t.toCharArray();
        Arrays.sort(arr1);   //sort them
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]) return false; // if first alphabets are not equal
        }
        return true;
    }
}