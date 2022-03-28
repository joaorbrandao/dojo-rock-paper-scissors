import { RockPaperScissors } from '@/rock-paper-scissors';

describe('Rock, Paper, Scissors Game Unit Tests', () => {
  it('rock beats scissors', () => {
    const game = new RockPaperScissors("rock paper");
    expect(game.play).toEqual("Player 2 wins: paper beats rock");
  });
});
