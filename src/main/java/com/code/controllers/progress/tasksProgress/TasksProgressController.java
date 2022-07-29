package com.code.controllers.progress.tasksProgress;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TasksProgressController {
    @GetMapping("/tasks_progress")
    public String getTasksProgress(Model model) {
        return "pages/tasks_progress/tasks_progress";
    }
}
