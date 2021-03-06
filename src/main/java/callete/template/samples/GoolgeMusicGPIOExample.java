package callete.template.samples;

import callete.api.Callete;
import callete.api.services.gpio.GPIOService;
import callete.api.services.gpio.PushButton;
import callete.api.services.gpio.PushEvent;
import callete.api.services.gpio.PushListener;
import callete.api.services.music.MusicServiceAuthenticationException;
import callete.api.services.music.google.GoogleMusicService;
import callete.api.services.music.model.Album;

import java.util.List;

/**
 * Example how to use the Google Music API.
 * Ensrue that the "google.music.email" and "google.music.password" properties
 * are set in the callete.properties.
 */
public class GoolgeMusicGPIOExample {

  public static void main(String[] args) throws MusicServiceAuthenticationException {
    final GoogleMusicService googleMusicService = Callete.getGoogleMusicService();
    googleMusicService.authenticate();
    List<Album> albums = googleMusicService.getAlbums();
    Album album = albums.get(0);

    System.out.println("Playing " + album + " starting with " + album.getSongs().get(0));
    Callete.getMusicPlayer().getPlaylist().setPlaylist(album);
    Callete.getMusicPlayer().play();


    GPIOService gpioService = Callete.getGPIOService();
    PushButton pushButton = gpioService.connectPushButton(13, "Next Track");
    pushButton.addPushListener(new PushListener() {
      @Override
      public void pushed(PushEvent pushEvent) {
        Callete.getMusicPlayer().next();
      }

      @Override
      public long getPushDebounceMillis() {
        return 700;
      }

      @Override
      public long getLongPushDebounceMillis() {
        return 1000;
      }
    });

  }
}
