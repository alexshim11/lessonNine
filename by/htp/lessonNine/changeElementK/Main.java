package by.htp.lessonNine.changeElementK;

//В каждом слове текста k-ю букву заменить заданным символом. Если k

//больше длины слова, корректировку не выполнять.

public class Main {

	public static void main(String[] args) {

		Text text = new Text("My name is Alexander. I like to play football", 5);

		text.splitText();

	}

}
