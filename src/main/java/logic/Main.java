package logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.setProperty("javax.xml.bind.JAXBContextFactory", "org.eclipse.persistence.jaxb.JAXBContextFactory");
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
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите название ресурса");
            String resource1 = br.readLine();
            if (resource1.equals()){
                System.out.println(123);
            }



        } catch (IOException e){
                e.printStackTrace();
        }
    }
}