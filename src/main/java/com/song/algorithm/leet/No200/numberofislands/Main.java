package com.song.algorithm.leet.No200.numberofislands;

/**
 * @author AJohn
 */
public class Main {
  public static void main(String[] args) {
    //char[][] grid=new char[][]{
    //    {'1','1','0','0','0'},
    //    {'1','1','0','0','0'},
    //    {'0','0','1','0','0'},
    //    {'0','0','0','1','1'}
    //};

    //char[][] grid=new char[][]{
    //    {'1','1','1','1','0'},
    //    {'1','1','0','1','0'},
    //    {'1','1','0','0','0'},
    //    {'0','0','0','0','0'}
    //};
    char[][] grid=new char[][]{
        {'1','1','1','1','1','1','1','1','1'},
        {'1','0','0','0','0','0', '0','0','1'},
        {'1','0','1','0','1','0','1','0','1'},
        {'1','0','1','1','1','1','1','0','1'},
        {'1','0','1','0','1','0','1','0','1'},
        {'1','0','0','0','0','0','0','0','1'},
        {'1','1','1','1', '1','1','1','1','1'}};
    //System.out.println(new InfectAlgorithm().numIslands(grid));
    //System.out.println(new DFS_M().numIslands(grid));
    //System.out.println(grid[20]);
  }
}
