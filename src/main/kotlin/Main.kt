
fun main() {
    class cc(a: ()->Unit)
    cc {}
    val boi = fun(m: MovementPattern)  =println(m)
//    println(Board())
    MovementPattern.FORWARD_PAWN_PATTERN(1 to 1, 2 to 2)
    var s = Spot()
    s.threateners.add(Piece())
    println(s.threateners)
}
