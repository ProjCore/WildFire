package WildFire;

import WildFire.Gps.GeoPoint;

class Wifi {
	
	String wifi_name;
	Gps gps = new Gps();
	Wifi(){
		
		GeoPoint geopoint = gps.new GeoPoint(20, 10);
		gps.setGeo_point(geopoint);
		
	}
	
	public String getWifi_name() {
		return wifi_name;
	}

	public void setWifi_name(String wifi_name) {
		this.wifi_name = wifi_name;
	}
	
}
