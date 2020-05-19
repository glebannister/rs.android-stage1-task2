package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {
        var hourStr = ""
        var result: String
        val minuteInt = minute.toInt()
        var hourInt = hour.toInt()
        var minuteStr = ""
        if (minuteInt > 59) return ""
        when {
            minuteInt == 0 -> {
                minuteStr = " o' clock"
            }
            minuteInt == 15 -> {
                minuteStr = "quarter past"
            }
            minuteInt == 45 -> {
                hourInt++
                minuteStr = "quarter to"
            }
            minuteInt < 30 -> {
                minuteStr = "five minutes past"
            }
            minuteInt == 30 -> {
                minuteStr = "half past"
            }
            minuteInt in 31..49 -> {
                hourInt++
                minuteStr = "twenty two minutes to"
            }
            minuteInt in 50..60 -> {
                hourInt++
                minuteStr = "two minutes to "
            }
        }
        when (hourInt) {
            1 -> {
                hourStr = " one"
            }
            2 -> {
                hourStr = " two"
            }
            3 -> {
                hourStr = " tree"
            }
            4 -> {
                hourStr = " four"
            }
            5 -> {
                hourStr = " five"
            }
            6 -> {
                hourStr = " six"
            }
            7 -> {
                hourStr = " seven"
            }
            8 -> {
                hourStr = " eight"
            }
            9 -> {
                hourStr = " nine"
            }
            10 -> {
                hourStr = " ten"
            }
            11 -> {
                hourStr = "eleven"
            }
            12 -> {
                hourStr = " twelve"
            }
        }

        if (minuteInt == 0){
            result = hourStr + minuteStr
        } else {
            result = minuteStr + hourStr
        }
        return result
    }
}
