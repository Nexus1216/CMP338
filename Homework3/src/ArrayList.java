
public class ArrayList implements ListInterface {
	
	int[] array = new int[0];
	int current = 0;
	
	
	@Override
	public boolean isEmpty() {
		return array == null;
		
	}

	@Override
	public int size() {
		if(!isEmpty()){
			return array.length;
		}
		else{
			return 0;
		}
		
	}

	@Override
	public void add(int obj) {
		if(!isEmpty()){
			int[] temp = new int[size() + 1];
			for(int i = 0; i < size(); i++){
				temp[i] = array[i];
			}
			temp[temp.length - 1] = obj;
			array = null;
			array = temp;
		}
		else{
			array = new int[1];
			array[0] = obj;
		}
		
	}

	@Override
	public boolean addAt(int obj, int index) {
		boolean rc = false;
		if(index <= size() && !isEmpty()){
			int[] temp = new int[size() + 1];
			temp[index] = obj;
		
			for(int i = 0; i < temp.length; i++){
				if(i < index){
					temp[i] = array[i];
				}
				if(i > index){
					temp[i] = array[i - 1];
				}
			
			}
			array = null;
			array = temp;
			
			rc = true;
		}
		else{
			add(obj);
			rc= true;
		}
		return rc;
	}

	@Override
	public void addSorted(int obj) {
		int index = 0;
		
		if(index < size() && !isEmpty()){
			int[] temp = new int[size() + 1];
			int i = 0;
			boolean stop = false;
			while(!stop){
				index = i;
				if(i < size()){
					if(obj > array[i]){
						i++;
					}
					else{
						stop = true;
					}
				}
				else{
					stop = true;
				}
			}
		
			temp[index] = obj;
			for(int j = 0; j < temp.length; j++){
				if(j < index){
					temp[j] = array[j];
				}
				if(j > index){
					temp[j] = array[j - 1];
				}
			}
		
		array = null;
		array = temp;
		}
		else{
			add(obj);
		}

	}

	@Override
	public int getObject(int index) {
		if(index < size() && !isEmpty()){
			return array[index];
		}
		else{
			return 0;
		}
		
	}

	@Override
	public int getFirstObject() {
		if(!isEmpty()){
			return array[0];
		}
		else{
			return 0;
		}
	}

	@Override
	public int getNextObject() {
		if (current < size() && !isEmpty()){
			current++;
			return array[current];
		}
		else{
			return 0;
		}
		
	}

	@Override
	public boolean remove(int index) {
		if(index < size()){
			int[] temp = new int[size() - 1];
			for(int i = 0; i < temp.length; i++){
				if(i < index){
					temp[i] = array[i];
				}
				else{
					temp[i] = array[i + 1];
				}
			}
			array = null;
			array = temp;
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public void removeAll() {
		array = null;

	}
	
	public void showList() {
		if (isEmpty()) {
			System.out.println("The Array List Is Empty...");
		} else {
			System.out.print("The Array List Contains: {" + getFirstObject());
			while (current < size() - 1) {
				getNextObject();
				System.out.print(", " + array[current]);
			}
			System.out.println("}");
		}
	}

}
