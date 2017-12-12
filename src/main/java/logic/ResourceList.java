package logic;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name="resources")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResourceList {

    @XmlElement(name="resource")
    private List<Resource> resourceList;

    public List<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<Resource> customerList) {
        this.resourceList = resourceList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResourceList{");
        sb.append("resources=").append(resourceList);
        sb.append('}');
        return sb.toString();
    }
}
