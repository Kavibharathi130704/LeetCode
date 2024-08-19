class Solution {
    public String sortSentence(String s) {
    String arr[]=s.split(" ");
    String storeIn[]=new String[arr.length];
    int index=0;
    for(String str : arr){
        index=(int)(str.charAt(str.length()-1)-'0');
        storeIn[index-1]=str.substring(0,str.length()-1);
    }    
    StringBuilder sb=new StringBuilder();
    for(int i=0; i<storeIn.length; i++){
        sb.append(storeIn[i]).append(" ");
    }
         return sb.toString().trim();
    }
}