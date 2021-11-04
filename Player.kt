class Player(
    private val selectionStrategy: (List<Piece>) -> Piece,
    private val movingStrategy: (List<Spot>) -> Spot
) {
    lateinit var king: Piece


}