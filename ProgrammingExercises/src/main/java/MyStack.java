
public class MyStack {
	private int position;
	private int size;
	private String[] arrString;

	public MyStack(int size) {
		this.size = size;
		position = -1;
		arrString = new String[size];
	}

	public boolean isEmpty() {
		return position == -1;
	}

	public boolean isFull() {
		return position + 1 == size;
	}

	public String push(String s) throws Exception {
		if (!isFull())
			arrString[++position] = s;
		else
			throw new Exception("Stack Full");
		return s;
	}

	public String pop() throws Exception {
		if (!isEmpty())
			return arrString[position--];
		else
			throw new Exception("Stack Empty");
	}

	public String peek() throws Exception {
		if (!isEmpty())
			return arrString[position];
		else
			throw new Exception("Stack Empty");
	}

}
