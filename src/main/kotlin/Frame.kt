package org.example

interface Frame {
    fun getScore(): Int
    fun getScoreIndexOffset(): Int
}

class StrikeFrame(val nextScore: Int, val nextNextScore: Int): Frame {

    override fun getScore() = 10 + nextScore + nextNextScore;
    override fun getScoreIndexOffset() = 1
}

class SpareFrame(val nextScore: Int): Frame {

    override fun getScore() = 10 + nextScore;
    override fun getScoreIndexOffset() = 2
}

class RegularFrame(val currentScore: Int, val nextScore: Int): Frame {

    override fun getScore() = currentScore + nextScore;
    override fun getScoreIndexOffset() = 2
}
