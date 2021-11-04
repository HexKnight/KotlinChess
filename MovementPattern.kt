import kotlin.math.abs

enum class MovementPattern(
    private val str: String,
    private val pattern: (Pair<Int, Int>, Pair<Int, Int>) -> Boolean,
) {

    KING_PATTERN("K", { current, target ->
        abs(target.first - current.first) <= 1 &&
                abs(target.second - current.second) <= 1
    }),

    QUEEN_PATTERN("Q", { current, target ->
        abs(target.first - current.first) == abs(target.second - current.second) ||
                (abs(target.first - current.first) == 0 || abs(target.second - current.second) == 0)
    }),

    BISHOP_PATTERN("B", { current, target ->
        abs(target.first - current.first) == abs(target.second - current.second)
    }),

    KNIGHT_PATTERN("H", { current, target ->
        (abs(target.first - current.first) == 1 && abs(target.second - current.second) == 2) ||
                (abs(target.first - current.first) == 2 && abs(target.second - current.second) == 1)
    }),

    ROOK_PATTERN("R", { current, target ->
        abs(target.first - current.first) == 0 ||
                abs(target.second - current.second) == 0
    }),

    FORWARD_PAWN_PATTERN("p", { current, target ->
        target.first > current.first &&
                (target.first - current.first) <= 2
    }),

    BACKWARD_PAWN_PATTERN("p", { current, target ->
        current.first > target.first &&
                (current.first - target.first) <= 2
    });

    operator fun invoke(current: Pair<Int, Int>, target: Pair<Int, Int>) =
        pattern(current, target)

    override fun toString(): String = str

}