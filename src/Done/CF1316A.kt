package Done

import java.util.Scanner

fun main(){
    val sc=Scanner(System.`in`)
    val t=sc.nextInt()
    for (i in 0 until t){
        var n=sc.nextInt()
        var m=sc.nextInt()
        var s=0
        for(j in 0 until n){
            var temp=sc.nextInt()
            s+=temp
        }
        var ans= minOf(m,s)
        println(ans)
    }
}