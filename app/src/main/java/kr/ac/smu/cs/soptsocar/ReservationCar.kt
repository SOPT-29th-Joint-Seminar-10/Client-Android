package kr.ac.smu.cs.soptsocar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.smu.cs.soptsocar.databinding.ActivityReservationCarBinding

class ReservationCar : AppCompatActivity() {

    private lateinit var binding: ActivityReservationCarBinding
    lateinit var reserveCarAdapter: ReserveCarAdapter
    lateinit var filterCarAdapter: FilterCarAdapter

    val data = mutableListOf<CarInfoData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityReservationCarBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initAdapter()

        //뒤로 가기 버튼 전 화면으로 이동
        binding.back.setOnClickListener {
            finish()
        }
    }



private fun initAdapter(){

    reserveCarAdapter= ReserveCarAdapter()
    filterCarAdapter = FilterCarAdapter()

    binding.rvCar.adapter=reserveCarAdapter
    binding.rvFilter.adapter=filterCarAdapter

    val img1 = R.drawable.img_tosan
    val img11 = R.drawable.ic_default_heart_ios


    filterCarAdapter.filterList.addAll(
        listOf(
            FilterInfoData(R.drawable.ic_filter),
            FilterInfoData(R.drawable.ic_rentalperiod),
            FilterInfoData(R.drawable.ic_filterprice),
            FilterInfoData(R.drawable.ic_model),
            FilterInfoData(R.drawable.ic_popularity),
            FilterInfoData(R.drawable.ic_region)

        )
    )
    filterCarAdapter.notifyDataSetChanged()

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