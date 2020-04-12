package subtask4

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister
import java.lang.StringBuilder

class Pangram {

    fun getResult(inputString: String): String {
        val arrayA = arrayOf('A', 'E', 'I', 'O', "Y", 'a', 'e', 'i', 'o', 'u', 'y')
        val str = inputString.split(" ").filter { it.isNotEmpty() && it[0] !='\n' }.sortedBy {
            if (isPangram(inputString)) {
                amountOfVowels(it, arrayA)
            } else notVowels(it, arrayA)
        }
        val result = ArrayList<String>()
        if (isPangram(inputString)){
            str.forEach {
                val strBuilder = StringBuilder()
                var counter = 0
                for (c in it){
                    if (arrayA.contains(c)){
                        counter++
                        strBuilder.append(c.toUpperCase())
                    } else strBuilder.append(c)
                }
                strBuilder.insert(0, counter.toString())
                result.add(strBuilder.toString())
            }
        } else {
            str.forEach {
                val strBuilder = StringBuilder()
                var counter = 0
                for (c in it) {
                    if (c.isLetter() && !arrayA.contains(c)){
                        counter++
                        strBuilder.append(c.toUpperCase())
                    } else strBuilder.append(c)
                }
                strBuilder.insert(0, counter.toString())
                result.add(strBuilder.toString())
            }
        }
        return result.joinToString(" ")
    }

  private fun isPangram(string: String):Boolean{
      val chek = Array(26){false}
      for (i in string.indices){
          if (string[i].isLetter()){
              chek[string[i].toLowerCase() - 'a'] = true
          }
      }
      return !chek.contains(false)
  }

    private fun notVowels (string: String, vowels: Array<*>):Int {
        var counter = 0
        for (i in string.indices){
            if (string[i].isLetter() && !vowels.contains(string[i])){
                counter++
            }
        }
        return counter
    }

    private fun amountOfVowels (string: String, vowels: Array<*>):Int{
        var counter = 0
        for (i in string.indices){
            if (vowels.contains(string[i])){
                counter++
            }
        }
        return counter
    }
}
