import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        assertEquals(2, Week4.max2Int(1, 2));
    }

    @Test
    public void testMax2Int2(){
        assertEquals(3, Week4.max2Int(2, 3));
    }

    @Test
    public void testMax2Int3(){
        assertEquals(1000, Week4.max2Int(1000, 2));
    }

    @Test
    public void testMax2Int4(){
        assertEquals(5, Week4.max2Int(3, 5));
    }

    @Test
    public void testMax2Int5(){
        assertEquals(10, Week4.max2Int(5, 10));
    }

    @Test
    public void testMinArray1(){
        assertEquals(1, Week4.minArray(new int[]{1, 2, 3}));
    }

    @Test
    public void testMinArray2(){
        assertEquals(10, Week4.minArray(new int[]{10, 24, 33, 194, 345}));
    }

    @Test
    public void testMinArray3(){
        assertEquals(103, Week4.minArray(new int[]{103, 222, 3345434, 223}));
    }

    @Test
    public void testMinArray4(){
        assertEquals(12, Week4.minArray(new int[]{12, 23, 43, 32}));
    }

    @Test
    public void testMinArray5(){
        assertEquals(-23, Week4.minArray(new int[]{13, -23, 3, 0}));
    }

    @Test
    public void testCalculateBMI1(){
        assertEquals("Thiếu cân", Week4.calculateBMI(1, 1));
    }

    @Test
    public void testCalculateBMI2(){
        assertEquals("Thừa cân", Week4.calculateBMI(100, 1));
    }

    @Test
    public void testCalculateBMI3(){
        assertEquals("Thiếu cân", Week4.calculateBMI(1, 100));
    }

    @Test
    public void testCalculateBMI4(){
        assertEquals("Thừa cân", Week4.calculateBMI(1454, 1));
    }

    @Test
    public void testCalculateBMI5(){
        assertEquals("Thiếu cân", Week4.calculateBMI(1, 1));
    }
}

