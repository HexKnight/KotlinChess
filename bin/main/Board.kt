class Board (player1: Player, player2: Player) {

    init {

    }

    private companion object {
        val template =
            """
                    A  B  C  D  E  F  G  H
                  ╔══╤══╤══╤══╤══╤══╤══╤══╗
                1 ║%s│%s│%s│%s│%s│%s│%s│%s║ 1
                2 ║%s│%s│%s│%s│%s│%s│%s│%s║ 2
                3 ║%s│%s│%s│%s│%s│%s│%s│%s║ 3
                4 ║%s│%s│%s│%s│%s│%s│%s│%s║ 4
                5 ║%s│%s│%s│%s│%s│%s│%s│%s║ 5
                6 ║%s│%s│%s│%s│%s│%s│%s│%s║ 6
                7 ║%s│%s│%s│%s│%s│%s│%s│%s║ 7
                8 ║%s│%s│%s│%s│%s│%s│%s│%s║ 8
                  ╚══╧══╧══╧══╧══╧══╧══╧══╝
                    A  B  C  D  E  F  G  H
            """.trimIndent()
    }

    override fun toString(): String {
        return String.format(template, *Array(8*8) { ">"+MovementPattern.values().random() })
    }
}