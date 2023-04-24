package io.github.monun.speculation.paper

import io.github.monun.speculation.game.Piece
import io.github.monun.speculation.paper.util.playSound
import io.github.monun.tap.fake.FakeEntity
import net.kyori.adventure.text.Component
import org.bukkit.Sound
import org.bukkit.entity.Player
import org.bukkit.scoreboard.Score

class PaperPiece(val process: PaperGameProcess, val piece: Piece, val color: PieceColor, player: Player) {
    val name: Component = Component.text().content(piece.name).color(color.textColor).build()

    var player: Player? = player

    lateinit var bukkitScore: Score
    lateinit var stand: FakeEntity

    var score: Int
        get() {
            return bukkitScore.score
        }
        set(value) {
            bukkitScore.score = value
        }


    fun playStepSound() {
        stand.location.playSound(Sound.BLOCK_STONE_STEP, 1.0F)
    }

    fun updateScore(balance: Int) {
        this.bukkitScore.score = balance
    }
}