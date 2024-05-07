class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
    
    Arrays.sort(points, Comparator.comparingInt(a -> a[0]));
    int[] listNumber= new int[points.length];
      for(int i=0; i<points.length; i++){
        listNumber[i]=points[i][0];
      }

      int max=0;
      for(int i=1; i<listNumber.length; i++){
          int widestArea=listNumber[i]-listNumber[i-1];
          max= max=Math.max(max,widestArea);
      }
           return max;
    }
    
}
