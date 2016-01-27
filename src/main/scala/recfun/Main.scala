package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if(c > r || c < 0 || r < 0) 0
    else if (c==0 || r==0) 1
    else pascal(c-1, r-1) + pascal(c, r-1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    if(chars.isEmpty) true
    else{
      def checkNextChar(openCount: Int, ch: List[Char]): Int = {
        if(openCount < 0) -1
        else if(ch.isEmpty) openCount
        else if(ch.head == '(') checkNextChar(openCount + 1, ch.tail)
        else if(ch.head == ')') checkNextChar(openCount - 1, ch.tail)
        else checkNextChar(openCount, ch.tail)
      }
      checkNextChar(0, chars) == 0
    }
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    def iterateCoins(remainingMoney: Int, cns: List[Int], combination:String): Int = {
      if(remainingMoney < 0) 0
      else if(remainingMoney == 0) 1
      else if(cns.isEmpty) 0
      else iterateCoins(remainingMoney, cns.tail, combination) +
        iterateCoins(remainingMoney-cns.head, cns, combination+"+"+cns.head)
    }

    iterateCoins(money, coins, "")

  }
}
