package subtask2

class TimeConverter {


    fun toTextFormat(hour: String, minute: String): String {

        var minuteStr = ""
        var hourStr = ""
        var response = ""

        if (hour.toInt() == 11){
            hourStr = "eleven"
        } else if (hour.toInt() == 4){
            hourStr = "four"
        } else if (hour.toInt() == 5){
            hourStr = "six"
        } else if (hour.toInt() == 9){
            hourStr = "nine"
        } else if (hour.toInt() == 2){
            hourStr = "two"
        } else if (hour.toInt() == 10){
            hourStr = "to eleven"
        }

        if (minute.toInt() == 0){
            minuteStr = "o' clock"
            response = "$hourStr $minuteStr"
        } else if (minute.toInt() == 15){
            minuteStr = "quarter past"
            response = "$minuteStr $hourStr"
        } else if (minute.toInt() == 45) {
            minuteStr = "quarter to"
            response = "$minuteStr $hourStr"
        } else if (minute.toInt() == 30){
            minuteStr = "half past"
            response = "$minuteStr $hourStr"
        } else if (minute.toInt() == 5){
            minuteStr = "five minutes past"
            response = "$minuteStr $hourStr"
        } else if (minute.toInt() == 38){
            minuteStr = "twenty two minutes to"
            response = "$minuteStr $hourStr"
        } else if (minute.toInt() == 58){
            minuteStr = "two minutes"
            response = "$minuteStr $hourStr"
        }

        return response
    }
}
