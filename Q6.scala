object Q6 {
    def fib(n:Int):Int= n match{
        case n if n==0 => 0
        case n if n==1 => 1
        case n => fib(n-1)+fib(n-2)
    }  

    def fibSeq(n: Int) : Unit = for (i <- 0 to n) println(fib(i))


    def main(args: Array[String]): Unit = {
        println(fibSeq(10))
    }
}