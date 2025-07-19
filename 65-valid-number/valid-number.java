class Solution {
    public boolean isNumber(String s) {
       boolean isValid = s.matches("^[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?$");
        if(isValid==true){
            return true;
        }
        else{
            return false;
        }
    }
}