using NUnit.Framework;

namespace Friday.RockPaperScissors.Tests;

public class RockPaperScissorsTest
{
    [Test]
    public void RockBeatsScissors()
    {
        var input = new[] {"rock paper"};
        var game = new RockPaperScissors();
        var result = game.Play(input);
        
        Assert.Equals(result, "Player 2 wins: paper beats rock");
    }
}