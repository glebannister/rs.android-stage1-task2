package subtask1

import java.text.ParseException
import java.text.SimpleDateFormat
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.Month
import java.util.*

class DateFormatter {


    fun toTextDay(day: String, month: String, year: String): String {
        val dateToValidate = "$day.$month.$year"

        val dateFormat = SimpleDateFormat("dd.MM.yyyy", Locale("ru"))
        dateFormat.isLenient = false
        val date: Date
        try {
            date = dateFormat.parse(dateToValidate)
        } catch (e: ParseException) {
            return "Такого дня не существует"
        }

        return "$day ${selectMonth(month)}, ${SimpleDateFormat("EEEE", Locale("ru")).format(date)}"
    }

    fun selectMonth(month: String) : String {
        return when (month.toInt()){
            1 -> "января"
            2 -> "февраля"
            3 -> "марта"
            4 -> "апреля"
            5 -> "мая"
            6 -> "июня"
            7 -> "июля"
            8 -> "августа"
            9 -> "сентября"
            10 -> "октября"
            11 -> "ноября"
            else -> "декабря"
        }
    }
}
