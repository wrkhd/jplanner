package task;

import java.time.LocalDate;
import java.util.ArrayList;

/***
 * task entity
 */
public class Task {

    private final LocalDate creationDate = LocalDate.now();
    private LocalDate dueDate = LocalDate.now().plusDays(1);
    private TaskType taskType = TaskType.GENERAL;
    private TaskPriority taskPriority = TaskPriority.NON_PRIMARY;
    private ArrayList<String> taskData;
    private int taskId;

    public Task(ArrayList<String> taskData) {
        this.taskData = taskData;
    }

    public Task(ArrayList<String> taskData, LocalDate dueDate) {
        this.taskData = taskData;
        this.dueDate = dueDate;
        this.taskId = this.hashCode();
    }

    public Task(ArrayList<String> taskData, LocalDate dueDate, TaskType taskType) {
        this.taskData = taskData;
        this.dueDate = dueDate;
        this.taskType = taskType;
        this.taskId = this.hashCode();
    }

    public Task(ArrayList<String> taskData, LocalDate dueDate, TaskType taskType, TaskPriority taskPriority) {
        this.taskData = taskData;
        this.dueDate = dueDate;
        this.taskType = taskType;
        this.taskPriority = taskPriority;
        this.taskId = this.hashCode();
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public TaskPriority getTaskPriority() {
        return taskPriority;
    }

    public void setTaskPriority(TaskPriority taskPriority) {
        this.taskPriority = taskPriority;
    }

    public ArrayList<String> getTaskData() {
        return taskData;
    }

    public void setTaskData(ArrayList<String> taskData) {
        this.taskData = taskData;
    }

    public enum TaskPriority {
        PRIMARY,
        NON_PRIMARY;
    }

    public enum TaskType {
        GENERAL,
        UNIVERSITY_ASSIGNMENT,
        WORK_ASSIGNMENT,
        FAMILY;
    }

}
