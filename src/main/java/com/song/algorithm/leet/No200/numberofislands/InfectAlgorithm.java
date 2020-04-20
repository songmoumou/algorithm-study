package com.song.algorithm.leet.No200.numberofislands;

/**
 * @author AJohn
 * 使用感染函数，原理是将相连的岛屿标记为2，避免重复扫描，并且递归查找
 */
public class InfectAlgorithm {
  public int numIslands(char[][] grid) {
    int islandNum = 0;
    for(int i = 0; i < grid.length; i++){
      for(int j = 0; j < grid[0].length; j++){
        if(grid[i][j] == '1'){
          infect(grid, i, j);
          islandNum++;
        }
      }
    }
    return islandNum;
  }
  //感染函数
  public void infect(char[][] grid, int i, int j){
    if(i < 0 || i >= grid.length ||
        j < 0 || j >= grid[0].length || grid[i][j] != '1'){
      return;
    }
    grid[i][j] = '2';
    infect(grid, i + 1, j);
    infect(grid, i - 1, j);
    infect(grid, i, j + 1);
    infect(grid, i, j - 1);
  }
}
