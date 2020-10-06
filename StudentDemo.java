class Student{
	private int rno;
	private String name;
	void setData(int rollno,String studname){
		rno = rollno;
		name = studname;
	}
	void show(){
		System.out.println("Roll No : "+rno+" "+"Name : "+name);
	}
};

class StudentDemo{
	public static void main(String args[]){
		Student S1 = new Student();
		S1.setData(1,"Mayank");
		S1.show();
		S1.setData(2,"Rathore");
		S1.show();
	}
}

