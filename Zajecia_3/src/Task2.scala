class ToDoItem(ch:String, da:String){
    var task=ch
    var date=da
   var bool: Boolean= false

  override def toString: String = {
     s"${task} - till ${date} | DONE: ${bool}\n" //. Example \"Clean carpet - till 2020-11-01 | DONE: false"
  }


}
class ToDoList() {
  var dummy: List[ToDoItem] = Nil

  def +(item: ToDoItem): Unit = {
    dummy = dummy :+ item
  }

  def markAsDone(num: Int): Unit = {

    dummy(num).bool = true
  }

  override def toString: String = {

    s"${dummy} " //. Example \"Clean carpet - till 2020-11-01 | DONE: false"
  }
  def del{
    dummy=dummy.filter(!_.bool)
  }
}

object Task2 {
  def main(args: Array[String]) = {
    val toDoList = new ToDoList()

    toDoList + new ToDoItem("Clean carpet", "2020-11-01")
    toDoList + new ToDoItem("Wash dishes", "2020-11-02")
    toDoList + new ToDoItem("Learn Scala and be professional with it", "2020-10-28")

    println(toDoList)

    // Prints list of all three ToDoItems nicely formatted, each in separate line

    toDoList.markAsDone(0)

    println(toDoList)

    // Prints list of two ToDoItems without the first one
  }
}
