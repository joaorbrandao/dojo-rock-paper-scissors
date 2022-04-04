import { RockPaperScissors } from "@/rock-paper-scissors";

describe("Rock, Paper, Scissors Game Unit Tests", () => {
  describe("Player 1 wins", () => {
    it("Rock beats scissors", () => {
      const game = new RockPaperScissors("rock scissors");
      expect(game.play()).toEqual("Player 1 wins: rock beats scissors");
    });

    it("Paper beats Rock", () => {
      const game = new RockPaperScissors("paper rock");
      expect(game.play()).toEqual("Player 1 wins: paper beats rock");
    });

    it("Scissors beats Paper", () => {
      const game = new RockPaperScissors("scissors paper");
      expect(game.play()).toEqual("Player 1 wins: scissors beats paper");
    });
  });

  describe("Player 2 wins", () => {
    it("Rock beats scissors", () => {
      const game = new RockPaperScissors("scissors rock");
      expect(game.play()).toEqual("Player 2 wins: rock beats scissors");
    });

    it("Paper beats Rock", () => {
      const game = new RockPaperScissors("rock paper");
      expect(game.play()).toEqual("Player 2 wins: paper beats rock");
    });

    it("Scissors beats Paper", () => {
      const game = new RockPaperScissors("paper scissors");
      expect(game.play()).toEqual("Player 2 wins: scissors beats paper");
    });
  });

  describe("Draw", () => {
    it("Should return Draw", () => {
      const game = new RockPaperScissors("paper paper");
      expect(game.play()).toEqual("Draw");
    });
  });
});
