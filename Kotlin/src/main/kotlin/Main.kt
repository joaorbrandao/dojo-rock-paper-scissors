fun main(args: Array<String>) {
    val input = args.first()
    println("Input: $input")

    val output = RockPaperScissors(input).play()
    println(output)
}