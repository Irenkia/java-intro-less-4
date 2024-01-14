package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertTimeTest {
    @Test
    public void shouldConvertHoursToSec() {
        //given
        int hours = 2;

        //when
        int result = ConvertTime.convertHoursToSec(2);

        //then
        Assertions.assertEquals(7200, result);
    }
    @Test
    public void shouldConvertDaysToSec() {
        //given
        int days = 3;

        //when
        int result = ConvertTime.convertDaysToSec(3);

        //then
        Assertions.assertEquals(259200, result);
    }
}
