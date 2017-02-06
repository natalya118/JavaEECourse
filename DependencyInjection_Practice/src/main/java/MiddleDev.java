
public class MiddleDev implements Programmer{
	public MiddleDev(){}
	public void createBugs(){
		System.out.println("Fixed more bugs, than created");
		language.learn();
	}
	
	private String technology;
	public void setTechnology(String technology){
		this.technology = technology;
	}
	
	public String getTechnology(){
		return technology;
	}
	
	private Language language;
	public void setLanguage(Language language){
		this.language = language;
	}

}
