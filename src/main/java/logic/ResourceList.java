package logic;

import javax.xml.bind.annotation.*;
import java.util.List;
@XmlRootElement(name="Resources")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResourceList {

    @XmlElement(name="Resource")
    public List<Resource> resourceList;

    public List<Resource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<Resource> resourceList) {
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
