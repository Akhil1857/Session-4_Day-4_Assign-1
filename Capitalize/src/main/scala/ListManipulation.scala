import scala.util.{Failure, Success, Try}

class ListManipulation {
  
  //This capitalAllCharacterA Function convert all 'a' to 'A'
  def capitalAllCharacterA(statement: List[String]): List[String] = {
    statement.map { string =>
      Try {
        string.map { character =>
          if (character == 'a') character.toUpper
          else character
        }
      }
      match {
        case Success(value) => value
        case Failure(exception) => throw new NoSuchElementException()
          string
      }
    }
  }
}
