

object Test {

  import forcomp.Anagrams
  import forcomp._

  var word = "tOmMielous"

  word.
    groupBy(c => c.toLower).
    map(x => (x._1, x._2.length))


  for (
    (c, s) <- word.groupBy(c => c.toLower)
  ) yield (c, s.length)

  Anagrams.wordOccurrences(word)

  //  grouped.map(x => (x._1, x._2.length))

  val s = List("abcc", "BAaD", "aDe")

  s.flatMap(w => Anagrams.wordOccurrences(w)).groupBy(_._1).mapValues(_.map(_._2).sum)

  for (
    (c, l) <- s.flatMap(w => Anagrams.wordOccurrences(w)).groupBy(_._1)
  ) yield (c, l.map(_._2).sum)

  s map (w => Anagrams.wordOccurrences(w))


  //  val dictionary: List[String] = loadDictionary
  //
  //   val lookup = dictionary.groupBy(s => Anagrams.wordOccurrences(s)) withDefaultValue (List())
  //
  //  lookup(Anagrams.wordOccurrences("eat"))
  //
  //  lookup(Anagrams.wordOccurrences("q"))


  val occ = List(('a', 2), ('b', 2))
  type Occurrences = List[(Char, Int)]

  val l ={
    for (
    (c, ci) <- occ;
    cit <- 1 to ci
  ) yield (c, cit)
  }

  l.toSet.subsets.map(_.groupBy(c => c._1)).toList


  val ocs = occ.map( x => (for(i <- 1 to (x._2)) yield (x._1,i)).toList)
  ocs.foldRight(List[Occurrences](Nil))((x,y) => y ++ (for(i <- x; j <- y) yield (i :: j)))

    //.groupBy(c => c._1)




  //






}