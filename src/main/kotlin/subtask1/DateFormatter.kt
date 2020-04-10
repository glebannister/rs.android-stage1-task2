package subtask1

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.Month

class DateFormatter {


    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            var currentMonth = StringBuilder(month)
            if (currentMonth.length == 1){
                currentMonth = java.lang.StringBuilder("0$currentMonth")
            }
            getCurrentDate(LocalDate.parse("$year-$currentMonth-$day"))
        } catch (e: Exception){
            "Такого дня не существует"
        }
    }

    private fun getCurrentMonth(month: Month): String {
        return when (month){
            Month.JANUARY -> "января"
            Month.FEBRUARY -> "февраля"
            Month.MARCH -> "марта"
            Month.APRIL -> "апреля"
            Month.MAY -> "мая"
            Month.JUNE -> "июня"
            Month.JULY -> "июля"
            Month.AUGUST -> "августа"
            Month.SEPTEMBER -> "сентября"
            Month.OCTOBER -> "октября"
            Month.NOVEMBER -> "ноября"
            Month.DECEMBER -> "декабря"
        }
    }

    private fun getCurrentDate (currentDate: LocalDate): String {
        return when (currentDate.dayOfWeek) {
            DayOfWeek.MONDAY -> "${currentDate.dayOfMonth} ${getCurrentMonth(currentDate.month)}, понедельник"
            DayOfWeek.TUESDAY -> "${currentDate.dayOfMonth} ${getCurrentMonth(currentDate.month)}, вторник"
            DayOfWeek.WEDNESDAY -> "${currentDate.dayOfMonth} ${getCurrentMonth(currentDate.month)}, среда"
            DayOfWeek.THURSDAY -> "${currentDate.dayOfMonth} ${getCurrentMonth(currentDate.month)}, четверг"
            DayOfWeek.FRIDAY -> "${currentDate.dayOfMonth} ${getCurrentMonth(currentDate.month)}, пятница"
            DayOfWeek.SATURDAY -> "${currentDate.dayOfMonth} ${getCurrentMonth(currentDate.month)}, суббота"
            DayOfWeek.SUNDAY -> "${currentDate.dayOfMonth} ${getCurrentMonth(currentDate.month)}, воскресенье"
        }
    }
}
