package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckTriangleIsRectangularTest {
    @Test
    public void shouldIsTriangleRectangularTrue(){
        //given
        double cathetus1= 12;
        double cathetus2 = 5;
        double hypotenuse = 13;

        //when
        boolean result = CheckTriangleIsRectangular.isTriangleRectangular(12, 5, 13);

        //then
        Assertions.assertTrue(result);
    }
    @Test
    public void shouldIsTriangleRectangularFalse(){
        //given
        double cathetus1= 7;
        double cathetus2 = 4;
        double hypotenuse = 8;

        //when
        boolean result = CheckTriangleIsRectangular.isTriangleRectangular(7, 4, 8);

        //then
        Assertions.assertFalse(result);
    }
}
