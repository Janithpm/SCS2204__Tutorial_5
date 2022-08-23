object Q4 {
    def oddOREven(n : Int): Unit = n match {
        case 0 => println("Number is even")
        case 1 => println("Number is odd")
        case x if (x < 0) => oddOREven(-1 * n)
        case _ => oddOREven(n - 2)
    }

    def main(args: Array[String]): Unit = {
        println(oddOREven(11))
    }
}