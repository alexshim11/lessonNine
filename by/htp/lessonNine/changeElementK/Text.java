package by.htp.lessonNine.changeElementK;

public class Text {

	private String text;
	private int element;

	public Text(String text, int element) {
		this.text = text;
		this.element = element;
	}

	public String getText() {
		return text;
	}

	public int getElement() {
		return element;
	}

	public void splitText() {
		String word[] = text.split(" ");
		for (int i = 0; i < word.length; i++) {
			if (element < word[i].length()) {
				String temp = "";
				temp = word[i].substring(0, element - 1);
				temp = temp + "#";
				temp = temp + word[i].substring(element);
				System.out.print(temp + " ");
			} else
				System.out.print(word[i]+ " ");
		}
	}
	
}
