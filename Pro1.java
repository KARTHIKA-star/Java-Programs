class studentsdata
{
	String studname;
	int studno;
	int mark;
	studentsdata()
	{
		System.out.println("welcome");
	}
	@Override
	public String toString() {
		return "student [studname=" + studname + ", studno=" + studno + ", mark=" + mark + "]";
	}
	
}
public class Pro1 {

	public static void main(String[] args) {
		studentsdata s=new studentsdata();
		System.out.println(s);


	}

}
