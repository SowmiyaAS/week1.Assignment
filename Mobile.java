package week1.assignment;

public class Mobile {
	public void sendMessage()
	{
		System.out.println("hi");
	}
	public void shareDocument()
	{
		System.out.println("document");
	}
	public void callMe()
	{
		System.out.println("call");
	}

	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.sendMessage();
      mob.shareDocument();
     mob.callMe();

	}

}
