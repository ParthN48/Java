package com.vvp.lib.controller;

public class InvalidUserTypeException extends Exception{
  String msg;
  InvalidUserTypeException(String msg){
      this.msg = msg;
  }
  public String getMessage(){
    return msg;
  }
  public String toString(){
    return "com.vvp.lib.controller.InvalidUserTypeException: " +msg;
  }
}