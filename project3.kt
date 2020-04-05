import java.util.*


fun swap(room:Array<Int>, ordinary: Int, change: Int) {
    var temp = room[ordinary]
    room[ordinary] = room[change]
    room[change] = temp
}



fun main(args: Array<String>) {
    val s = Scanner(System.`in`)
    var n:Int = s.nextInt()


    println("숫자를 입력하세요 : ")
    val room = Array(n) { s.nextInt() }
    for(i in 0 until room.size){

        var min=i
        for(j in i+1 until room.size){
            if(room[min]>room[j]){
                min=j
            }
        }
        swap(room,i,min)

    }

    println(room.toList())

    println("1501023 안창완")




}