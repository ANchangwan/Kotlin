import java.util.*

class calc{
    fun calculate(Mark:String,a:Int,b:Int){
        println("결과 ")
        if(Mark=="+")
        {
            println("a"+"+"+"b"+"="+(a+b))
        }
        if(Mark=="-")
        {
            println("a"+"-"+"b"+"="+(a-b))
        }
        if(Mark=="*")
        {
            println("a"+"*"+"b"+"="+(a*b))
        }
        if(Mark=="/")
        {
            println("a"+"/"+"b"+"="+(a/b))
            if(a%b==0)
                println("나머지 없음")
            else
                println("나머지 : "+(a%b))
        }
    }
}



fun main(args: Array<String>) {
    val s = Scanner(System.`in`)

    var num1:Int=s.nextInt()
    var num2:Int=s.nextInt()
    var mar:String=s.next()
    var res=calc()
    res.calculate(mar,num1,num2)

}