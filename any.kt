fun main(args: Array<String>) {
    var everybody:Any

    everybody=1111
    everybody="문자열 테스트"
    everybody=221.01010
    everybody=12.00f
    
    //is !(not) 연산자로 데이터 형을 확인해준다
    if(everybody !is String){
        if(everybody is Float){
            println("float입니다.")
        }
    }

    //2. null을 표시하고 싶을때는 any?이렇게 해주면 된다.
    //everybody = null
    
    //3. 값을 비교하기
    println(everybody ==12.00f)
    println(everybody.equals(12.00f))

    //Unit형은 값이 없음을 정의하는 형

    // Nothing형은 미래가 없음을 알리는 형
}
fun
