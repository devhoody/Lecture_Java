package newlec.collectionPrj;

public class IntList {
	
	private int[] nums;
	private int current;
	
	public void add(int num) {
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

	public int get(int index) {
		if(current <= index)
			throw new IndexOutOfBoundsException();
		return nums[index];
	}

}
