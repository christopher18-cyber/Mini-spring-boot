package com.genius;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {


//     Field injection
    private Laptop laptop;
//    @Autowired
//    private Laptop laptop;
//    constructor injection
//    Dev(Laptop laptop){
//        this.laptop = laptop;
//    }
//    Setter injection
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }
    public void build(){
        System.out.println("You are working on Awesome project.");
    }
}
