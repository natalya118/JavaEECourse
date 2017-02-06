
public class ITCompany {

	private ITCompany(){}
	private static class ITCompanySingletonHolder{
		static ITCompany instance = new ITCompany();
	}
	public static ITCompany getInstance(){
		return ITCompanySingletonHolder.instance;
	}
}
