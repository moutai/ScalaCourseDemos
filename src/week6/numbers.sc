package week6

import scala.io.Source

object numbers {

  val in = Source.fromFile("linuxwords")          //> java.io.FileNotFoundException: linuxwords (The system cannot find the file sp
                                                  //| ecified)
                                                  //| 	at java.io.FileInputStream.open(Native Method)
                                                  //| 	at java.io.FileInputStream.<init>(Unknown Source)
                                                  //| 	at scala.io.Source$.fromFile(Source.scala:90)
                                                  //| 	at scala.io.Source$.fromFile(Source.scala:75)
                                                  //| 	at scala.io.Source$.fromFile(Source.scala:53)
                                                  //| 	at week6.numbers$$anonfun$main$1.apply$mcV$sp(week6.numbers.scala:7)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week6.numbers$.main(week6.numbers.scala:5)
                                                  //| 	at week6.numbers.main(week6.numbers.scala)

  /* create a list and filter all words where *all* their characters are not letters (like dashes) */
  val words = in.getLines.toList//
  

  /* define the map of numbers to letters */
  val mnem = Map('2' -> "ABC",
    '3' -> "DEF", '4' -> "GHI",
    '5' -> "JKL", '6' -> "MNO",
    '7' -> "PQRS", '8' -> "TUV",
    '9' -> "WXYZ")

  val charCode: Map[Char, Char] =
    for ((digit, str) <- mnem; ltr <- str) yield ltr -> digit

  def wordCode(word: String): String =
    word.toUpperCase map charCode

  wordCode("java")
  
  //val wordsForNum: Map [String, Seq[String]]=
  	//words groupby workCode
}