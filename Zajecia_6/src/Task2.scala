object Task2 {

  class PolishCashieer (name:String)extends Cashier {
    type kra=pieniedze
    def getPayment(x:kra){}
  }

  class EnglishCashieer  (name:String) extends Cashier{
     type kra = money
    def getPayment(x:kra){}
  }

  abstract class hajs

  abstract class Cashier  {
    type kra<:hajs
    def getPayment(x:kra):Unit
  }

  abstract class money extends hajs {
  }

  abstract class pieniedze extends hajs{

  }

  class Grosz extends pieniedze{
  }

  class Zlotowka extends pieniedze{
  }

  class Penny extends money{}

  class Pound extends money{}

  def main(args: Array[String]): Unit = {


    val g = new Grosz
    val z = new Zlotowka

    val pe = new Penny
    val po = new Pound

    val polishCashieer = new PolishCashieer("Ania")
    val englishCashieer = new EnglishCashieer("John")

    polishCashieer.getPayment(g)
    polishCashieer.getPayment(z)

//     polishCashieer.getPayment(pe) // when uncommented - compilation error
//     polishCashieer.getPayment(po) // when uncommented - compilation error

    englishCashieer.getPayment(pe)
    englishCashieer.getPayment(po)

//     englishCashieer.getPayment(g) // when uncommented - compilation error
//     englishCashieer.getPayment(z) // when uncommented - compilation error

  }
}