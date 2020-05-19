package subtask6

class Fibonacci {


    fun productFibonacciSequenceFor(n: Int): IntArray {
        var firstNumber = 0
        var secondNumber = 1
        var resultArray = arrayListOf<Int>()

        while (firstNumber * secondNumber <n){
            val bufferNumber = secondNumber
            secondNumber += firstNumber
            firstNumber = bufferNumber
        }
        if (firstNumber * secondNumber == n){
            resultArray = arrayListOf(firstNumber, secondNumber, 1)
        } else if (firstNumber * secondNumber > n){
            resultArray = arrayListOf(firstNumber, secondNumber, 0)
        }
        return resultArray.toIntArray()
    }
}
