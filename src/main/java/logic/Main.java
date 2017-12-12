package logic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ResourceParser resourceParser = new ResourceParser();
//        List<Resource> resource = resourceParser.parse("resources.xml");
////        resourceParser.parse("resources.xml");
//        System.out.println();
//    }
//}
//        ResourceJaxbParser resourceJaxbParser = new ResourceJaxbParser();
//        Resource parsedResource = resourceJaxbParser.parse("resourceListForJaxb.xml");
//        System.out.println(parsedResource);
//

//        ResourceJaxbParser resourceJaxbParser = new ResourceJaxbParser();
//

        JaxbResourceParser resourceJaxbParser = new JaxbResourceParser();
        ResourceList parsedResourceList = resourceJaxbParser.parseList("resourcesListForJaxb.xml");

        List<Resource> resources = parsedResourceList.getResourceList();
        if (resources != null) {
            for (Resource resource : resources) {
                System.out.println(resource);
            }
        } else {
            System.out.println("no resources in list");
        }

//
//        Resource resource = new Resource();
//        resource.setResourceName("ResourceName");
//        resource.setResourceDifficulty(29);
    }
}