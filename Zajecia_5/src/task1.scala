abstract class SetMc{
  def  price() : Double
  def name() : String
  def ifL():Boolean
  def ifLname(bo:Boolean):String={
   if(bo){
     " large"
   }
    else ""
   }
}
class NormalMcSet extends SetMc{
  override def price = 0
  override def name ="McSet"
  override def ifL: Boolean = false
}
class LargeMcSet extends SetMc{
  override def price = 0
  override def name ="Large McSet"
  override def ifL: Boolean = true
}
trait BigMac extends SetMc{
  abstract override def price = super.price+10.0
  abstract override def name: String = super.name+" with BigMac"
}

trait Fries extends SetMc{
  var costf=5.0
  if(ifL){costf=costf*1.5}
  abstract override def price = super.price+costf
  abstract override def name: String = super.name+ifLname(ifL)+" with Fries"
}

trait McWrap extends SetMc{
  abstract override def price = super.price+9.0

  abstract override def name: String = super.name+" with McWrap"
}

trait Coke extends SetMc{
  var costc=4.0
  if(ifL){costc=costc*1.5}
  abstract override def price = super.price+costc

  abstract override def name: String = super.name+ifLname(ifL)+ " with Coke"
}


object task1 {


  def main(args: Array[String]): Unit = {
    val firstMcSet = new NormalMcSet with BigMac with Fries with Coke
    val firstMcSetLarge = new LargeMcSet with BigMac with Fries with Coke
    val secondMcSet = new LargeMcSet with McWrap with Fries

    println(firstMcSet.name + " " + firstMcSet.price)
    println(firstMcSetLarge.name + " " + firstMcSetLarge.price)
    println(secondMcSet.name + " " + secondMcSet.price)


  }
}
