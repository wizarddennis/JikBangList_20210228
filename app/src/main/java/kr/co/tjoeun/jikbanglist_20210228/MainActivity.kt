package kr.co.tjoeun.jikbanglist_20210228

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.jikbanglist_20210228.adapters.RoomAdapter
import kr.co.tjoeun.jikbanglist_20210228.datas.Room

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<Room> ()

    lateinit var mAdapter: RoomAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(Room(18000, "서울시 강서구", 3, "종로의 4층 방"))
        mRoomList.add(Room(2600, "인천시 서구", 4, "종로의 4층 방"))
        mRoomList.add(Room(17000, "충청북도 충주시", -1, "종로의 4층 방"))
        mRoomList.add(Room(19000, "강원도 춘천시", 0, "종로의 4층 방"))
        mRoomList.add(Room(4000, "경기도 고양시", 5, "종로의 4층 방"))
        mRoomList.add(Room(7000, "경기도 안양시", -2, "종로의 4층 방"))
        mRoomList.add(Room(2300, "충청남도 논산시", -3, "종로의 4층 방"))
        mRoomList.add(Room(9900, "서울시 강북구", 3, "종로의 4층 방"))
        mRoomList.add(Room(7600, "서울시 관악구", 5, "종로의 4층 방"))

        mAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mAdapter

    }
}