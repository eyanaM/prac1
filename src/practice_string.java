
public class practice_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creat obj
		practice_string obj = new practice_string();
		obj.practice4("Matt", " Gomes");
		obj.practice5();
		practice_string.brother("Jayes", " Rozario");
		
}
	//parameter
	public void practice4(String firstname, String lastname) {
		
		String fullname = firstname+ lastname;
		System.out.println(fullname);
	}
// non parameter
	
	public void practice5 () {
		String firstword = "nice";
		String lastword  = " person";
		String mainword = (firstword+lastword);
		System.out.println(mainword);
	}
	public static void brother (String firstname, String lastname) {
		String fullname = firstname+lastname;
		System.out.println(fullname);
		
	}
	
	
	
	
	
}
