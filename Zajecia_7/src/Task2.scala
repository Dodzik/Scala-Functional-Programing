object Task2 extends App {


  //Use higher order functions from Scala's containers to get following results.

  // ("subjectName", degreeNumber, semesterNumber, ects, hasExam)

  // degreeNumber -> 1 = bachalor, 2 = masters

  val subjects = List(

    ("Matematyka dyskretna", 1, 1, 4, false),

    ("Algorytmy i struktury danych", 1, 2, 6, true),

    ("Teoria obwodów i sygnałów", 1, 3, 3, false),

    ("Układy elektroniczne", 1, 4, 5, true),

    ("Bazy danych 1", 1, 5, 5, false),

    ("Inżynieria oprogramowania", 1, 6, 5, true),

    ("Komputeryzacja pomiarów", 1, 7, 3, false),

    ("Modelowanie procesrów fizycznych", 2, 1, 5, true),

    ("Techniki mikroprocesorowe", 2, 2, 5, false),

    ("Programowanie zespołowe", 2, 3, 5, false)

  )

  println("list of subjects for bachalor degree:")
  val bachalor = subjects.filter(_._2==1)
  println(bachalor)
  println()
  println("list of subjects for master degree:")
  val master = subjects.filter(_._2==2)
  println(master)
  println()
  println("list of subjects with exams and ECTS > 5")
  val ex5 = subjects.filter(_._4>5).filter(_._5==true)

  println(ex5)
  println()
  println("list of subjects just with (name, ects)")

    subjects.foreach(a => println("( "+a._1+", "+a._4+" )"))
  println()
  println()
  println("list of subjects, where key is number of ECTS and value is list of subjects for that ECTS count (grouped by ECTS)")

  val groups= subjects.groupBy(subjects => subjects._4)
  println(groups)
  println()

  println( "number of ECTS points of all bachalors subjects")
  println(bachalor.map(_._4).sum)
  println()

  println("number of ECTS points of all masters subjects, which doesn't have exam")
  val master_nex = master.filter(_._5==false)
  println(master_nex.map(_._4).sum)
//reduce
  println()

  println(" sorted list of subjects (by name) for bachalors degree")
  val sor_bach=bachalor.sortBy(x=>x._1)
  println(sor_bach)
  println()
}
