import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RockPaperScissorsTest {
    @Test
    fun `rock ties rock`() {
        val game = RockPaperScissors("rock rock")
        assertEquals("It's a draw!", game.play())
    }

    @Test
    fun `rock beats paper`() {
        val game = RockPaperScissors("rock paper")
        assertEquals("Player 2 wins: paper beats rock", game.play())
    }

    @Test
    fun `rock beats scissors`() {
        val game = RockPaperScissors("rock scissors")
        assertEquals("Player 1 wins: rock beats scissors", game.play())
    }    

    @Test
    fun `scissors ties scissors`() {
        val game = RockPaperScissors("scissors scissors")
        assertEquals("It's a draw!", game.play())
    }    

    @Test
    fun `scissors beats paper`() {
        val game = RockPaperScissors("scissors paper")
        assertEquals("Player 1 wins: scissors beats paper", game.play())
    }

    @Test
    fun `scissors beats rock`() {
        val game = RockPaperScissors("scissors rock")
        assertEquals("Player 2 wins: rock beats scissors", game.play())
    }

    @Test
    fun `paper ties paper`() {
        val game = RockPaperScissors("paper paper")
        assertEquals("It's a draw!", game.play())
    }    

    @Test
    fun `paper beats rock`() {
        val game = RockPaperScissors("paper rock")
        assertEquals("Player 1 wins: paper beats rock", game.play())
    }

    @Test
    fun `paper beats scissors`() {
        val game = RockPaperScissors("paper scissors")
        assertEquals("Player 2 wins: scissors beats paper", game.play())
    }
}