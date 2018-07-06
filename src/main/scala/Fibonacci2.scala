object Fibonacci2 {
  def main(args: Array[String]): Unit = {

    fibonacci()

    def fibonacci(list: Seq[Int] = Seq(0,1)){
      val listSum = list.last + list(list.length -2)
      listSum match {
        case _ if listSum >= 100 => println(list)
        case _ => fibonacci(list:+listSum)
      }
    }
  }
}
