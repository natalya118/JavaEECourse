
public class JuniorDev extends TraineeDev{
	private Language language;
	public JuniorDev(Language language){
		super();
		this.language = language;
	}
	public JuniorDev(int bugs, Language language){
		super(bugs);
		this.language = language;
	}
	public void createBugs(){
		super.createBugs();
		System.out.println("Currently learning:");
		language.learn();
	}

}
