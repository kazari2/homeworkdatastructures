import java.util.Arrays;

public class ArrayStack<T> {
	private T[] Stack;
	private final int MAX_CAPACITY = 10000;
	private boolean initialized = false;
	private int TopIndex;
	public static final int DEFAULT_CAPACITY = 31;

	ArrayStack() {
		this(DEFAULT_CAPACITY);
	}
	public ArrayStack(int capacity) {
		//Checkcapacity
		T[] tempstack = (T[]) new Object[capacity];
		Stack = tempstack;
		TopIndex = -1;
		initialized = true;
	}
	public void push(T entry) {
		//checkinitialization
		//ensureCapacity
		Stack[TopIndex + 1] = entry;
		TopIndex++;
		
	}
	public T pop() {
		//checkinitaliztion
		T result = Stack[TopIndex];
		Stack[TopIndex] = null;
		TopIndex--;
		return result;
	}
	private void ensureCapacity() {
		if (TopIndex > Stack.length - 1) {
			int newLength = Stack.length * 2;
			T[] tempArray = null;
			//for (int i = 0; )
}
	}
	public T returnStackItems(int number) {
		return Stack[number];
	}
	public int numberOfItems() {
		return TopIndex;
	}
	public TunaCan[] returnTunaCanItems() {
		TunaCan[] result = new TunaCan[TopIndex];
		for (int i = 0; i <= TopIndex -1; i++) {
			result[i] = (TunaCan) Stack[i];
		}
		//reduce redundancy with printing items in this method
		return result;
	}
	public CornCan[] returnCornCanItems() {
		CornCan[] result = new CornCan[TopIndex];
		for (int i = 0; i <= TopIndex-1; i++) {
			result[i] = (CornCan) Stack[i];
		}
		return result;
	}
	public InstantNoodlePacket[] returnInstantNoodleItems() {
		InstantNoodlePacket[] result = new InstantNoodlePacket[TopIndex];
		for (int i = 0; i <= TopIndex - 1; i++) {
			result[i] = (InstantNoodlePacket) Stack[i];
		}
		return result;
	}
	public PuddingPacket[] returnPuddingPacketItems() {
		PuddingPacket[] result = new PuddingPacket[TopIndex];
		for (int i = 0; i <= TopIndex - 1; i++) {
			result[i] = (PuddingPacket) Stack[i];
		}
		return result;
	}
	public void isEmpty() {
		System.out.println(TopIndex);

	}
}