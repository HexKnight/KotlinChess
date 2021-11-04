class Piece(private val movementPattern: MovementPattern) {

    var selectable = false
        private set

    var selected = false
        private set

    var firstMove = true
        private set

    val threatening: List<Piece> = mutableListOf()

    override fun toString(): String {
        return movementPattern.toString()
    }
}