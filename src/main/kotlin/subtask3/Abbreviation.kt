package subtask3

class Abbreviation {


    fun abbreviationFromA(a: String, b: String): String {
        val upperCaseA = a.toUpperCase()
        val listB = b.toMutableList()
        val setA = upperCaseA.toMutableList()
        var response = ""

        val innerUpperCase = setA.intersect(listB).toMutableList()
        if (innerUpperCase == listB){
            response = "YES"
        } else response = "NO"
        return response
    }
}
