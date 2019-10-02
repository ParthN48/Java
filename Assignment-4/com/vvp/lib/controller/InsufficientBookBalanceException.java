package com.vvp.lib.controller;

public class InsufficientBookBalanceException extends Exception{
  String msg = "";
  InsufficientBookBalanceException(String msg){
    this.msg = msg;
  }
  public String getMessage(){
    return msg;
  }
  public String toString(){
    return "com.vvp.lib.controller.InsufficientBookBalanceException: " + msg;
  }
}

