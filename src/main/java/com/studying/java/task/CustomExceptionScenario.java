package com.studying.java.task;

public class CustomExceptionScenario {
  private boolean taskCompleted = false;
  private boolean taskPreCompleted = false;

  // TODO handle an exception in the method and then mark taskCompleted if no exceptions
  public boolean safeTask() {
    riskyTask();
    taskCompleted = true;

    // after the exception catching task state returns. Don't change it
    return taskCompleted;
  }

  public void riskyTask() throws CustomException {
    if (!taskPreCompleted) {
      throw new CustomException(this);
    }
  }

  // TODO handle using try-with-Resources
  public boolean taskWithResource() {
    CustomResource resource = new CustomResource();
    taskCompleted = resource.getResult();

    // don't change it
    return taskCompleted && resource.isClosed();
  }

  // don't change it
  protected void precomplete() {
    this.taskPreCompleted = true;
  }
}



