package com.scaler.todoprojectwithspringboot.task;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private List<Task> taskList = new ArrayList<>();
    private int taskId = 1;

    @GetMapping("")
    List<Task> getAllTask() {
        return taskList;
    }

    @PostMapping("")
    Task createTask(@RequestBody Task task) {
        task.setId(taskId++);
        taskList.add(task);
        return task;
    }

    @GetMapping("/{id}")
    Task getTaskById(@PathVariable("id") Integer id) {
        Task foundTask = taskList.stream().filter(
                task -> task.getId().equals(id)
        ).findFirst().orElse(null);
        return foundTask;
    }
}
