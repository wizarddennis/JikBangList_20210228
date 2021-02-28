package kr.co.tjoeun.jikbanglist_20210228

import android.content.Intent
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

        mRoomList.add(Room(18000, "서울시 강서구", 3, "종로의 3층 방"))
        mRoomList.add(Room(2600, "인천시 서구", 4, "연희의 4층 방"))
        mRoomList.add(Room(17000, "충청북도 충주시", -1, "충주의 지하 1층 방"))
        mRoomList.add(Room(19000, "강원도 춘천시", 0, "춘천의 반지하 방"))
        mRoomList.add(Room(4000, "경기도 고양시", 5, "고양의 5층 방"))
        mRoomList.add(Room(7000, "경기도 안양시", -2, "안양의 지하 2층 방"))
        mRoomList.add(Room(2300, "충청남도 논산시", -3, "논산의 지하 3층 방"))
        mRoomList.add(Room(9900, "서울시 강북구", 3, "강북의 3층 방"))
        mRoomList.add(Room(7600, "서울시 관악구", 2, "신림의 2층 방"))

        mAdapter = RoomAdapter(this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mAdapter

        roomListView.setOnItemClickListener { parent, view, position, id ->
            val clickedRoom = mRoomList[position]

            val myIntent = Intent(this, ViewRoomDetailActivity::class.java)

            myIntent.putExtra("roomInfo", clickedRoom)

            startActivity(myIntent)
        }

    }
}