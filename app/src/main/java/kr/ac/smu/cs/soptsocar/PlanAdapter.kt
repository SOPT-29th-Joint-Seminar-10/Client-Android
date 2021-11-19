package kr.ac.smu.cs.soptsocar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kr.ac.smu.cs.soptsocar.databinding.ItemPlanBinding
import kr.ac.smu.cs.soptsocar.databinding.ItemRecommandCarBinding

class PlanAdapter() :
    ListAdapter<PlanData, PlanAdapter.PlanViewHolder>(PlanDiffUtil()) {

    class PlanViewHolder(private val binding: ItemPlanBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(plan: PlanData) {
            binding.txtPlanAdd.text=plan.add
            binding.txtPlanDay.text=plan.day
            binding.txtPlanPlace.text=plan.place
            binding.txtPlanWeek.text=plan.week
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemPlanBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return PlanViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlanViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private class PlanDiffUtil : DiffUtil.ItemCallback<PlanData>() {
        override fun areItemsTheSame(
            oldItem: PlanData,
            newItem: PlanData
        ) =
            (oldItem.place == newItem.place)

        override fun areContentsTheSame(
            oldItem: PlanData,
            newItem: PlanData
        ) =
            (oldItem == newItem)
    }

}