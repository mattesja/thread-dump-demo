package com.demo.performance;

public class BadImplementation {

  public void soSlow() {
    alsoSlow();
  }

  private void alsoSlow() {
    try {
      Thread.sleep(20000);
    }
    catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
