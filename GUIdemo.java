package Lab_6_j5;

import javax.swing.JFrame;

public class GUIdemo {

    public static void main(String[] args) {
// создание контейнера верхнего уровня JFrame
        MyFrame frame = new MyFrame("Simple Swing");
// установка начальных размеров фрейма
        frame.setSize(600, 500);
        frame.setLocation(300, 300);
// отображение фрейма
        frame.setVisible(true);
    }
}
