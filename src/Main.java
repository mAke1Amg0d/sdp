import Assignment1.*;
import Assignment2.Adapter.PDFDocumentAdapter;
import Assignment2.Bridge.HighlightRenderEngine;
import Assignment2.Bridge.RenderEngine;
import Assignment2.Bridge.SimpleRenderEngine;
import Assignment2.Composite.DocumentGroup;
import Assignment2.Document;
import Assignment2.Facade.DocumentFacade;
import Assignment2.Flyweight.DocumentFactory;
import Assignment3.Chain.PaymentA;
import Assignment3.Chain.PaymentB;
import Assignment3.Chain.PaymentC;
import Assignment3.Chain.PaymentHandler;
import Assignment3.Command.RemoteControl;
import Assignment3.Command.Television;
import Assignment3.Command.TurnOffCommand;
import Assignment3.Command.TurnOnCommand;
import Assignment3.Iterator.ArrayMovieCollection;
import Assignment3.Iterator.Iterator;
import Assignment3.Iterator.ListMovieCollection;
import Assignment3.Mediator.HomeMediator;
import Assignment3.Mediator.Sensor;
import Assignment3.Mediator.TemperatureSensor;
import Assignment3.Memento.Caretaker;
import Assignment3.Memento.TextEditor;

// Main.java
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        //Chain
        PaymentHandler paymentA = new PaymentA();
        PaymentHandler paymentB = new PaymentB();
        PaymentHandler paymentC = new PaymentC();

        paymentA.setNextHandler(paymentB);
        paymentB.setNextHandler(paymentC);

        paymentA.handlePayment(210);


        //Command
        Television tv = new Television();
        RemoteControl remote = new RemoteControl();

        remote.setCommand(0, new TurnOnCommand(tv));
        remote.setCommand(1, new TurnOffCommand(tv));

        remote.pressButton(0); // TV ON
        remote.pressButton(1); // TV OFF


        //Iterator
        ListMovieCollection listMovies = new ListMovieCollection();
        listMovies.addMovie("Movie 1");
        listMovies.addMovie("Movie 2");

        ArrayMovieCollection arrayMovies = new ArrayMovieCollection(new String[]{"Movie A", "Movie B"});

        Iterator<String> listIterator = listMovies.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        Iterator<String> arrayIterator = arrayMovies.iterator();
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }


        //Mediator
        HomeMediator mediator = new HomeMediator();

        Sensor tempSensor = new TemperatureSensor(mediator);
        tempSensor.sendData();  // Sending temperature data


        //Memento
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.addText("Hello, ");
        caretaker.save(editor);
        System.out.println(editor.getText());

        editor.addText("World!");
        System.out.println(editor.getText()); // Output: Hello, World!

        caretaker.undo(editor);
        System.out.println(editor.getText()); // Output: Hello,


        /* Assignment 2
        DocumentFacade facade = new DocumentFacade();

        // 1. Использование Proxy для ленивой загрузки
        System.out.println("1. Ленивая загрузка документов:");
        facade.displayDocument("Report");

        // 2. Использование декоратора для добавления водяного знака
        System.out.println("\n2. Добавление водяного знака:");
        facade.displayDocumentWithWatermark("Report");

        // 3. Использование Flyweight для повторного использования документа
        System.out.println("\n3. Повторное использование документа:");
        facade.displayDocument("Report");

        // 4. Использование Composite для работы с группой документов
        System.out.println("\n4. Работа с группами документов:");
        DocumentGroup group = new DocumentGroup();
        group.addDocument(DocumentFactory.getDocument("Report"));
        group.addDocument(DocumentFactory.getDocument("Presentation"));
        group.display();

        // 5. Использование Adapter для работы с PDF
        System.out.println("\n5. Работа с PDF документами через Adapter:");
        Document pdfDocument = new PDFDocumentAdapter("document.pdf");
        pdfDocument.display();

        // 6. Использование Bridge для рендеринга
        System.out.println("\n6. Рендеринг документа через движок:");
        RenderEngine simpleEngine = new SimpleRenderEngine();
        facade.renderDocument("Report", simpleEngine);

        RenderEngine highlightEngine = new HighlightRenderEngine();
        facade.renderDocument("Report", highlightEngine);*/






        /*// Singleton example Assignment 1
        CoffeeShopSingleton shop = CoffeeShopSingleton.getInstance();
        shop.takeOrder("Assignment1.Espresso with sugar");

        // Factory Method example
        CoffeeFactory espressoFactory = new EspressoFactory();
        Coffee espresso = espressoFactory.createCoffee();
        espresso.prepare();

        CoffeeFactory latteFactory = new LatteFactory();
        Coffee latte = latteFactory.createCoffee();
        latte.prepare();

        // Abstract Factory example
        IngredientFactory espressoIngredients = new EspressoIngredientFactory();
        espressoIngredients.createMilk().addMilk();
        espressoIngredients.createSyrup().addSyrup();
        espressoIngredients.createAddon().addAddon();

        IngredientFactory latteIngredients = new LatteIngredientFactory();
        latteIngredients.createMilk().addMilk();
        latteIngredients.createSyrup().addSyrup();
        latteIngredients.createAddon().addAddon();

        // Prototype example
        EspressoOrder originalOrder = new EspressoOrder();
        CoffeeOrderPrototype clonedOrder = originalOrder.clone();
        clonedOrder.showOrderDetails();

        // Builder example
        CustomCoffee customCoffee = new CoffeeBuilder()
                .setCoffeeType("Assignment1.Latte")
                .setMilkType("Almond Assignment1.Milk")
                .setSyrupType("Caramel")
                .setAddonType("Whipped Cream")
                .build();
        customCoffee.showDetails();*/
    }
}
