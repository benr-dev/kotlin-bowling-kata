package org.example

class BowlingGame {
    fun getScore(vararg scores: Int): Int {
        var total = 0
        var game = 0

        for(frame in 1..10) {
            if(isStrikeGame(scores, game)) {
                total += 10 + scores[game+1]+ scores[game+2]
                game += 1
            }
            else if(isSpareGame(scores, game)) {
                total += 10 + scores[game+2]
                game += 2
            }
            else {
                total += scores[game] + scores[game+1]
                game += 2
            }
        }

        return total
    }

    private fun isStrikeGame(scores: IntArray, game: Int): Boolean {
        return scores[game] == 10
    }

    private fun isSpareGame(scores: IntArray, game: Int): Boolean {
        return scores[game] + scores[game+1] == 10
    }
}
