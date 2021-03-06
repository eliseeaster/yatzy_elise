package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    private final YatzyGame yatzyGame = new YatzyGame();

    @Test

    void shouldScoreOnes(){
        assertEquals(4, yatzyGame.score(YatzyCategory.ONES, new int[]{1, 1, 2, 1, 1}));
        assertEquals(2, yatzyGame.score(YatzyCategory.ONES, new int[]{6, 5, 2, 1, 1}));
    }

    @Test

    void shouldScoreTwos(){
        assertEquals(4, yatzyGame.score(YatzyCategory.TWOS, new int[]{1, 1, 2, 2, 1}));
        assertEquals(2, yatzyGame.score(YatzyCategory.TWOS, new int[]{6, 5, 2, 1, 1}));
    }

    @Test
    void shouldScorePairs(){
        assertEquals(2, yatzyGame.score(YatzyCategory.PAIR, new int[]{6, 5, 6, 3, 1}));
    }


}
