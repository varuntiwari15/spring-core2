package com.test.example.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Car1 {
    private Driver1 driver1;

    ////public Car1(Driver1 driver1) {
    //    this.driver1 = driver1;
    //}

  //  @Autowired  //run-2
  //  public void setDriver1(Driver1 driver1) {
  //      this.driver1 = driver1;
  //  }


    public Car1(@Lazy Driver1 driver1) {  //run-3
        this.driver1 = driver1;
    }

    public void drive() {
        System.out.println("driven by: " + driver1);
    }
}
