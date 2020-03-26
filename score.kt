fun main(args: Array<String>) {



    println("이름을 입력하세요")
    var name:String= readLine()!!
    println("성적을 입력하세요")
    var score:Int= readLine()!!.toInt()


    if(score>=90){
        println("성적 : A")
    }
    if(score<90&&score>=80){
        println("성적 : B")
    }
    if(score<80&&score>=70){
        println("성적 : C")
    }
    if(score<70&&score>=60){
        println("성적 : D")
    }
    else if(score<60){
        println("성적 : F")
    }
}
