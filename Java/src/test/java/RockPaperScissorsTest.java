import io.github.joaorbrandao.RockPaperScissors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RockPaperScissorsTest {
    @Test
    void rockBeatsScissors() {
        var game = new RockPaperScissors("rock paper");
        assertEquals("Player 2 wins: paper beats rock", game.play());
    }
}
