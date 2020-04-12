package subtask6

class Fibonacci {


    fun productFibonacciSequenceFor(n: Int): IntArray {

        var firstNumber = 0
        var secondNumber = 1
        var finalArray = arrayListOf<Int>()

        while (firstNumber * secondNumber <n){
            var number = secondNumber
            secondNumber += firstNumber
            firstNumber = number
        }
        if (firstNumber * secondNumber == n){
            finalArray = arrayListOf(firstNumber, secondNumber, 1)
        } else if (firstNumber * secondNumber > n){
            finalArray = arrayListOf(firstNumber, secondNumber, 0)
        }
        return finalArray.toIntArray()
    }
}
