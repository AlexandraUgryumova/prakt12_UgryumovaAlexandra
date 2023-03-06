import kotlinx.coroutines.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay

suspend fun main(){
    var n: Int
    while(true){
        println("введите количество функций")
        n = readLine()!!.toInt()
        if(n>0) break
    }
    var rec: Rectangle = Rectangle()
    for(i in 1..n){
    val job = GlobalScope.launch{

            rec.Input()
            println("S: ${rec.S()}")
            println("P: ${rec.P()}")
            delay(1000L)
        }
        println("$i треугольник")
        job.join()
    }
}

