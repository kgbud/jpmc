
public class Error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] num = {6,4,5,7,3};
		
		try {
			
			System.out.println(num[5]);
		}
		catch (Exception e) {
			System.out.println("Array index out of bound");
		}

	}

}
