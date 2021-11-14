package kr.ac.smu.cs.soptsocar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kr.ac.smu.cs.soptsocar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewPagerAdapter: MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        initViewPagerAdapter()
        initBottomNavigation()
        setContentView(binding.root)
    }

    private fun initViewPagerAdapter(){
        val fragmentList=listOf(HomeFragment(),CarPlanFragment(),PairingFragment(),MyPageFragment())

        mainViewPagerAdapter= MainViewPagerAdapter(this)
        mainViewPagerAdapter.fragments.addAll(fragmentList)

        binding.vpMain.adapter=mainViewPagerAdapter
    }

    private fun initBottomNavigation(){
        binding.vpMain.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                binding.bnvMain.menu.getItem(position).isChecked=true
            }
        })

        binding.bnvMain.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menu_home ->{
                    binding.vpMain.currentItem=FIRST_FRAGMENT
                    return@setOnItemSelectedListener true
                }
                R.id.menu_carplan->{
                    binding.vpMain.currentItem=SECOND_FRAGMENT
                    return@setOnItemSelectedListener true
                }
                R.id.menu_pairing ->{
                    binding.vpMain.currentItem=THIRD_FRAGMENT
                    return@setOnItemSelectedListener true
                }
                else->{
                    binding.vpMain.currentItem= FOURTH_FRAGMENT
                    return@setOnItemSelectedListener true
                }
            }
        }
    }

    companion object{
        const val FIRST_FRAGMENT=0
        const val SECOND_FRAGMENT=1
        const val THIRD_FRAGMENT=2
        const val FOURTH_FRAGMENT=3

    }
}