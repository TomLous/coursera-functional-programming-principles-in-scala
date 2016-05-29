package patmat

/**
  * Created by tomlous on 29/04/16.
  */
object Main  extends App{
  import Huffman._
  println(decodedSecret)

  println(decode(frenchCode,encode(frenchCode) ("hallo".toList)))

  println(convert(frenchCode))
}

