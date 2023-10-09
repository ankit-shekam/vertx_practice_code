package com.ankit.udemyCourse.starter;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class VetricleA extends AbstractVerticle {
  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    System.out.println("Started" + getClass().getName());
    startPromise.complete();
  }
}
