import java.util.ArrayList;

public class StudentClass {
	private String name;
	private ArrayList<String> subject; 
	private ArrayList<Character> grade;
	StudentClass(String n){
		name=n;
		subject=new ArrayList<String>();
		grade=new ArrayList<Character>();
	}
	public String getName() {
		return name;
	}
	public void add(String s,Character g) {
		subject.add(s);
		grade.add(g);
	}
	public double getGPA() {
		double gpa=0.0;
		for(char g:grade) {
			switch(g) {
			case 'A':
			case 'a':gpa += 4.0;
						break;
			case 'B':
			case 'b':gpa += 3.0;
			break;
			case 'c':
			case 'C':gpa += 2.0;
			break;
			case 'D':
			case 'd':gpa += 1.0;
			break;
			case 'f':
			case 'F':gpa += 0.0;
			break;
			}
		}
		
		return gpa/grade.size();
	}
	public ArrayList<String> getSubjects() {
		// TODO Auto-generated method stub
		return subject;
	}
	
}
