import com.test.mode.agency.GraduationAgency;
import com.test.mode.graduate.Graduate;

public class ModeTest {
	public static void main(String[] args) {
		Graduate graduate = new Graduate();
		//ѧ��֤
		graduate.setStudentID("1234567");
		//����
		graduate.setMealCard("2012345");
		//����֤
		graduate.setLibraryCard("123456");
		//���֤
		graduate.setIdentityCard("520986188911227183");
		
		GraduationAgency angency = new GraduationAgency();
		angency.handlingOffice(graduate);
		
		System.out.println(graduate);
	}

}
