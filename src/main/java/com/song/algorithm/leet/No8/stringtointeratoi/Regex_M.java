package com.song.algorithm.leet.No8.stringtointeratoi;

/**
 * @author AJohn
 */
import java.util.regex.*;
public  class Regex_M {
 final static Pattern pattern = Pattern.compile("[-+]??[0-9]++");
  public int myAtoi(String str) {
    String strTrim = str.trim();
    Matcher matcher = pattern.matcher(strTrim);
    if (matcher.lookingAt()) {
      String strNum = strTrim.substring(0, matcher.end());
      // 如果直接转32位int出现NFE那么就只要判断是Integer的最大值还是最小值就好了
      try {
        return Integer.parseInt(strNum);
      } catch (NumberFormatException nfe) {
        return strNum.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
      }
    }
    return 0;
  }

}