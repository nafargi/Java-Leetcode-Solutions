

class Solution {

  public int findPattern(InfiniteStream stream, int[] pattern) {
    int[] lps = getLPS(pattern);
    int i = 0; 
    int j = 0;   
    int bit = 0; // the bit in the stream
    boolean readNext = false;
    while (true) {
      if (!readNext) {
        bit = stream.next();
        readNext = true;
      }
      if (bit == pattern[j]) {
        ++i;
        readNext = false;
        ++j;
        if (j == pattern.length)
          return i - j;
      }
    
      else if (j > 0) {
        j = lps[j - 1];
      } else {
        ++i;
        readNext = false;
      }
    }
  }

  private int[] getLPS(int[] pattern) {
    int[] lps = new int[pattern.length];
    int j = 0;
    for (int i = 1; i < pattern.length; ++i) {
      while (j > 0 && pattern[j] != pattern[i])
        j = lps[j - 1];
      if (pattern[i] == pattern[j])
        lps[i] = ++j;
    }
    return lps;
  }
}
