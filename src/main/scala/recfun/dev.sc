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


}