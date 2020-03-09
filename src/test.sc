object FacedString {
  def apply(input: String) = s"*_*$input*_*"

  def unapply(arg: String): Option[String] = {
    if(arg.startsWith("*_*") && arg.endsWith("*_*"))
      Some(arg.slice(3, arg.length - 3))
    else
      None
  }
}

val s1: String = "*_*test*_*"
val s2: String = "*_*test"
val s3: String = "*_****text*_**_*"
val s4: String = "*_****te*xt*_**_*"


println(s4 match {
  case FacedString(input) => input
  case _ => "Could not recognize string"
})

