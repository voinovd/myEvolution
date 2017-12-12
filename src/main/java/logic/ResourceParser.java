package logic;
//
//import org.w3c.dom.Document;
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;
//import org.xml.sax.SAXException;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
public class ResourceParser {
//
//    public List<Resource> parse(String fileName) {
//        List<Resource> resourceList = new ArrayList<Resource>();
//        try {
//            // Создается построитель документа
//            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//            // Создается дерево DOM документа из файла
//            Document document = documentBuilder.parse(fileName);
//
//            // Получаем корневой элемент
//            Node root = document.getDocumentElement();
//
//            System.out.println("List of resources:");
//            System.out.println();
//            // Просматриваем все подэлементы корневого - т.е. книги
//            NodeList resources = root.getChildNodes();
//            for (int i = 0; i < resources.getLength(); i++) {
//                Node book = resources.item(i);
//                // Если нода не текст, то это книга - заходим внутрь
//                if (book.getNodeType() != Node.TEXT_NODE) {
//                    Resource resource = new Resource();
//                    NodeList resourceProps = book.getChildNodes();
//                    for(int j = 0; j < resourceProps.getLength(); j++) {
//                        Node resourceProp = resourceProps.item(j);
//                        // Если нода не текст, то это один из параметров книги - печатаем
//                        if (resourceProp.getNodeType() != Node.TEXT_NODE) {
//                            String tageName = resourceProp.getNodeName();
//                            String tageValue = resourceProp.getChildNodes().item(0).getTextContent();
//                            resourceList.add(resource);
//                            if ("Name".equals(tageName)){
//                                resource.setName(tageValue);
//                            }
//                            if ("Difficulty".equals(tageName)){
//                                resource.setDifficulty(Integer.parseInt(tageValue));
//                            }
//                        }
//
//                    }
//                    System.out.println("===========>>>>");
//                }
//            }
//
//        } catch (ParserConfigurationException ex) {
//            ex.printStackTrace(System.out);
//        } catch (SAXException ex) {
//            ex.printStackTrace(System.out);
//        } catch (IOException ex) {
//            ex.printStackTrace(System.out);
//        }
//        return resourceList;
//    }
}
//
