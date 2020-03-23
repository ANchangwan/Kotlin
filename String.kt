import java.util.*
/*
1. 더하기(+) 연산자를 사용하여 붙이기
2.""" """를 이용한 줄넘김 문자처리
3. 변수 or 변수를 이용한 문자열 내의 변수값 치환
4.${코딩} 이용한 문자열 내의 결과값 치환
 */
fun main(args: Array<String>) {

    var sName="안도현"
    // 1. 문자열을 추가하는 것은 + 연산자로 가능함 <- Java와 동일
    println(sName+"- The Gamer")

    // 2."""이 안에 줄넘김 문자열이 들어갈 수 있다. """
    //Python에 기능이 있다.

    var sLines = """
    1
    2
    3
    4
    5
    6
    7
    8
    9
        """
    println(sLines)
    // 3. 문자열 내의 포멧팅 방법
    // linux의 bash와 비슷함함
    va sFormatter="$sName<--sName의 값"
    println(sFormatter)
    //4. linux bash와 비슷하니
    // ${}안에
    // 함수호출이나 수식처리도 가능함
    var sBash="${"지금시각은 -"+Date()}"
    // class도 가져올 수 있음.
    println(sBash)
}