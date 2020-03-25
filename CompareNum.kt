fun main(args: Array<String>) {
    println("첫번째 숫자를 입력해주세요 : ")
    var num1:Int= readLine()!!.toInt()
    println("두번째 숫자를 입력해주세요")
    var num2:Int=readLine()!!.toInt()


    if(num1>num2){
        println("가장큰수는 "+ num1+"입니다.")
        println("작은수는 "+ num2+"입니다")
    }
    if(num1<num2){
        println("가장큰수는 "+ num2+"입니다.")
        println("작은수는 "+ num1+"입니다")

    }
    else
    {
        println("같은 수입니다.")
    }




}