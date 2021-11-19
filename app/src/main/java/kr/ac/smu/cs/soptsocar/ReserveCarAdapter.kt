package kr.ac.smu.cs.soptsocar

import android.content.ClipData
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kr.ac.smu.cs.soptsocar.databinding.ItemReserveCarListBinding

class ReserveCarAdapter : RecyclerView.Adapter<ReserveCarAdapter.ReserveCarViewHolder>() {

    val carList = mutableListOf<CarInfoData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReserveCarViewHolder {
        val binding = ItemReserveCarListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return ReserveCarViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ReserveCarViewHolder, position: Int) {
        holder.onBind(carList[position])
    }

    override fun getItemCount(): Int = carList.size

    class ReserveCarViewHolder(private val binding: ItemReserveCarListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: CarInfoData) {
           // 사진 불러오기 2개
            Glide.with(binding.root)
                .load(data.car)
                .into(binding.imgCar)
            Glide.with(binding.root)
                .load(data.heart)
                .into(binding.imgHeart)
            binding.txtCarname.text = data.name
            binding.txtPrice.text = data.price
            binding.txtSale.text = data.sale
            binding.txtDate.text = data.date
            binding.txtCity.text = data.city
        }

    }

        }
