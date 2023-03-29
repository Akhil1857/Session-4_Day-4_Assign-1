import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class CapitalisingTestcase extends AnyFlatSpec with Matchers{
  val objectCapitalising = new ListManipulation
  "ListManipulation" should "Return the same list by Changing 'a' to 'A'" in {

    val statement = List("My", "name", "is", "Michael", "Scott")
    val finalStatement = objectCapitalising.capitalAllCharacterA(statement)
    finalStatement shouldBe (List("My", "nAme", "is", "MichAel", "Scott"))
  }

}
