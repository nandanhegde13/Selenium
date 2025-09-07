package Default;

public class AustralianTraffic implements CentralTraffic, ContinentTraffic {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.flashYellow();
		a.greenGo();
	

		AustralianTraffic at = new AustralianTraffic();
		ContinentTraffic ct = new AustralianTraffic();
		at.walkonsymbol();
		ct.Trainsymbol();

	}

	@Override
	public void redStop() {
// TODO Auto-generated method stub
		System.out.println(" redstop implementation");
	}

	public void walkonsymbol() {
		System.out.println("walking");
	}

	@Override
	public void flashYellow() {
// TODO Auto-generated method stub
		System.out.println(" flash yellow implementation");
//code
	}

	@Override
	public void greenGo() {
// TODO Auto-generated method stub
		System.out.println(" Green go implementation");
	}

	@Override
	public void Trainsymbol() {
// TODO Auto-generated method stub

	}

}