
public class TraineeDev implements Programmer{
	private int bugs = 2;
	public TraineeDev(){}
	public TraineeDev(int bugs){
		this.bugs = bugs;
	}
	public void createBugs(){
		System.out.println("Created " + bugs + " bugs");
	}

}
