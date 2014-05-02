package WildFire;

class Wifi {
	
	String wifi_name;
	Gps gps = new Gps();
	Wifi(){
		Gps.GeoPoint geopoint = gps.getGeo_point();
		gps.setGeo_point(geopoint);
	}
	
	public String getWifi_name() {
		return wifi_name;
	}

	public void setWifi_name(String wifi_name) {
		this.wifi_name = wifi_name;
	}
	
}
