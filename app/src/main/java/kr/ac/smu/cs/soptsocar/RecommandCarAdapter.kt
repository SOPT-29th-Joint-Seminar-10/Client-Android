package kr.ac.smu.cs.soptsocar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import kr.ac.smu.cs.soptsocar.databinding.ItemRecommandCarBinding
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import kr.ac.smu.cs.soptsocar.databinding.ItemReserveCarListBinding

class RecommandCarAdapter() :
    ListAdapter<CarData, RecommandCarAdapter.RecommandCarViewHolder>(RecommandCarDiffUtil()) {

    class RecommandCarViewHolder(private val binding: ItemRecommandCarBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(car: CarData) {
            Glide.with(binding.root)
                .load(car.image)
                .into(binding.imgRecCar)
            binding.txtRecDiscount.text=car.discount.toString()+"%"
            binding.txtRecName.text=car.name
            binding.txtRecPrice.text=car.price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecommandCarViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemRecommandCarBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return RecommandCarViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecommandCarViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private class RecommandCarDiffUtil : DiffUtil.ItemCallback<CarData>() {
        override fun areItemsTheSame(
            oldItem: CarData,
            newItem: CarData
        ) =
            (oldItem.name == newItem.name)

        override fun areContentsTheSame(
            oldItem: CarData,
            newItem: CarData
        ) =
            (oldItem == newItem)
    }

}