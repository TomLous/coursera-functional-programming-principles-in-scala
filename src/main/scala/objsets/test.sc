
import scala.util.Try

object Test{

  def except: Int = {
    throw new java.util.NoSuchElementException
  }

  def noexcept: Int = {
    5
  }



  val a = Try{ except} getOrElse




  val b = noexcept

  b> 3

  b > a

  a




}