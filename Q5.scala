object Q5 {
    
    def sum(n : Int): Int = n match {
        case 0 => return 0
        case x if(x % 2 == 0) => return x + sum(x - 1)
        case x if(x % 2 == 1) => sum(n - 1)
    }

    def main(args: Array[String]): Unit = {
        println(sum(10))
    }
}