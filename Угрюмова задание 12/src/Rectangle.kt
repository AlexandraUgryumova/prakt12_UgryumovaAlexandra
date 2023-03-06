import kotlinx.coroutines.*
public class Rectangle() {
    var weight: Double = 1.0
    var height: Double = 1.0
    public fun Input(){
        while(true) {
            println("введите высоту равнобедренного треугольника")
            weight = readLine()!!.toDouble()
            if(weight>0) break
        }
        while(true){
            println("введите основание равнобедренного треугольника")
            height = readLine()!!.toDouble()
            if(height>0) break
        }
    }
    public fun S(): Double{
        return 0.5*weight*height
    }
    public fun P(): Double{
        val c: Double = Math.sqrt(Math.pow((height/2),2.0)+Math.pow(weight, 2.0))
        return c+c+height
    }
}