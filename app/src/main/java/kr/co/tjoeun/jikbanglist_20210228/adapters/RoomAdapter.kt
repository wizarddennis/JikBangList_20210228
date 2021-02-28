package kr.co.tjoeun.jikbanglist_20210228.adapters

import android.content.Context
import android.widget.ArrayAdapter
import kr.co.tjoeun.jikbanglist_20210228.datas.Room

class RoomAdapter(val mContext : Context,
                  val resId : Int,
                  val mList : ArrayList<Room>) : ArrayAdapter<Room> (mContext, resId, mList) {

}

)