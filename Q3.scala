object Q3 {
    def sum(n : Int): Int = n match {
        case 0 => return 0
        case x => return x + sum(x - 1)
    }

    def main(args: Array[String]): Unit = {
        println(sum(10))
    }
}