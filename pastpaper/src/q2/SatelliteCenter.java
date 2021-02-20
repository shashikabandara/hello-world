package q2;
import q2.NavigationSatellite;
public class SatelliteCenter {
	NavigationSatellite ns = new NavigationSatellite();
	DroneSatellite ds = new DroneSatellite();
	private int option;
	private ISatellite[] ISatellite;
	private IGeoLocation[] IGeoLocation;
	SatelliteLocation sl = new SatelliteLocation();
	public SatelliteCenter() {
		super();
	}
	public SatelliteCenter(int option, ISatellite[] iSatellite, IGeoLocation[] iGeoLocation) {
		super();
		this.option = option;
		ISatellite = iSatellite;
		IGeoLocation = iGeoLocation;
	}
	public void startService() {
		switch(this.option) {
		case 0 :
			ns.activate();
		case 1 :
			ds.activate();
			
		}
	}
	public void stopService() {
		switch(this.option) {
		case 0 :
			ns.activate();
		case 1 :
			ds.activate();
			
		}
	}
	public void locationService() {
		
			sl.displayLocation();
			
		
	}
	
	
}
