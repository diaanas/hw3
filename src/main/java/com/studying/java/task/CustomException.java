package com.studying.java.task;

public class CustomException extends RuntimeException {
  public CustomException(CustomExceptionScenario customExceptionScenario) {
    customExceptionScenario.precomplete();
  }
}
