package com.vvp.lib.controller;

public class UserNotFoundException extends Exception{
  String msg = "";
  UserNotFoundException(String msg){
    this.msg = msg;
  }
  public String getMessage(){
    return msg;
  }
  public String toString(){
    return "com.vvp.lib.controller.UserNotAvailableException: " +msg;
  }
}