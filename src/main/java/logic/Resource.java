package logic;

import javax.xml.bind.annotation.*;
@XmlRootElement(name = "resource")
@XmlAccessorType(XmlAccessType.FIELD)
public class Resource {

        @XmlElement(name="name")
        private String resourceName;

        @XmlElement(name="difficulty")
        private int resourceDifficulty;


        public String getResourceName() {
            return resourceName;
        }

        public void setResourceName(String resourceName) {
            this.resourceName = resourceName;
        }

        public int getResourceDifficulty() {
            return resourceDifficulty;
        }

        public void setResourceDifficulty(int resourceDifficulty) {
            this.resourceDifficulty = resourceDifficulty;
        }


        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Resource{");
            sb.append("name='").append(resourceName).append('\'');
            sb.append(", difficulty=").append(resourceDifficulty);
            sb.append('}');
            return sb.toString();
        }
    }