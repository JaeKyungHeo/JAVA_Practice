package sec07.exam01.pack1;

public class CellPhoneExam {

	public static void main(String[] args) {
		DmbCellPhone ex1 = new DmbCellPhone("galaxy","red");
		
		// DmbCellPhone�� CellPhone���κ��� ��ӹ��� ������ ��밡��
		System.out.println(ex1.model);
		ex1.turnOnDmb();
		
		// num�� private�̶� ����� �ȉ����Ƿ� �����Ͽ���
		//System.out.println(ex1.num); 
		

	}

}
