/*
create an array of 3 students with roll,name and marks
now write a method 2 update marks of a student based on online certification done..
OCJP->90%
OCA->80%
MCSA->77%
GCP->92%
use switch case and complete
*/
import lombok.*;

@Getter
@Setter
class Student {
	private int roll;
	private String name;
	private int marks;
	private String certif;
}

class Q5_marksBasedOnCertification {
	
	static void updateMarks(Student[] arr){
		for (int i=0 ; i<arr.length ; i++){
			
			String cer = arr[i].getCertif();
			
			switch(cer){
				case "OCJP": {
					arr[i].setMarks(90);
					break;
				}
				case "OCA": {
					arr[i].setMarks(80);
					break;
				}
				case "MCSA": {
					arr[i].setMarks(77);
					break;
				}
				case "GCP": {
					arr[i].setMarks(92);
					break;
				}
				default: {
					
				}
			}
		}
	}
	
	public static void main(String[] args){
		Student a[] = new Student[3];
		
		for (int i=0; i<a.length ; i++){
			a[i] = new Student();
			a[i].setRoll(Integer.parseInt(args[i]));
			a[i].setName(args[i+3]);
			a[i].setMarks(Integer.parseInt(args[i+6]));
			a[i].setCertif(args[i+9]);
		}
		
		updateMarks(a);
		for (int i=0; i<a.length ; i++){
			System.out.println(a[i].getName()+" : "+ a[i].getMarks());
			
		}
				
	}
}