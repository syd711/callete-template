package callete.template.samples;

import callete.api.Callete;
import callete.api.services.network.HotSpot;

/**
 * Example of how to create a temporary hot spot
 */
public class HotSpotExample {
  
  public static void main(String[] args) throws InterruptedException, IllegalAccessException {

    HotSpot hotSpot = Callete.getNetworkService().createHotSpot("Callete", "callete123", "192.168.2.10");
    hotSpot.install();
    hotSpot.start();

    System.out.printf("Waiting connections for 3 minutes.");
    Thread.sleep(60000*3);
    
    hotSpot.uninstall();
  }
}
