package logic;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbResourceParser {
    public ResourceList parseList(String fileName) {
        try {
            File file = new File(fileName);
            JAXBContext jaxbContext = JAXBContext.newInstance(ResourceList.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ResourceList parsedResourceList = (ResourceList)jaxbUnmarshaller.unmarshal(file);

            return  parsedResourceList;

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;

    }

}
