class Spot (private val piece: Piece? = null) {

    val threateners = mutableListOf<Piece>()

    override fun toString() =
        piece.toString() ?: "  "
}