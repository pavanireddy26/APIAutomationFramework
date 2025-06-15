package org.example.tests.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

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

    @Test(groups = "qa", priority = 2)
    @Owner("pavani")
    @Description("#TC#INT1 -Step2. Verify that the booking by Id")
    public void testverifyBookingId(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 3)
    @Owner("pavani")
    @Description("#TC#INT1 -Step3. Verify Update  the booking by Id")
    public void testUpdateBookingById(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 4)
    @Owner("pavani")
    @Description("#TC#INT1 -Step4. Delete  the booking  by ID")
    public void testDeleteBookingById(){
        Assert.assertTrue(true);
    }
}
