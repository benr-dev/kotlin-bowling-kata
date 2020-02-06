import org.example.BowlingGame

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestBowling {

    @Test fun test_gutterGame_then_zeroScore() {
        // given
        val bowlingGame = BowlingGame()

        // when
        val score = bowlingGame.getScore(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0)

        assertThat(score, equalTo(0))
    }

    @Test fun test_all1sGame_then_scoreIs20() {
        // given
        val bowlingGame = BowlingGame()

        // when
        val score = bowlingGame.getScore(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1)

        assertThat(score, equalTo(20))
    }

    @Test fun test_spareGameFollowedBy1sGame_then_scoreIs13() {
        // given
        val bowlingGame = BowlingGame()

        // when
        val score = bowlingGame.getScore(1,9, 1,1, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0)

        assertThat(score, equalTo(13))
    }

    @Test fun test_strikeGameFollowedBy1sGame_then_scoreIs14() {
        // given
        val bowlingGame = BowlingGame()

        // when
        val score = bowlingGame.getScore(10, 1,1, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0)

        assertThat(score, equalTo(14))
    }

    @Test fun test_strikeGameFollowedBySpareFollowedBy90Game_then_scoreIs48() {
        // given
        val bowlingGame = BowlingGame()

        // when
        val score = bowlingGame.getScore(10, 9,1, 9,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0)

        assertThat(score, equalTo(48))
    }

    @Test fun test_perfectGame_then_scoreIs300() {
        // given
        val bowlingGame = BowlingGame()

        // when
        val score = bowlingGame.getScore(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)

        assertThat(score, equalTo(300))
    }
}