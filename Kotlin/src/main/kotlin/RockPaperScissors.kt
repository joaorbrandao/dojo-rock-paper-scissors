class RockPaperScissors(private val input: String) {
    fun play(): String {
        val players = input.split(" ");
        val winner = getWinner(players);
        if (winner == -1) return "It's a draw!"
        return "Player ${winner+1} wins: ${players[winner]} beats ${players[((winner + 1) % 2)]}"
    }

    fun getWinner(players: List<String>): Int {
        if (players[0].equals(players[1], true)) return -1
        if (players[0].equals("rock") && players[1].equals("scissors")) return 0        
        if (players[0].equals("scissors") && players[1].equals("paper")) return 0        
        if (players[0].equals("paper") && players[1].equals("rock")) return 0
        return 1
    }
}