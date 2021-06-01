import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Challenges_Test {
    @Test
    public void ageInDays_test1(){
        assertEquals(13650, Challenges.ageByDays(10));
    }
    @Test
    public void ageInDays_test2(){
        assertEquals(0, Challenges.ageByDays(0));
    }
    @Test
    public void ageInDays_test3(){
        assertEquals(24090, Challenges.ageByDays(66));
    }
    @Test
    public void ageInDays_test4(){
        assertEquals(0, Challenges.ageByDays(-23));
    }

    @Test
    public void convertToSeconds_test1(){
        assertEquals(0, Challenges.convertToSeconds(0));
    }

    @Test
    public void convertToSeconds_test2(){
        assertEquals(240, Challenges.convertToSeconds(4));
    }
    @Test
    public void convertToSeconds_test3(){
        assertEquals(0, Challenges.convertToSeconds(-40));
    }

    @Test
    public void findNthSmallest_test1(){
        assertEquals(1, Challenges.findNthSmallest(new int[]{1, 3, 5, 7}, 1));
    }

    @Test
    public void findNthSmallest_test2(){
        assertEquals(-1, Challenges.findNthSmallest(new int[]{1, 3, 5, 7}, 5));
    }

    @Test
    public void findNthSmallest_test3(){
        assertEquals(7, Challenges.findNthSmallest(new int[]{7, 3, 4, 2}, 4));
    }

    @Test
    public void sortByLength_test1(){
        assertEquals("my Hello friend", Challenges.sortByLength("Hello my friend"));
    }

    @Test
    public void sortByLength_test2(){
        assertEquals("a if of are can two dead keep them Three secret,", Challenges.sortByLength("Three can keep a secret, if two of them are dead"));
    }

    @Test
    public void sortByLength_test3() {
        assertEquals("is end the This", Challenges.sortByLength("This is the end"));
    }

    @Test
    public void countVowels_test1(){
        assertEquals(4, Challenges.countVowels("Convention"));
    }

    @Test
    public void countVowels_test2(){
        assertEquals(5, Challenges.countVowels("Freddy is MY NIghtmArE"));
    }

    @Test
    public void countVowels_test3(){
        assertEquals(0, Challenges.countVowels("xyzbhHKLMN"));
    }

}
