import java.util.Scanner

fun main() {
    var likes: Int
println("Введите количество лайков:")
    val scan = Scanner(System.`in`)
    likes = scan.nextInt()



    if (likes == 11 || likes % 10 != 1 || likes % 100 == 11) {
        println("Понравилась людям " + likes)
    } else {
        println("Понравилась человеку " + likes)
    }
}