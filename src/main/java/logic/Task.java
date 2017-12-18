package logic;

import javax.xml.bind.annotation.*;

@XmlRootElement(name="Task")
@XmlAccessorType(XmlAccessType.FIELD)
public class Task {
    @XmlElement(name="TaskName")
    public String taskName;

    @XmlElement(name="Complete")
    public boolean complete;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Task{");
        sb.append("taskName='").append(taskName).append('\'');
        sb.append(", complete=").append(complete);
        sb.append('}');
        return sb.toString();
    }
}
