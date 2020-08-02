package me.mayankgrover.spring.in28minutes.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDao {
    public SomeCdiDao() {
        System.out.println("SomeCdiDao");
    }
}
