class Spot (
    private val x: UInt,
    private val y: UInt,
    private val piece: Piece? = null
) {

    val threateners = mutableListOf<Piece>()

    val safe
        get() = threateners.isEmpty()

    override fun toString() =
        piece.toString() ?: "  "
}