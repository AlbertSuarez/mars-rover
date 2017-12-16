package com.thoughtworks.MarsRover.factory;

import com.thoughtworks.MarsRover.service.MarsRoverService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertNotNull;

@RunWith(JUnit4.class)
public class ServiceFactoryTest {

    private MarsRoverService marsRoverService;

    @Before
    public void before() {
        this.marsRoverService = ServiceFactory.getMarsRoverService();
    }

    @Test
    public void noEmptyController() throws Exception {
        assertNotNull(this.marsRoverService);
    }

}
