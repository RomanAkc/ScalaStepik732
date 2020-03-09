import scala.io.StdIn

object FacedString {
  def apply(input: String) = s"*_*$input*_*"

  def unapply(arg: String): Option[String] = {
    if(arg.startsWith("*_*") && arg.endsWith("*_*"))
      Some(arg.slice(3, arg.length - 3))
    else
      None
  }
}

object Main {
  def main(args: Array[String]) {
    val s = scala.io.StdIn.readLine()
    println(s match {
      case FacedString(input) => input
      case _ => "Could not recognize string"
    })
  }
}
