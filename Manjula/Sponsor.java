class Sponsor
{
	//inheritance
	public String owner="yagoo";
}
class Team extends Sponsor
{
	private String teamname="CSK";
	public static void main(String[] args)
	{
	Team myteam = new Team();
	System.out.println(myteam.owner+" "+myteam.teamname);
	}
}