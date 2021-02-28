package kr.co.tjoeun.jikbanglist_20210228.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.tjoeun.jikbanglist_20210228.R
import kr.co.tjoeun.jikbanglist_20210228.datas.Room

class RoomAdapter(val mContext : Context,
                  val resId : Int,
                  val mList : ArrayList<Room>) : ArrayAdapter<Room> (mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        // 재활용할 뷰가 있나요???
        if(tempRow == null) {
            tempRow = inf.inflate(R.layout.room_list_item, null)
        }

        // 진짜로 한칸을 그려주자. 절대 null이 아니라는 표시로 '!!' 를 단다.
        val row = tempRow!!

        return row
    }

}

)