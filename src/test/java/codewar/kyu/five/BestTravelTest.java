package codewar.kyu.five;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BestTravelTest {

    @Test
    public void testSmallRoutes() {
        List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
        //105,106,107,108 | 111,112,113 | 114,115 |
        int n = BestTravel.chooseBestSum(115, 2, ts);
        assertEquals(115, n);
        n = BestTravel.chooseBestSum(110, 2, ts);
        assertEquals(108, n);
    }

    @Test
    public void testSmallNumbers() {
        List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
        //161,163,164,168
        int n = BestTravel.chooseBestSum(163, 3, ts);
        assertEquals(163, n);
        ts = new ArrayList<>(Collections.singletonList(50));
        Integer m = BestTravel.chooseBestSum(163, 3, ts);
        assertNull(m);
        ts = new ArrayList<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87));
        n = BestTravel.chooseBestSum(230, 3, ts);
        assertEquals(228, n);
    }

    @Test
    public void testBigRoutes() {
        List<Integer> ts = new ArrayList<>(Arrays.asList(90, 91, 80, 75, 50, 55, 56, 57, 58, 59, 60));
        Integer n = BestTravel.chooseBestSum(295, 4, ts);
        assertEquals(295, n);
        n = BestTravel.chooseBestSum(307, 4, ts);
        assertEquals(306, n);//90+91+75+50
    }
}
