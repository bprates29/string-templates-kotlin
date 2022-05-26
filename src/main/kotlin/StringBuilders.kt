
fun nomeDoCara(): String {
    println("O cara é bom...")
    return "o cara"
}

fun main() {
    var minhaString = "E aí, qual vai ser?"
    //minhaString[2] = 'A' //erro
    println("minhaString  = $minhaString") //Print: minhaString  = E aí, qual vai ser?
    minhaString = "Ou eu ou a cachaça"
    println("minhaString  = $minhaString") //Print: minhaString  = Ou eu ou a cachaça

    var meuNumero = 5
    val myString = "meuNumero = $meuNumero"
    println(myString)
    //Print: meuNumero = 5
    val a = 10
    val b = 20
    println("O maior número é: ${if (a > b) a else b}")
    //Print: O maior número é: 20

    println("Ele é ${nomeDoCara()} e conhece ${nomeDoCara()}")

    val s1  = "E aí?"
    val s2 = "Qual vai ser?"
    var result: String
    println("Tamanho da s1 é ${s1.length}.")
    //Print: Tamanho da s1 é 5.
    result = if (s1.compareTo(s2) == 0) "iguais" else "diferentes"
    println("Strings s1 e s2 são $result.")
    //Print: Strings s1 e s2 são diferentes.
    println("O terceiro caractere é ${s1.get(2)}.")
    //Print: O terceiro caractere é a.
    result = s1.plus(" Quem será?") // result = s1 + " How are you?"
    println("result = $result")
    //Print: result = E aí? Quem será?
    println("UpperCase: ${s1.uppercase()}")
    //Print: E AÍ?


    val test = "Hello, World!"
    println(with(test) { padEnd(20,'*') })
    println(test.padStart(20,'*'))


}