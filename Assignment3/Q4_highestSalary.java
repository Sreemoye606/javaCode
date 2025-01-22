/*
4. Create an array of 3 employees then find the highest salary holder and print name
*/
import lombok.*;

@Getter
@Setter
class Employees {
	private String name;
	private int salary;
	
}

class Q4_highestSalary{
	
	static Employees highestSalary(Employees[] arr){
		int m = arr[0].getSalary();
		int ind=0;
		for (int j=0; j<arr.length ; j++){
			if (arr[j].getSalary() > m){
				m = arr[j].getSalary();
				ind = j;
			}
		}
		return arr[ind];
	}
	
	public static void main(String[] args){
		Employees a[] = new Employees[3];
		for (int i=0; i<a.length ; i++){
			a[i] = new Employees();
			a[i].setName(args[i]);
			a[i].setSalary(Integer.parseInt(args[i+3]));
		}
		
		Employees res = new Employees();
		res = highestSalary(a);
		System.out.println(res.getName());
		
	}
}