package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertMinutesToSecondsTest {
    @Test
    public void shouldConvertMinToSec() {
        //given
        int min = 20;

        //when
        int result = ConvertMinutesToSeconds.convertMinToSec(20);

        //then
        Assertions.assertEquals(1200, result);
    }
}
