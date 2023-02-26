package org.example;

import org.junit.*;

public class SolverTest {
    Solver solver;

    @Before
    public void setUpEveryTest() {
        solver = new Solver();
    }
    //Ex.6.2
    @Test
    public void checkDiscriminantPositive() {
        int result = solver.numberOfRoots(1, 30, 2);
            Assert.assertEquals(2, result);
    }
    @Test
    public void checkDiscriminantNegative() {
        int result = solver.numberOfRoots(1, 0, 36);
        Assert.assertEquals(0, result);
    }
    @Test
    public void checkDiscriminantZero() {
        int result = solver.numberOfRoots(1, 2, 1);
        Assert.assertEquals(1, result);
    }
    @Test
    public void checkNegativeA() {
        int result = solver.numberOfRoots(-100, 10, 2);
        Assert.assertEquals(2, result);
    }
    @Test
    public void checkNegativeB() {
        int result = solver.numberOfRoots(1, -1, 2);
        Assert.assertEquals(0, result);
    }

}
