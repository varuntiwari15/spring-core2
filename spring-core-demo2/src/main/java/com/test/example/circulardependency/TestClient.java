package com.test.example.circulardependency;

public class TestClient {
    public static void main(String[] args) {
       // Car car = new Car() // can not initlialize as it depends on Driver object
       // Driver driver = new Driver(); // can not initilize as depends on car object
        // circular/cyclic dependency--same issue with spring also
        // tried to create same with spring as Car1 and Driver1
    }
}
