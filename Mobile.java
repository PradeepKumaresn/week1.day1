package Week1Day1;

public class Mobile {
	
	String mobilemodel="Slice";
	float mobileW=1000f;
	Boolean mobile_cHARGED = true;
	int mobilecost=1;



	public void makeCall()
	{
		char color ='A';
		System.out.println(color);
		
		System.out.println(mobilecost);
		System.out.println("makecall");
	}
	public void sendMsg()
	{
		System.out.println(mobileW);
		System.out.println(mobile_cHARGED);
System.out.println(mobilecost);
		System.out.println("message");
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("mainmethod");
	System.out.println("fun");

Mobile mamob = new Mobile();
mamob.makeCall();
mamob.sendMsg();
System.out.println(mamob.mobilecost);
System.out.println(mamob.mobileW);
System.out.println(mamob.mobile_cHARGED);
System.out.println(mamob.mobilecost);

}
}
