package com.springboot.race.raceDemo.exceptions;

import java.util.NoSuchElementException;

public class EntityIdNotFoundExc extends NoSuchElementException {

    public EntityIdNotFoundExc(Long id){
        super("The requested id: " + ", seems to not exist in the Database...");
    }

}
