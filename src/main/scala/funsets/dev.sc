import funsets.FunSets

object test{

  import funsets.FunSets._

  var s1:Set = singletonSet(1)
  var s2:Set = singletonSet(2)
  var s3:Set = singletonSet(3)


  contains(s1,1)
  contains(s2,2)
  contains(s3,3)

  // 1,2
  var su:Set = union(s1, s2)
  FunSets.toString(su)

  contains(su,1)
  contains(su,2)
  contains(su,3)

  // 2
  var sd = diff(su,s1)
  FunSets.toString(sd)

  contains(sd,1)
  contains(sd,2)
  contains(sd,3)

  // 1
  var sd2 = diff(su,s2)
  FunSets.toString(sd2)

  contains(sd2,1)
  contains(sd2,2)
  contains(sd2,3)

  // 2,3
  var su2:Set = union(s3, s2)
  FunSets.toString(su2)

  contains(su2,1)
  contains(su2,2)
  contains(su2,3)

  // 2
  var si = intersect(su, su2)
  FunSets.toString(si)

  contains(si,1)
  contains(si,2)
  contains(si,3)

  var su3:Set = union(su, s3)
  FunSets.toString(su)
  FunSets.toString(su2)
  FunSets.toString(su3)

  contains(su3,1)
  contains(su3,2)
  contains(su3,3)

  var sf = filter(su3, x => x %2 ==1)
  FunSets.toString(sf)

  contains(sf,1)
  contains(sf,2)
  contains(sf,3)


  val su4 = union(union(s1, s2),s3)
  FunSets.toString(su4)
  var sd3 = diff(su4, s3)
  FunSets.toString(sd3)

  contains(sd3,1)
  contains(sd3,2)
  contains(sd3,3)


}