package senscript;

import device.Device;
import device.DeviceList;
import device.SensorNode;
import simulation.WisenSimulation;

public class Command_GETINFO extends Command {

	protected String arg = "" ;
	
	public Command_GETINFO(SensorNode sensor, String arg) {
		this.sensor = sensor ;
		this.arg = arg ;
	}

	@Override
	public double execute() {
		Double suma = 0.0;
		WisenSimulation.simLog.add("S" + sensor.getId() + " GET INFO.");
		//IZMENA: MOBILE-->GAS
		String a = "";
		for (Device device : DeviceList.devices) {
			if(device.getType() == Device.GAS) {	
				/*if (sensor.detect(device)) 
				{
					System.out.println("gas: " + device);
					Double lat = sensor.getLatitude();
					Double lon = sensor.getLongitude();
					sensor.getScript().addVariable(arg, device.getId()+"#"+device.getLatitude()+"#"+device.getLongitude()+"#"+device.getValue());
					
					a=a.concat("#"+device.getId()+"#"+device.getLatitude()+"#"+device.getLongitude()+"#"+device.getValue());
				}
				else
				{
					sensor.getScript().addVariable(arg, a);
				}*/
				Double lat = sensor.getLatitude();
				Double lon = sensor.getLongitude();
				Double dlat = device.getLatitude();
				Double dlon = device.getLongitude();
				Double dval = device.getValue();
				Double latDiff = Math.abs(lat-dlat);
				Double lonDiff = Math.abs(lon-dlon);
				Double dist = Math.sqrt(Math.pow(lat-dlat, 2)+Math.pow(lon-dlon, 2))*10000;
				//ako je manje od 20 onda je njegova vrednost
				//ako je vece od 21 i manje od 100 onda srazmerno udaljenosti: 20/udaljenost * vrednost
				
				if(dist<=21)
				{
					suma = suma + dval;
					System.out.println("id-->" + device.getId() + " vrednost-->" + dval);
				}
				else if (dist>21 && dist<=100)
				{
					suma = suma + (20/dist)*dval;
					System.out.println("id-->" + device.getId() + " vrednost-->" + (20/dist)*dval + " prev-->" + dval + "dist-->" + dist);
				}
				else 
				{
					suma = suma + 0;
					System.out.println("id-->" + device.getId() + " izvor je daleko");
				}
				
				sensor.getScript().addVariable(arg, ""+suma);
			}
		}
		return 0;
	}

	@Override
	public String toString() {
		return "GETINFO";
	}

}
