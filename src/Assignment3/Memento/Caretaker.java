package Assignment3.Memento;

import java.util.Stack;

public class Caretaker {
    private Stack<TextMemento> mementos = new Stack<>();

    public void save(TextEditor editor) {
        mementos.push(editor.save());
    }

    public void undo(TextEditor editor) {
        if (!mementos.isEmpty()) {
            editor.restore(mementos.pop());
        }
    }
}