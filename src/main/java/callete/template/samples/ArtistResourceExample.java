package callete.template.samples;

import callete.api.Callete;
import callete.api.services.resources.ArtistResources;
import callete.api.services.resources.ResourcesService;

/**
 * Example how to use the artist resource service.
 * The service is currently limited to images and depends on a echo nest developer api key.
 */
public class ArtistResourceExample {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("Started ArtistResourceExample");
    
    ResourcesService artistResourcesService = Callete.getResourcesService();
    ArtistResources adele = artistResourcesService.getImageResourcesFor("adele");
    System.out.println(adele);
  }
}
