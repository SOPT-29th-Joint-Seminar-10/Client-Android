package kr.ac.smu.cs.soptsocar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kr.ac.smu.cs.soptsocar.databinding.ItemFilterBinding
import kr.ac.smu.cs.soptsocar.databinding.ItemReserveCarListBinding

class FilterCarAdapter : RecyclerView.Adapter<FilterCarAdapter.FilterCarViewHolder>() {

        val filterList = mutableListOf<FilterInfoData>()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilterCarViewHolder {
            val binding = ItemFilterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
            return FilterCarViewHolder(binding)
        }

        override fun onBindViewHolder(holder: FilterCarViewHolder, position: Int) {
            holder.onBind(filterList[position])
        }

        override fun getItemCount(): Int = filterList.size

        class FilterCarViewHolder(private val binding: ItemFilterBinding) :
            RecyclerView.ViewHolder(binding.root) {
            fun onBind(data: FilterInfoData) {
                // 이미지버튼
                Glide.with(binding.root)
                    .load(data.filterImage)
                    .into(binding.imgFilter)

            }

        }

    }

