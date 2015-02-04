
public class Day1 {

	public static void main(String[] args) {
		
		System.out.println(recursive(5));
		System.out.println(loop(5));
		System.out.println(FiB(4));
	}
	
	
	
	public static int recursive(int m){
		if(m == 0){
			return 1;
		}
		else{
			return m*recursive(m-1);
		}
	}
	

	// when it comes to factorial loops are better than recursion
	public static int loop(int m){
		int answer = 1;
		for(int i = 2; i <= m; i++){
			answer *= i;
			}
		return answer;
		}

	public static int FiB(int m){
		if(m == 0 || m == 1)
			return 1;
		else
			return FiB(m - 1) + FiB(m-2);
	}
	

}
