package com.song.algorithm.leet.No7.reverseinteger;

/**
 * @author AJohn
 */
public class Solution {
  public int reverse(int x) {
    if (x == Integer.MIN_VALUE) return 0;
    int neg = x < 0 ? -1 : 1;
    x *= neg;
    int ret = 0;
    while (x > 0) {
      int n = ret;
      n *= 10;
      n += x % 10;
      x /= 10;
      if (n / 10 != ret) return 0;
      ret = n;
    }
    return ret * neg;

  }
  public int reverse1(int x) {
    int rev = 0;
    while (x != 0) {
      int pop = x % 10;
      x /= 10;
      if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
      if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
      rev = rev * 10 + pop;
    }
    return rev;
  }

  /**
   * 解释上面7和-8的来历
   * @param x
   * @return
   */
  public int reverse3(int x) {
    int rev = 0;
    while(x != 0){
      int pop = x % 10;
      x = x / 10;
      if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > Integer.MAX_VALUE % 10)){
        rev = 0;
        break;
      }else if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && x < Integer.MIN_VALUE % 10)){
        rev = 0;
        break;
      }
      rev = rev * 10 + pop;
    }
    return rev;
  }


}
