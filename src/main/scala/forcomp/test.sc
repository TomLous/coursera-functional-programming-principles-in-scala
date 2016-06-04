object Test{
  var word = "tOmMielous"

  word.
    groupBy(c => c.toLower).
    map(x => (x._1, x._2.length))


  for(
    (c, s) <- word.groupBy(c => c.toLower)
  ) yield (c,s.length)


  //  grouped.map(x => (x._1, x._2.length))




}