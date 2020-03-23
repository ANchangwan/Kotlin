import java.util.*
fun main(args: Array<String>) {
    //숫자형 DataType 크기 순으로 선언
    var doubleV:Double=110.1111
    var floatV:Float=110.1f
    var longV:Long=110
    var intV : Int =20
    var shortV : Short=30
    var byteV : Byte =10

    println(doubleV)
    println(floatV)
    println(intV)

    doubleV=intV.toDouble()
    // 크기변환 후, 대입: 캐스팅
    // to대입할크기() 형 변환 메소드
    // as로 형변환은 기본형에서는 안된다.


    println(doubleV)

    intV=doubleV.toInt()

    //문자열로 변환
    println(byteV.toString())

    // 문자를 숫자로 변환
    val num="123".toInt()+10
    println(num)

}

