package kr.ac.smu.cs.soptsocar

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kr.ac.smu.cs.soptsocar.databinding.FragmentCarPlanBinding


class CarPlanFragment : Fragment() {
    private var _binding : FragmentCarPlanBinding? = null
    private val binding get()=_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentCarPlanBinding.inflate(layoutInflater, container, false)
        val recommandCarAdapter=RecommandCarAdapter()
        setRecommandCarAdapter(recommandCarAdapter)
        val planAdapter=PlanAdapter()
        setPlanAdapter(planAdapter)
        clickListener()
        return binding.root
    }

    private fun setRecommandCarAdapter(recommandAdapter: RecommandCarAdapter) {
        val test=listOf(CarData("더뉴아반떼","연 550,0000원",R.drawable.img_thenewavante,10)
            ,CarData("투싼(휘발유)","연 403,0000원",R.drawable.img_tosan,10)
            ,CarData("투싼(경유)","연 400,0000원",R.drawable.img_tosan,20)
        )
        binding.rcvCarPlan.apply {
            layoutManager=LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL,false)
            adapter = recommandAdapter
        }
        recommandAdapter.submitList(test)

    }

    private fun setPlanAdapter(planAdapter: PlanAdapter) {
        val test=listOf(PlanData("03","wed","신림현대아파트 주차장","서울특별시 관악구 신림로 29길 8")
            ,PlanData("05","fri","신림 포도몰 주차장","서울특별시 관악구 신림로 330")
            ,PlanData("09","tue","새물결 노상공영주차장","서울특별시 마포구 동교동 192-6")
            ,PlanData("11","thu","신라스테이 삼성","서울특별시 강남구 영동대로 506")
        )
        binding.rcvPlan.apply {
            layoutManager=LinearLayoutManager(requireContext(), RecyclerView.VERTICAL,false)
            adapter =planAdapter
        }
        planAdapter.submitList(test)

    }

    private fun clickListener(){
        binding.edtPlanStart.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                Log.d("test","b")
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("test","a")
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                if(binding.edtPlanStart.length()!=0&&binding.edtPlanEnd.length()!=0){
                    binding.btnPlan.isClickable=true
                    binding.btnPlan.setTextColor(Color.parseColor("#009BEF"))
                }else{
                    binding.btnPlan.isClickable=false
                    binding.btnPlan.setTextColor(Color.parseColor("#000000"))
                }
            }
        })

        binding.edtPlanEnd.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(p0: Editable?) {
                Log.d("test","b")
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("test","a")
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                if(binding.edtPlanStart.length()!=0&&binding.edtPlanEnd.length()!=0){
                    binding.btnPlan.isClickable=true
                    binding.btnPlan.setTextColor(Color.parseColor("#009BEF"))
                }else{
                    binding.btnPlan.isClickable=false
                    binding.btnPlan.setTextColor(Color.parseColor("#000000"))
                }
            }
        })

        binding.btnPlan.setOnClickListener {
            val intent=Intent(context,ReservationCar::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroyView(){
        super.onDestroyView()
        _binding=null
    }

}