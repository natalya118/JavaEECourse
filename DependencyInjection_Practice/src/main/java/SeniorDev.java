import java.util.Collection;

public class SeniorDev implements Programmer{
	public SeniorDev(){}
	public void createBugs(){
		System.out.println("Created no bugs");
		for(Language l:languages){
			l.learn();
		}
		
	}
	private Collection<Language> languages;
	public void setLanguages(Collection<Language> languages){
		this.languages = languages;
	}
}
