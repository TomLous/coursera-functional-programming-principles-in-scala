

object Test{

  import forcomp.Anagrams
  import forcomp._

  var word = "tOmMielous"

  word.
    groupBy(c => c.toLower).
    map(x => (x._1, x._2.length))


  for(
    (c, s) <- word.groupBy(c => c.toLower)
  ) yield (c,s.length)

  Anagrams.wordOccurrences(word)

  //  grouped.map(x => (x._1, x._2.length))

  val s = List("abcc", "BAaD", "aDe")

  s.flatMap(w => Anagrams.wordOccurrences(w)).groupBy(_._1).mapValues(_.map(_._2).sum)

  for(
    (c, l) <- s.flatMap(w => Anagrams.wordOccurrences(w)).groupBy(_._1)
  ) yield (c, l.map(_._2).sum)

  s map (w => Anagrams.wordOccurrences(w)


  val dictionary: List[String] = loadDictionary

  dictionary.groupBy(s => Anagrams.wordOccurrences(s))

  //






}