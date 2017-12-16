package com.thoughtworks.MarsRover.service;

import com.thoughtworks.MarsRover.factory.ServiceFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertNotNull;

@RunWith(JUnit4.class)
public class MarsRoverServiceTest {

    private MarsRoverService marsRoverService;

    @Before
    public void before() {
        this.marsRoverService = ServiceFactory.getMarsRoverService();
    }

    @Test
    public void noEmptyService() throws Exception {
        assertNotNull(this.marsRoverService);
    }

}
