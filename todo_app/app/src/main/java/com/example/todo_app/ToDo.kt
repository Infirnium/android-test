package com.example.todo_app

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int ,
    var title: String ,
    var createdAt : Date
)

@RequiresApi(Build.VERSION_CODES.O)
fun getFakeToDo() : List<Todo> {
    return listOf<Todo>(
        Todo(1, "First ToDo", Date.from(Instant.now())),
        Todo(2, "Second ToDo", Date.from(Instant.now())),
        Todo(3, "Third ToDo", Date.from(Instant.now())),
    );
}

