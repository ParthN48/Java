package com.vvp.lib.controller;

public class BookNotFoundException extends Exception{
  String msg = "";
  BookNotFoundException(String msg){
    this.msg = msg;
  }
  public String getMessage(){
    return msg;
  }
  public String toString(){
    return "com.vvp.lib.controller.BookNotFoundException: " +msg;
  }
}