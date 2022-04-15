package codewar.kyu.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleTimeDifferenceTest {

    @Test
    public void basicTests(){
        assertEquals("23:59",SimpleTimeDifference.solve(new String[] {"14:51"}));
        assertEquals("09:10",SimpleTimeDifference.solve(new String[] {"21:14", "15:34", "14:51", "06:25", "15:30"})); //21:14-06:25 = 9:11
        assertEquals("11:40",SimpleTimeDifference.solve(new String[] {"23:00","04:22","18:05","06:24"})); //06:24-18:05 = 11:41
        assertEquals("11:40",SimpleTimeDifference.solve(new String[] {"23:00","04:22","18:05","06:24", "23:00"})); //06:24-18:05 = 11:41
    }
}
