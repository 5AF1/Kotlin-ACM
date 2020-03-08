package Done

import java.util.Scanner

fun main(){
    val sc=Scanner(System.`in`)
    var n=sc.nextInt()
    while (n!=0){
        n--
        var q=sc.nextInt()
        if (q==2) println("2")
        else println(q%2)
    }
}