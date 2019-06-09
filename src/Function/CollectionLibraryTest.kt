package Function

fun main() {
    val strings: List<String> = listOf("first", "second", "fourteenth")
    println(strings.last())
    val numbers: Collection<Int> = setOf(1,2,14)
    println(numbers.max())
    // infix function 1 to "one" -> 1.to("one")
    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    // destructuring
    for((index, element) in strings.withIndex()) {
        println("$index: $element")
    }

}