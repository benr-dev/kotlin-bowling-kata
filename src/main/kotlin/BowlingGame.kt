package org.example

class BowlingGame {
    fun getScore(vararg scores: Int): Int {
        var total = 0
        var scoreIndex = 0

        for(frame in 1..10) {
            val frame = getFrame(scores, scoreIndex)
            total += frame.getScore()
            scoreIndex += frame.getScoreIndexOffset()
        }

        return total
    }

    private fun getFrame(scores: IntArray, game: Int): Frame {
        return when {
            isStrikeGame(scores, game) -> StrikeFrame(scores[game+1], scores[game+2])
            isSpareGame(scores, game)  -> SpareFrame(scores[game+2])
            else                       -> RegularFrame(scores[game], scores[game+1])
        }
    }

    private fun isStrikeGame(scores: IntArray, game: Int) = (scores[game] == 10)
    private fun isSpareGame(scores: IntArray, game: Int) = (scores[game] + scores[game+1] == 10)
}
