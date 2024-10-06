package Assignment2.Composite;

import Assignment2.Document;

import java.util.ArrayList;
import java.util.List;

// Класс для работы с группами документов (категориями)
public class DocumentGroup implements Document {
    private List<Document> documents = new ArrayList<>();

    // Задача: Реализуйте методы для добавления и удаления документов из группы,
    // а также отображение всех документов в группе через метод display().
    public void addDocument(Document doc) {
        documents.add(doc);
    }
    public void removeDocument(Document doc) {
        documents.remove(doc);
    }

    @Override
    public void display() {
        for (Document doc : documents) {
            doc.display();
        }
    }
}

