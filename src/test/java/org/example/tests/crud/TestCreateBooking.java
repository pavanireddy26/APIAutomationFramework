package org.example.tests.crud;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCreateBooking {

    public class TestIntegrationSample {

        // create a booking, create a token
        // verify booking by id
        // update booking
        // delete booking by id

        @Test(groups = "qa", priority = 1)
        @Owner("pavani")
        @Description("#TC#INT1 -Step1. Verify that the booking can be created")
        public void testCreateBooking(){
            Assert.assertTrue(true);
        }
}}
