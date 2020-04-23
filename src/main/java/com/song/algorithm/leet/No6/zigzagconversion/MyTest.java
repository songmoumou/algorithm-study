package com.song.algorithm.leet.No6.zigzagconversion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AJohn
 * 题解：这个是循环排列
 * 例如4阶，每个周期为
 *            *
 *            *     *
 *            *  *
 *            *
 *    长度为2*numRows-2
 *    可以分为两部分，一部分为竖直排列，一部分为斜向上排列
 *    循环遍历字符串数组，如果在第一列，则在矩阵中的位置为row=w;col=k*(numRows-1)+0;
 *    如果不在第一列，row=numRows-(w-numRows)-2;col=k*(numRows-1)+w-numRows+1;
 *    完成矩阵后，循环输出不为空的即可
 */
public class MyTest {
  public String convert(String s, int numRows) {
    if (s==null|| "".equals(s)||numRows<=1) return s;
    int numCols=(int)Math.ceil((double) s.length()/(2*numRows-2)*numRows)+1;
    char[][] zig =new char[numRows][numCols];
    char[] chars=s.toCharArray();
    for (int i = 0; i <chars.length ; i++) {
      int row=0;
      int col=0;
      int w=i% (2*numRows-2); //单个周期为位置
      int k=i/(2*numRows-2);//经过几个周期
      if(w<numRows){
        row=w;
        col=k*(numRows-1)+0;
      }else{
        row=numRows-(w-numRows)-2;
        col=k*(numRows-1)+w-numRows+1;
      }
      zig[row][col]=chars[i];
    }
    List<Character> result=new ArrayList<>();
    char[] data=new char[s.length()];
    for (int i = 0; i <zig.length ; i++) {
      for (int j = 0; j <zig[0].length ; j++) {
        if(zig[i][j]!=0){
          result.add(zig[i][j]);
        }
      }
    }
    for (int i = 0; i <result.size() ; i++) {
      data[i]=result.get(i);
    }
   return String.valueOf(data);

  }
}
