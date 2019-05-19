package com.class31;

import java.util.ArrayList;

class Main {
  public static void main(String []args){
    ArrayList<Boolean> list=new  ArrayList<Boolean>();
    list.add(true);
    list.add(false);
    list.add(false);
    System.out.println();
    for(int y=0;y<2;y++){
    for(int i=0;i<list.size();i++){
      System.out.print(list.get(i)+" ,");
    }
    }
  }

}