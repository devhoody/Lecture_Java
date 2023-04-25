package newlec.collectionPrj;

public class GList<T> {
	
	private Object[] nums;
	private int current;
	private int capacity;
	private int amount;
	
	public GList() {
		capacity = 3;
		amount = 5;
		current = 0;
		nums = new Object[capacity];
	}
	
	public void add(T num) {
		
		if(capacity <= current) {
			Object[] temp = new Object[capacity + amount];
			for(int i=0; i<current; i++)
				temp[i] = nums[i];
			nums = temp;
			capacity += amount;
		}
		
		nums[current] = num;
		current++;
	}

	public int size() {
		// TODO Auto-generated method stub
		return current;
	}

	public void clear() {
		current = 0;
	}

	public T get(int index) {
		if(current <= index)
			throw new IndexOutOfBoundsException();
		return (T)nums[index];
	}

}
