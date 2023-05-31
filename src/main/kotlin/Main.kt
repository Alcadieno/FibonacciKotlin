import java.util.Scanner

object Fibonacci {
    @JvmStatic
    fun main(args: Array<String>) {
        val num = Scanner(System.`in`) // instanciar objeto num
        println("Digite a quantidade de numeros da sequencia:")
        val number = num.nextInt()
        println("Fibonacci sequencia para $number numeros eh")

        // Mostrar a sequencia de Fibonacci number vezes
        for (i in 1..number) {
            print("${fibonacci(i)} ")
        }
    }

    fun fibonacci(number: Int): Int {
        // caso inicial, comum a qualquer valor para num desde que num diferente de 1
        return if (number == 1 || number == 2) {
            1
        } else {
            fibonacci(number - 1) + fibonacci(number - 2) // tail recursion
        }
    }
}
