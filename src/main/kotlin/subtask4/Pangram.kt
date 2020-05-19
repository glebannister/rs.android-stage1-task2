package subtask4

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister
import java.lang.StringBuilder

class Pangram {

    fun getResult(inputString: String): String {
        val arrayVowels = arrayOf('A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y')
        val str = inputString.split(" ").filter { it.isNotEmpty() && it[0] !='\n' }.sortedBy {
            if (isPangram(inputString)) {
                amountOfVowels(it, arrayVowels)
            } else amountOfNotVowels(it, arrayVowels)
        }
        val result = ArrayList<String>()
        if (isPangram(inputString)){
            str.forEach {
                val strBuilder = StringBuilder()
                var counter = 0
                for (i in it){
                    if (arrayVowels.contains(i)){
                        counter++
                        strBuilder.append(i.toUpperCase())
                    } else strBuilder.append(i)
                }
                strBuilder.insert(0, counter.toString())
                result.add(strBuilder.toString())
            }
        } else {
            str.forEach {
                val strBuilder = StringBuilder()
                var counter = 0
                for (c in it) {
                    if (c.isLetter() && !arrayVowels.contains(c)){
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
        val chekPangram = Array(26){false}
        for (i in string.indices){
            if (string[i].isLetter()){
                chekPangram[string[i].toLowerCase() - 'a'] = true
            }
        }
        return !chekPangram.contains(false)
    }

    private fun amountOfNotVowels (string: String, vowels: Array<Char>):Int {
        var counter = 0
        for (i in string.indices){
            if (string[i].isLetter() && !vowels.contains(string[i])){
                counter++
            }
        }
        return counter
    }

    private fun amountOfVowels (string: String, vowels: Array<Char>):Int{
        var counter = 0
        for (i in string.indices){
            if (vowels.contains(string[i])){
                counter++
            }
        }
        return counter
    }
}
