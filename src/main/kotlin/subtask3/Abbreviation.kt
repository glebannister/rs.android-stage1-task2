package subtask3

class Abbreviation {


    fun abbreviationFromA(a: String, b: String): String {
        val upperCaseA = a.toUpperCase()
        val listB = b.toMutableList()
        val listA = upperCaseA.toMutableList()
        var result: String

        val upperCaseInside = listA.intersect(listB).toMutableList()
        if (upperCaseInside == listB){
            result = "YES"
        } else result = "NO"
        return result
    }
}
