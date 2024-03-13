import java.util.Scanner;
public class GradePointAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass chandu =new StudentClass("Chandu");
		System.out.println("Enter the number of Subjects :");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("Enter the subject name :");
			String s=scan.next();
			System.out.println("Enter the grade: ");
			
			char g=scan.next().charAt(0);
			chandu.add(s, g);
		}
		System.out.println(chandu.getName()+"obtained GpA of: "+chandu.getGPA());
		System.out.println("The grades obtained in these Subjects: ");
		for(String str:chandu.getSubjects()) {
			System.out.println(str);
		}
		
		
		

	}

}
