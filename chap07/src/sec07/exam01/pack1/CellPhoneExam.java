package sec07.exam01.pack1;

public class CellPhoneExam {

	public static void main(String[] args) {
		DmbCellPhone ex1 = new DmbCellPhone("galaxy","red");
		
		// DmbCellPhone은 CellPhone으로부터 상속받은 내용을 사용가능
		System.out.println(ex1.model);
		ex1.turnOnDmb();
		
		// num은 private이라 상속이 안됬으므로 컴파일에러
		//System.out.println(ex1.num); 
		

	}

}
