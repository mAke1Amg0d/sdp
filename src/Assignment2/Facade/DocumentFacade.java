package Assignment2.Facade;

import Assignment2.Bridge.DocumentRenderer;
import Assignment2.Bridge.RenderEngine;
import Assignment2.Bridge.SimpleDocumentRenderer;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.Document;
import Assignment2.Flyweight.DocumentFactory;

// Фасад для работы с документами
public class DocumentFacade {
    //Задачи:
    //Метод для отображения документа:
    //Используйте фабрику документов, чтобы получить документ по заданному заголовку.
    //Вызовите метод для отображения документа.

    public void displayDocument(String title) {
        Document doc = DocumentFactory.getDocument(title);
        doc.display();
    }

    //Метод для отображения документа с водяным знаком:
    //Получите документ по заголовку с помощью фабрики документов.
    //Оберните полученный документ декоратором, который добавляет водяной знак.
    //Вызовите метод для отображения обёрнутого документа.

    public void displayDocumentWithWatermark(String title) {
        Document doc = DocumentFactory.getDocument(title);
        Document watermarkedDoc = new WatermarkDecorator(doc);
        watermarkedDoc.display();
    }

    //Метод для рендеринга документа:
    //Создайте объект рендерера, передав в конструктор выбранный движок рендеринга.
    //Вызовите метод рендеринга в рендерере для заданного документа.
    public void renderDocument(String title, RenderEngine engine) {
        DocumentRenderer renderer = new SimpleDocumentRenderer(engine);
        renderer.render(title);
    }




}

