package com.test.example.circulardependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Driver1 {
    private Car1 car1;

    /*public Driver1(Car1 car1) {
        this.car1 = car1;
    }*/

    //@Autowired  //run-2
    //public void setCar1(Car1 car1) {
    //    this.car1 = car1;
   // }


    public Driver1(Car1 car1) {  // run-3, will not use @Lazy here as already used in Car1 class
        this.car1 = car1;
    }

    public void showCar() {
        System.out.println("my car: " + car1);
    }
}
