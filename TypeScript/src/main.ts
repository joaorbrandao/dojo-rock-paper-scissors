import { RockPaperScissors } from './rock-paper-scissors';

const input = process.argv[2];

const game = new RockPaperScissors(input);
const result = game.play();

console.log(result);