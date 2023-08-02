package com.javatechie.redis.respository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

class CalculatemathsTest {


    @InjectMocks
    private Calculatemaths calculatemaths;

    @BeforeEach
    void setUp() {

        calculatemaths = new Calculatemaths();
    }

//    @AfterEach
//    void tearDown() {
//
//
//    }

    @Test
    public void shoudDoSum(){

        //assertEquals(6,calculatemaths.getSum(2,4));
    }
}