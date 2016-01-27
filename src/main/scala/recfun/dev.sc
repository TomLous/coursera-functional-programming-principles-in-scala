object test{
  def pascal(c: Int, r: Int): Int = {
    if(c > r || c < 0 || r < 0) 0
    else if (c==0 || r==0) 1
    else pascal(c-1, r-1) + pascal(c, r-1)
  }

  pascal(2,0)
  pascal(0,2)
  pascal(1,2)
  pascal(1,3)
  pascal(2,4)

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

  balance("test ()()".toList)
  balance("test ()(".toList)
  balance("test ())(".toList)

  def countChange(money: Int, coins: List[Int]): Int = {

    def iterateCoins(remainingMoney: Int, cns: List[Int], combination:String): Int = {
//      System.out.print(remainingMoney + " : ")
//      System.out.println(cns)
      if(remainingMoney < 0){
//        System.out.println("-----")
        0
      }
      else if(remainingMoney == 0){
        System.out.println(combination)
        1
      }
      else if(cns.isEmpty) {
//        System.out.println("-----")
        0
      }
      else iterateCoins(remainingMoney, cns.tail, combination) +
            //iterateCoins(remainingMoney-cns.head, cns.tail, combination+"+"+cns.head) +
            iterateCoins(remainingMoney-cns.head, cns, combination+"+"+cns.head)

    }

    iterateCoins(money, coins, "")

  }

  countChange(4,List(1,2))
  countChange(5,List(1,2,3))

// 1+1+1+1+1
  // 2+2+1
  // 2+1+1+1
  //
}