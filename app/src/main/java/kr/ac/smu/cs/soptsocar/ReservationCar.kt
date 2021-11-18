package kr.ac.smu.cs.soptsocar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.smu.cs.soptsocar.databinding.ActivityReservationCarBinding

class ReservationCar : AppCompatActivity() {

    private lateinit var binding: ActivityReservationCarBinding
    lateinit var reserveCarAdapter: ReserveCarAdapter

    val data = mutableListOf<CarInfoData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityReservationCarBinding.inflate(layoutInflater)

        setContentView(binding.root)
        initAdapter()

    }



private fun initAdapter(){

    reserveCarAdapter= ReserveCarAdapter()
    binding.rvCar.adapter=reserveCarAdapter
    val img1 = R.drawable.img_tosan
    val img11 = R.drawable.ic_default_heart_ios


    reserveCarAdapter.carList.addAll(
        listOf(
            CarInfoData(img1,img11,"투싼(경유)","월 503,000원~","26%","2016~2017", "서울/경기/인천"),
            CarInfoData(img1,img11,"투싼(경유)","월 503,000원~","26%","2016~2017", "서울/경기/인천"),
            CarInfoData(img1,img11,"투싼(경유)","월 503,000원~","26%","2016~2017", "서울/경기/인천"),
            CarInfoData(img1,img11,"투싼(경유)","월 503,000원~","26%","2016~2017", "서울/경기/인천"),
            CarInfoData(img1,img11,"투싼(경유)","월 503,000원~","26%","2016~2017", "서울/경기/인천"),
            CarInfoData(img1,img11,"투싼(경유)","월 503,000원~","26%","2016~2017", "서울/경기/인천"),
            CarInfoData(img1,img11,"투싼(경유)","월 503,000원~","26%","2016~2017", "서울/경기/인천"),
            CarInfoData(img1,img11,"투싼(경유)","월 503,000원~","26%","2016~2017", "서울/경기/인천"),
            CarInfoData(img1,img11,"투싼(경유)","월 503,000원~","26%","2016~2017", "서울/경기/인천"),
            CarInfoData(img1,img11,"투싼(경유)","월 503,000원~","26%","2016~2017", "서울/경기/인천"),
            CarInfoData(img1,img11,"투싼(경유)","월 503,000원~","26%","2016~2017", "서울/경기/인천")
        )
    )
    reserveCarAdapter.notifyDataSetChanged()
}

}