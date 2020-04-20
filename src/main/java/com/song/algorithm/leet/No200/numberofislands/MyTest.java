package com.song.algorithm.leet.No200.numberofislands;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AJohn
 */
public class MyTest {
  public  int numIslands(char[][] grid) {
    List<List> island=new ArrayList<List>();
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        if(grid[i][j]=='1'){
          List round=getRound(grid,i,j);
          round.add(i+":"+j);
          containsAndResize(island,round);

        }
      }
    }
    return island.size();

  }

  private  void containsAndResize(List<List> island, List round) {
    List<Integer> list=new ArrayList<>();
    for(int i=0;i<island.size();i++){
      ArrayList list1 = (ArrayList) ((ArrayList)island.get(i)).clone();
      ArrayList list2 = (ArrayList)    ( (ArrayList)      round).clone();
      list1.retainAll(list2);
      if(list1.size()>0){
        list.add(i);
      }
    }
    if(list.size()==0){
      island.add(round);
    }else {
      List list0=island.get(list.get(0));
      list0.addAll(round);
      for (int i = list.size()-1; i >=1; i--) {
        list0.addAll(island.get(list.get(i)));
        island.remove((int) list.get(i));
      }
    }
  }




  public  List getRound(char[][] grid,int i,int j){
    List<String> list=new ArrayList<String>();
    //上
    if(i-1>=0&&grid[i-1][j]=='1') list.add(i-1+":"+j);
    //下
    if(i+1<grid.length&&grid[i+1][j]=='1') list.add(i+1+":"+j);
    //左
    if(j-1>=0&&grid[i][j-1]=='1') list.add(i+":"+(j-1));
    //右
    if(j+1<grid[i].length&&grid[i][j+1]=='1') list.add(i+":"+(j+1));
    return list;
  }
}
