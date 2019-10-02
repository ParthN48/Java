package com.vvp.lib.controller;

public class BookNotAvailableException extends Exception{
  String msg = "";
  BookNotAvailableException(String msg){
    this.msg = msg;
  }
  public String getMessage(){
    return msg;
  }
  public String toString(){
    return "com.vvp.lib.controller.BookNotAvailableException: " +msg;
  }
}