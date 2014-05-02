package WildFire;

import WildFire.Gps.GeoPoint;

class Wifi {
	
	String wifi_name;
	Gps gps = new Gps();
	
	Wifi(){
		Gps.GeoPoint t = gps.new GeoPoint();
		gps.setGeo_point(10, 20);
		
	}
	
	public String getWifi_name() {
		return wifi_name;
	}

	public void setWifi_name(String wifi_name) {
		this.wifi_name = wifi_name;
	}
	
}
