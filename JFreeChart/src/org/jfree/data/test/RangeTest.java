package org.jfree.data.test;

import static org.junit.Assert.assertEquals;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeTest  {

    private Range exampleRange;
    @BeforeClass public static void setUpBeforeClass() throws Exception {
    }


    @Before
    public void setUp() throws Exception { exampleRange = new Range(-1, 1);
    }


    @Test
    public void centralValueShouldBeZero() {
        assertEquals("The central value of -1 and 1 should be 0",
        0, exampleRange.getCentralValue(), .000000001d);
    }

    
    @Test
    public void testGetCentralValue_ValidRange() {
        // Arrange
        double lowerBound = 5.0;
        double upperBound = 15.0;
        Range range = new Range(lowerBound, upperBound);

        // Act
        double centralValue = range.getCentralValue();

        // Assert
        double expectedCentralValue = (lowerBound + upperBound) / 2.0;
        assertEquals(expectedCentralValue, centralValue, 0.0001); // Adjust delta as per precision requirements
    }

    @Test
    public void testGetCentralValue_SingleValueRange() {
        // Arrange
        double value = 10.0;
        Range range = new Range(value, value);

        // Act
        double centralValue = range.getCentralValue();

        // Assert
        assertEquals(value, centralValue, 0.0001); // Adjust delta as per precision requirements
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetCentralValue_InvalidRange() {
        // Arrange
        double lowerBound = 20.0;
        double upperBound = 10.0;

        // Act
        Range range = new Range(lowerBound, upperBound);

        // Expect IllegalArgumentException to be thrown
    }
    
    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
}
