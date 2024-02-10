package org.jfree.data.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jfree.data.DataUtilities;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DataUtilitiesTest {
    private double[] doubleArray;
    double[] nullArray;
    double[] emptyArray;
    double[] nullValue;

    double[][] double2dArray;
    double[][] nulldouble2dArray;
    double[][] null2dArray;
    double[][] empty2dArray;
    double[][] null2dValue;

    @Before
    public void setUp() {
        // Initialize values for NumberArray
        doubleArray = new double[] { 1.0, -2.5, 7 };
        nullArray = new double[] { Double.NaN, Double.NaN, Double.NaN };
        emptyArray = new double[] {};
        nullValue = null;

        // Initialize values for NumberArray2D
        double2dArray = new double[][] { { 1.0, -2.5, 3.7 }, { 4.2, 5.0, 6.3 } };
        nulldouble2dArray = new double[][] { { -2.5, 3.7 }, { Double.NaN, 6.3 } };
        null2dArray = new double[][] { { Double.NaN, Double.NaN }, { Double.NaN, Double.NaN } };
        empty2dArray = new double[][] { {}, {} };
        null2dValue = null;
    }

    //////// CreateNumberArray Tests ////////
    //
    //// Double Array ////
    @Test
    public void testCreateNumberArray_ValidDoubleData_CheckNotNull() {
        // Exercise
        Number[] newNumberArray = DataUtilities.createNumberArray(doubleArray);

        // Verify
        assertNotNull("NumberArray is null and should have contain: " + Arrays.toString(doubleArray), newNumberArray);
    }

    @Test
    public void testCreateNumberArray_ValidDoubleData_CheckLength() {
        // Exercise
        Number[] newNumberArray = DataUtilities.createNumberArray(doubleArray);

        // Verify
        assertEquals("Original array and NumberArray do not have the same length.", doubleArray.length,
                newNumberArray.length);
    }

    @Test
    public void testCreateNumberArray_ValidDoubleData_CheckElement0Match() {
        // Exercise
        Number[] newNumberArray = DataUtilities.createNumberArray(doubleArray);

        // Verify
        assertEquals("Element 0 in Original array and NumberArray do not match.", doubleArray[0],
                newNumberArray[0]);
    }

    @Test
    public void testCreateNumberArray_ValidDoubleData_CheckElement1Match() {
        // Exercise
        Number[] newNumberArray = DataUtilities.createNumberArray(doubleArray);

        // Verify
        assertEquals("Element 1 in Original array and NumberArray do not match.", doubleArray[1],
                newNumberArray[1]);
    }

    @Test
    public void testCreateNumberArray_ValidDoubleData_CheckElement2Match() {
        // Exercise
        Number[] newNumberArray = DataUtilities.createNumberArray(doubleArray);

        // Verify
        assertEquals("Element 2 in Original array and NumberArray do not match.", doubleArray[2],
                newNumberArray[2]);
    }

    //
    //// Null Array ////
    @Test
    public void testCreateNumberArray_NullArray_CheckNotNull() {
        // Exercise
        Number[] newNumberArray = DataUtilities.createNumberArray(nullArray);

        // Verify
        assertNotNull("NumberArray is null and should have contain: " + Arrays.toString(nullArray), newNumberArray);
    }

    @Test
    public void testCreateNumberArray_NullArray_CheckLength() {
        // Exercise
        Number[] newNumberArray = DataUtilities.createNumberArray(nullArray);

        // Verify
        assertEquals("Original array and NumberArray do not have the same length.", nullArray.length,
                newNumberArray.length);
    }

    @Test
    public void testCreateNumberArray_NullArray_CheckElement0Match() {
        // Exercise
        Number[] newNumberArray = DataUtilities.createNumberArray(nullArray);

        // Verify
        assertEquals("Element 0 in Original array and NumberArray do not match.", nullArray[0],
                newNumberArray[0]);

    }

    @Test
    public void testCreateNumberArray_NullArray_CheckElement1Match() {
        // Exercise
        Number[] newNumberArray = DataUtilities.createNumberArray(nullArray);

        // Verify
        assertEquals("Element 1 in Original array and NumberArray do not match.", nullArray[1],
                newNumberArray[1]);
    }

    @Test
    public void testCreateNumberArray_NullArray_CheckElement2Match() {
        // Exercise
        Number[] newNumberArray = DataUtilities.createNumberArray(nullArray);

        // Verify
        assertEquals("Element 2 in Original array and NumberArray do not match.", nullArray[2],
                newNumberArray[2]);
    }

    //
    //// Empty Array ////
    @Test
    public void testCreateNumberArray_EmptyArray_CheckNotNull() {
        // Exercise
        Number[] newNumberArray = DataUtilities.createNumberArray(emptyArray);

        // Verify
        assertNotNull("NumberArray is null and should have contain: " + Arrays.toString(emptyArray), newNumberArray);
    }

    @Test
    public void testCreateNumberArray_EmptyArray_CheckLength() {
        // Exercise
        Number[] newNumberArray = DataUtilities.createNumberArray(emptyArray);

        // Verify
        assertEquals("Original array and NumberArray do not have the same length.", emptyArray.length,
                newNumberArray.length);
    }

    @Test
    public void testCreateNumberArray_EmptyArray_CheckElement0Match() {
        // Exercise
        Number[] newNumberArray = DataUtilities.createNumberArray(nullArray);

        // Verify
        assertEquals("Element 0 in Original array and NumberArray do not match.", nullArray[0],
                newNumberArray[0]);
    }

    //
    //// Null Value ////
    @Test(expected = IllegalArgumentException.class)
    public void testCreateNumberArray_nullValue() {
        // Exercise
        DataUtilities.createNumberArray(nullValue);
    }

    //////// CreateNumberArray2D Tests ////////
    //
    //// Double Array ////
    @Test
    public void testCreateNumberArray2D_ValidData_CheckNotNull() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(double2dArray);

        // Verify
        assertNotNull("NumberArray is null for input: " + Arrays.deepToString(double2dArray), newNumberArray);
    }

    @Test
    public void testCreateNumberArray2D_ValidData_CheckLength() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(double2dArray);

        // Verify
        assertEquals("Original array and NumberArray do not have the same length.", double2dArray.length,
                newNumberArray.length);
    }

    @Test
    public void testCreateNumberArray2D_ValidData_Check2DLength0() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(double2dArray);

        // Verify
        assertEquals("Original array and NumberArray do not have the same length.", double2dArray[0].length,
                newNumberArray[0].length);
    }

    @Test
    public void testCreateNumberArray2D_ValidData_Check2DLength1() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(double2dArray);

        // Verify
        assertEquals("Original array and NumberArray do not have the same length.", double2dArray[1].length,
                newNumberArray[1].length);
    }

    //// Mixed Input Array ////
    @Test
    public void testCreateNumberArray2D_NullDouble2dArray_CheckNotNull() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(null2dArray);

        // Verify
        assertNotNull("NumberArray is null for input: " + Arrays.deepToString(null2dArray), newNumberArray);
    }

    @Test
    public void testCreateNumberArray2D_NullDouble2dArray_CheckLength() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(null2dArray);

        // Verify
        assertEquals("Original array and NumberArray do not have the same length.", null2dArray.length,
                newNumberArray.length);
    }

    @Test
    public void testCreateNumberArray2D_NullDouble2dArray_CheckElement00Match() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(null2dArray);

        // Verify
        assertEquals("Element [0][0] in Original array and NumberArray do not match.", null2dArray[0][0],
                newNumberArray[0][0]);
    }

    @Test
    public void testCreateNumberArray2D_NullDouble2dArray_CheckElement01Match() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(null2dArray);

        // Verify
        assertEquals("Element [0][1] in Original array and NumberArray do not match.", null2dArray[0][1],
                newNumberArray[0][1]);
    }

    @Test
    public void testCreateNumberArray2D_NullDouble2dArray_CheckElement10Match() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(null2dArray);

        // Verify
        assertEquals("Element [1][0] in Original array and NumberArray do not match.", null2dArray[1][0],
                newNumberArray[1][0]);
    }

    @Test
    public void testCreateNumberArray2D_NullDouble2dArray_CheckElement11Match() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(null2dArray);

        // Verify
        assertEquals("Element [1][1] in Original array and NumberArray do not match.", null2dArray[1][1],
                newNumberArray[1][1]);
    }

    //// Null Array ////
    @Test
    public void testCreateNumberArray2D_Null2dArray_CheckNotNull() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(null2dArray);

        // Verify
        assertNotNull("NumberArray is null for input: " + Arrays.deepToString(null2dArray), newNumberArray);
    }

    @Test
    public void testCreateNumberArray2D_Null2dArray_CheckLength() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(null2dArray);

        // Verify
        assertEquals("Original array and NumberArray do not have the same length.", null2dArray.length,
                newNumberArray.length);
    }

    @Test
    public void testCreateNumberArray2D_Null2dArray_CheckElement00Match() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(null2dArray);

        // Verify
        assertEquals("Element [0][0] in Original array and NumberArray do not match.", null2dArray[0][0],
                newNumberArray[0][0]);
    }

    @Test
    public void testCreateNumberArray2D_Null2dArray_CheckElement01Match() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(null2dArray);

        // Verify
        assertEquals("Element [0][1] in Original array and NumberArray do not match.", null2dArray[0][1],
                newNumberArray[0][1]);
    }

    @Test
    public void testCreateNumberArray2D_Null2dArray_CheckElement10Match() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(null2dArray);

        // Verify
        assertEquals("Element [1][0] in Original array and NumberArray do not match.", null2dArray[1][0],
                newNumberArray[1][0]);
    }

    @Test
    public void testCreateNumberArray2D_Null2dArray_CheckElement11Match() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(null2dArray);

        // Verify
        assertEquals("Element [1][1] in Original array and NumberArray do not match.", null2dArray[1][1],
                newNumberArray[1][1]);
    }

    //
    //// Empty Array ////
    @Test
    public void testCreateNumberArray2D_Empty2dArray_CheckNotNull() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(empty2dArray);

        // Verify
        assertNotNull("NumberArray is null and should have contain: " + Arrays.toString(emptyArray), newNumberArray);
    }

    @Test
    public void testCreateNumberArray2D_Empty2dArray_CheckLength() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(empty2dArray);

        // Verify
        assertEquals("Original array and NumberArray do not have the same length.", emptyArray.length,
                newNumberArray.length);
    }

    @Test
    public void testCreateNumberArray2D_Empty2dArray_CheckElement00Match() {
        // Exercise
        Number[][] newNumberArray = DataUtilities.createNumberArray2D(empty2dArray);

        // Verify
        assertEquals("Element [0][0] in Original array and NumberArray do not match.", empty2dArray[0],
                newNumberArray[0]);
    }

    //
    //// Null Value ////
    @Test(expected = IllegalArgumentException.class)
    public void testCreateNumberArray2D_nullValue() {
        // Exercise
        DataUtilities.createNumberArray2D(null2dValue);
    }

    @After
    public void tearDown() {
        // Destroy 1D array objects
        doubleArray = null;
        nullValue = null;
        emptyArray = null;
        nullArray = null;

        // Destroy 2D array objects
        double2dArray = null;
        nulldouble2dArray = null;
        null2dArray = null;
        empty2dArray = null;
        null2dValue = null;
    }
}
