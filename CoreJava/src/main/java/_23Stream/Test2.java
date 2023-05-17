package _23Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp{
	public int eid;
	public String ename;
	public double sal;
	public Emp(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}
}

public class Test2 {
	
	private static Emp[] arrayOfEmps = {
			new Emp(1,"abc",10000.0),
			new Emp(1,"xyz",30000.0),
			new Emp(3,"pqr",20000.0),
	};
	
	private static List<Emp> empList = Arrays.asList(arrayOfEmps);

	public static void main(String[] args) {
		//ways to create streams
		Stream .of(arrayOfEmps[0],arrayOfEmps[1],arrayOfEmps[2]);
		
		Stream.Builder<Emp> empSreamBuilder = Stream.builder();
		empSreamBuilder.accept(arrayOfEmps[0]);
		empSreamBuilder.accept(arrayOfEmps[1]);
		empSreamBuilder.accept(arrayOfEmps[2]);
	
		
		Integer[] empids = {1,2,3};
		
		List<Emp> emplist = new ArrayList<>();
		emplist.add(new Emp(100,"Abc",54000));
		emplist.add(new Emp(200,"xyz",74000));
		emplist.add(new Emp(300,"pqr",84000));
		emplist.add(new Emp(400,"xyyz",14000));
		emplist.add(new Emp(500,"pqqr",84000));
		
		List<Double> empsalList = emplist.stream()//convert into stram
								.filter(e->e.sal>70000)//filtering the data
								.map(e->e.sal) //fetching sal
								.collect(Collectors.toList()); //collecting
		System.out.println(empsalList);
		
		//to c how many of having 74000 sal
		emplist.stream().filter(e->e.sal == 74000)
						.forEach(e->System.out.println(e.ename));
		
		Emp maxSal = emplist.stream().max((e1,e2)->e1.sal>e2.sal?1:-1).get();
		System.out.println("Maximum sal is:"+maxSal.sal);

		Emp minSal = emplist.stream().min((e1,e2)->e1.sal>e2.sal?1:-1).get();
		System.out.println("Minmum sal is:"+minSal.sal);
		
		Long count = emplist.stream().filter(e->e.sal>14000).count();
		System.out.println("Count is:"+count);

	}

}
