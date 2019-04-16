package day08;

public class People {
	public String job ;
	private Worker worker ;
	public People(String job ,int age , String name) {
		this.job = job ;
		this.worker=new Worker(age,name);
		}
	public void tell() {
		System.out.println(this.worker.getAge() + this.worker.getName() + job);
	}

}
