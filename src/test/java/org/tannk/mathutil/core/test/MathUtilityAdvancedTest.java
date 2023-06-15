/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.tannk.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.tannk.mathutil.core.MathUtility;
import static org.tannk.mathutil.core.MathUtility.*;

/**
 *
 * @author TNK
 */
public class MathUtilityAdvancedTest {
    
    //hàm chuẩn bị test data, sẽ fill vào hàm assertE() bên dưới
    public static Object[][] initTestData(){
        Object testData[][] = {{0, 1}, 
                               {1, 1}, 
                               {2, 2}, 
                               {4, 24}, 
                               {5, 120}};
        return testData;
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    public void TestFactorialGivenRightArgumentRunsWell(int n, long expected){
        assertEquals(expected, getFactorial(n));
    }
    
    @Test
    public void testFactorialGivenWrongArgumentThrowsException(){
//        Executable gF = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                MathUtility.getFactorial(-5);
//            }
//        };
        
        Executable gF = () -> MathUtility.getFactorial(-5);
        
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-5));
    }
}
