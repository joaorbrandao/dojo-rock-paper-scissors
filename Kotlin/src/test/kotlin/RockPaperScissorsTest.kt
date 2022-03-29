import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RockPaperScissorsTest {
    @Test
    fun `rock beats scissors`() {
        val game = RockPaperScissors("rock paper")
        assertEquals("Player 2 wins: paper beats rock", game.play())
    }
}