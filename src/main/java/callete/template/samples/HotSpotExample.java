package callete.template.samples;

import callete.api.Callete;
import callete.api.services.network.HotSpot;

import java.io.File;

/**
 * Example of how to create a temporary hot spot
 */
public class HotSpotExample {
  
  public static void main(String[] args) throws InterruptedException, IllegalAccessException {

    HotSpot hotSpot = Callete.getNetworkService().createHotSpot("Callete", "callete123", "192.168.2.10");
    hotSpot.install();
    hotSpot.start();

    hotSpot.startWLANConfigService(new File("/home/pi/hotspot/"), 8082);

    System.out.printf("Waiting .......................");
    Thread.sleep(60000*5);
    
    hotSpot.uninstall();
  }
}
