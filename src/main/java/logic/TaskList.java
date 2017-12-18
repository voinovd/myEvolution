package logic;

import javax.xml.bind.annotation.*;
import java.util.List;
@XmlRootElement(name="Tasks")
@XmlAccessorType(XmlAccessType.FIELD)
public class TaskList {

    @XmlElement(name="Task")
    public List<Task> tasks;

    public List<Task> getTaskList() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TaskList{");
        sb.append("tasks=").append(tasks);
        sb.append('}');
        return sb.toString();
    }
}

