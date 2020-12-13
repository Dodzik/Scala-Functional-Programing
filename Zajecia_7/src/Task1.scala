
class TripleContainer[+T](x:T,y:T,z:T){
    def _1[T](rak: T)={
      new TripleContainer(rak,y,z)
    }

  def _2[T](rak: T)={
    new TripleContainer(x,rak,z)
  }

  def _3[T](rak: T)={
    new TripleContainer(x,y,rak)
  }

  override def toString() = "( "+x+" "+y+" "+z+" )"
}



object Task1 extends App {

  val tc = new TripleContainer(1,3,5);

  println(tc)

  class SContainer(val str: String) {
    override def toString() = str
  }

  class ItoSContainer(val num: Int) extends SContainer(num.toString) {}


    val sss = new TripleContainer(new SContainer("k1"), new SContainer("k2"), new SContainer("k3"))
    println(sss)
    val sis = new TripleContainer(new SContainer("k1"), new ItoSContainer(67), new SContainer("k3"))
    println(sis)
    val iii = new TripleContainer(new ItoSContainer(88765), new ItoSContainer(67), new ItoSContainer(78))
    println(iii)
    val iis = sis._1(new ItoSContainer(1))
    println(iis)
    val iss = iis._2(new SContainer("One"))
    println(iss)
    val isi = iss._3(new ItoSContainer(3))
    println(isi)

}
