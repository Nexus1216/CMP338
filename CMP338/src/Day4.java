
public class Day4 {
	
	

	public static void main(String[] args) {
		
		int[] size = {1,2,3,5,6};
		int obj = 4;
		
		int[] temp = new int[size.length + 1];
		int index = 0;
		int i = 0;
		
		if(index < size.length && size != null){
			boolean stop = false;
			while(!stop){
				index = i;
				if(i < size.length){
					if(obj > size[i]){
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
					temp[j] = size[j];
				}
				if(j > index){
					temp[j] = size[j - 1];
				}
			}
		
		size = null;
		size = temp;
		}
		else{
			if(size != null){
				int[] temp2 = new int[size.length + 1];
				for(int j = 0; j < size.length; j++){
					temp2[j] = size[j];
				}
				temp2[temp2.length - 1] = obj;
				size = null;
				size = temp2;
			}
			else{
				size = new int[1];
				size[0] = obj;
			}
		}
		for(int j = 0; j < size.length; j++){
			System.out.println(size[j]);
		}

	}

}
