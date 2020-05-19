package subtask5

import sun.util.resources.LocaleData
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<Any>, blockB: KClass<*>): Any {
        var resultClass:Any = ""
        when (blockB) {
            Int::class -> {
                resultClass = ifNumber(blockA)
            }
            String::class -> {
                resultClass = ifString(blockA)
            }
            LocalDate::class -> {
                resultClass = ifDate(blockA)
            }
        }
        return resultClass
    }
    private fun ifNumber(blockA: Array<Any>):Int{
        return blockA.filterIsInstance<Int>().sumBy { it }
    }

    private fun ifString (blockA: Array<Any>):String{
        return blockA.filterIsInstance<String>().joinToString("")
    }

    private fun ifDate (blockA: Array<Any>):String {
        return blockA.filterIsInstance<LocalDate>().max()?.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) ?: ""
    }
}
