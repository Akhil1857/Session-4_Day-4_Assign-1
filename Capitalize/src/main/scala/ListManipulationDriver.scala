object ListManipulationDriver extends App {
  private val objectCapitalising = new ListManipulation
  private val statement = List("My", "name", "is", "Michael", "Scott")
  private val afterManipulation = objectCapitalising.capitalAllCharacterA(statement)
  println(afterManipulation)

}
