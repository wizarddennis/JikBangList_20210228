package kr.co.tjoeun.jikbanglist_20210228.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

class Room (
    val price: Int,
    val address : String,
    val floor : Int,
    val description : String) : Serializable {

    // 가격 값에 따라 => 억단위 표시 여부 가공 기능. -> 함수로.."5억 4,500" String
    fun getFormattedPrice() : String {
        if(this.price < 10000) {
            // 8,500 등 컴마처리
            return NumberFormat.getNumberInstance(Locale.US).format(this.price)
        }
        else {
            // 1억 이상, 7억 4,500등.  억단위 + 컴마처리 둘다.
            // 억? 몇억인지. => 가격을 10000으로 나눈 몫임.
            val uk = this.price / 10000

            // 억 밑은 얼마인지 => 컴마처리
            val rest = this.price % 10000

            // rest => 컴파처리
            val commaRest = NumberFormat.getNumberInstance(Locale.US).format(rest)

            //최종결과 : ?억 ?,??? 으로 가공
            return "${uk}억 ${commaRest}"
        }
    }

    // 층수 값에 따라 => 5층, 반지하, 지하 2층 등으로 가공해주는 기능. => 함수(function)
    fun getFormattedFloor() : String {

        if (this.floor >= 1) {
            //1층, 5층 등등..=> floor층
            return "${this.floor}층"
        }
        else if (this.floor == 0) {
            //0층 : 반지하
            return "반지하"
        }
        else {
            // -1cmd, -2층.....this 앞에 '-' 를 붙여서, '-' 기호가 안나오게 하라...
            // - 더하기 - 는 플러스이므로
            return "지하 ${-this.floor}층"
        }
    }
}