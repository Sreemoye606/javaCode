/*
 Create Teacher class with tname,subject and yrsOfExp with getter/setter
   Create Student class with sname,degree and college with getter/setter
   Now create another class having 2 static methods to create relationship b/w both 
   The O/P should look like following:
   Ankan takes java class under Amitava Sir
   Amitava teaches OOPS design to Madhu who reads as Btech Student in UEM college
   */
 

class Teacher {
	private String tname;
	private String subject;
	private int yrsOfExp;
	
	public String getTname(){
		return this.tname;
	}
	public void setTname(String tname){
		this.tname = tname;
	}
	
	public String getSubject(){
		return this.subject;
	}
	public void setSubject(String subject){
		this.subject = subject;
	}

	public int getYrsOfExp(){
		return this.yrsOfExp;
	}
	public void setYrsOfExp(int yrsOfExp){
		this.yrsOfExp = yrsOfExp;
	}
}


class Student {
	private String sname;
	private String degree;
	private String college;
	
	public String getSname(){
		return this.sname;
	}
	public void setSname(String sname){
		this.sname = sname;
	}
		
	public String getDegree(){
		return this.degree;
	}
	public void setDegree(String degree){
		this.degree = degree;
	}
	
	public String getCollege(){
		return this.college;
	}
	public void setCollege(String college){
		this.college = college;
	}
	
	
}

class Relation {
	static void shortRel(Teacher t, Student s){
		System.out.println(s.getSname()+" takes java class under "+ t.getTname()+" Sir");
		
	}
	
	static void longRel(Teacher t, Student s){
		System.out.println(t.getTname()+" teaches "+t.getSubject()+" to "+s.getSname()+" who reads as "+s.getDegree()+" Student in "+s.getCollege()+" college");
		
	}
}

class Q2_teacherStudent{
	
	public static void main(String[] args){
		Teacher t = new Teacher();
		t.setTname("Amitava");
		t.setSubject("oops design");
		t.setYrsOfExp(25);
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setSname("Ankan");
		s2.setSname("Madhu");
		
		s1.setCollege("IEM");
		s2.setCollege("UEM");
		
		s1.setDegree("Btech");
		s2.setDegree("Btech");
		
		Relation r = new Relation();
		r.shortRel(t,s1);
		r.longRel(t,s2);
	}
}