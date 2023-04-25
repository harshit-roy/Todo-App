package com.example.myapplication.ui.theme
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ToDoAdapter (
    private val todos:MutableList<ToDo>
    ) : RecyclerView.Adapter<ToDoAdapter.TodoViewHolder>()
{
    class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_todo,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val curToDo = todos[position]
        holder.itemView.apply {
            tvTodoTitle.text = curToDo.title
            cbDone.isChecked = curToDo.isChecked
        }
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}