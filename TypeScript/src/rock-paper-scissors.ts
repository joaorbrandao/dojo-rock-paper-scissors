class Player {
  constructor(private move: string) {
    this.move = move;
  }

  getMove() {
    return this.move;
  }
}

class RulesEngine {

  private rules = {
    scissors: "paper",
    paper: "rock",
    rock: "scissors",
  };

  getWinner(player1: Player, player2: Player): string {
    const player1Move = player1.getMove();
    const player2Move = player2.getMove();

    if (player1Move === player2Move) {
      return "Draw";
    }

    if (this.rules[player1Move] === player2Move) {
      return `Player 1 wins: ${player1Move} beats ${player2Move}`;
    }
    return `Player 2 wins: ${player2Move} beats ${player1Move}`;
  }
}

export class RockPaperScissors {
  private player1: Player;
  private player2: Player;

  constructor(private readonly input: string) {
    this.player1 = new Player(this.input.split(" ")[0]);
    this.player2 = new Player(this.input.split(" ")[1]);
  }

  play(): String {
    const engine = new RulesEngine();
    return engine.getWinner(this.player1, this.player2);
  }
}

// André Carvalho
// Pedro Alves
// André Coelho
// Brandão
// Anna
// José
// Solomiya
