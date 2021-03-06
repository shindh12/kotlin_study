import Basic.Expr
import Basic.Expr.*

fun main(args: Array<String>){
    println(eval(Sum(Sum(Num(1), Num(2)), (Num(4)))))
}
fun eval(e: Expr) : Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.right) + eval(e.left)
            else -> throw IllegalArgumentException("Unknown expression")
        }
//fun eval(e: Expr) : Int {
//    if(e is Num) {
//        val n = e as Num
//        return n.value
//    }
//    if(e is Sum) {
//        return eval(e.right) + eval(e.left)
//    }
//    throw IllegalArgumentException("Unknown expression")
//}