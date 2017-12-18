package logic;

import javax.xml.bind.annotation.*;
@XmlRootElement(name = "Resource")
@XmlAccessorType(XmlAccessType.FIELD)
public class Resource {

        @XmlElement(name="Name")
        public String name;

        @XmlElement(name="Tasks")
        public TaskList tasks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskList getTasks() {
        return tasks;
    }

    public void setTasks(TaskList tasks) {
        this.tasks = tasks;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Resource{");
        sb.append("name='").append(name).append('\'');
        sb.append(", tasks=").append(tasks);
        sb.append('}');
        return sb.toString();
    }
}