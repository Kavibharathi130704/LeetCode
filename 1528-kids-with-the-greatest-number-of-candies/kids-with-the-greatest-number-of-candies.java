class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int candy:candies){
          if(candy>max){
            max=candy;
          }
        }
        List<Boolean> answer= new ArrayList<>();
        for(int candy:candies){
        if(candy+extraCandies>=max){
            answer.add(true);
        }else{
          answer.add(false);
    }
}
return answer;
    }
}