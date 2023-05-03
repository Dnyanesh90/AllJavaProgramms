package Tutorial10;

public class LedBulp implements SwitchLight {

	@Override
	public void turnOn() {
		System.out.println("Led bulp Turn on");
	}

	@Override
	public void turnOff() {
		System.out.println("Led bulp Turn off");

	}
}
