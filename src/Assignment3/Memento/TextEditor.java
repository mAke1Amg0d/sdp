package Assignment3.Memento;

public class TextEditor {
    private String text = "";

    public void addText(String newText) {
        text += newText;
    }

    public String getText() {
        return text;
    }

    public TextMemento save() {
        return new TextMemento(text);
    }

    public void restore(TextMemento memento) {
        text = memento.getText();
    }
}