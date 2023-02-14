fun main() {
    print(climbStairs(3))
}

fun climbStairs(n: Int): Int {
    var first = 0
    var second = 1
    val list = ArrayList<Int>()
    list.add(0)
    list.add(1)
    for (i in 0 until n) {
        val sum = first + second
        list.add(sum)
        first = second
        second = sum
    }
    return list[n + 1]
}