
public class MyQueue {

	int frontIndex;
	int rearIndex;
	int arr[];

	public MyQueue(int size) {
		frontIndex = -1;
		rearIndex = -1;
		arr = new int[size];
	}

	public boolean isFull() {
		return rearIndex == arr.length - 1;
	}

	public boolean isEmpty() {
		if (frontIndex == -1 && rearIndex == -1)
			return rearIndex == -1;
		else
			return false;
	}

	public int enQueue(int value) throws Exception {
		if (rearIndex == arr.length - 1)
			throw new Exception("Cannot Insert at End. Max Queue Limit Reached");
		else if (isEmpty()) {
			frontIndex = 0;
			rearIndex = 0;
		} else {
			rearIndex++;
		}
		arr[rearIndex] = value;
		return value;

	}

	public void deQueue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		} else if (frontIndex == rearIndex) { // only 1 element, dequeue will result in empty
			frontIndex = -1;
			rearIndex = -1;
		} else {
			frontIndex++;
			rearIndex--;
		}
	}

	public int front() {
		return 0;

	}
}