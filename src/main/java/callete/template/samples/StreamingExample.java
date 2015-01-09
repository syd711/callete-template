package callete.template.samples;

import callete.api.Callete;
import callete.api.services.music.model.Stream;
import callete.api.services.music.streams.StreamingService;

import java.io.IOException;
import java.util.List;

/**
 * Example of how to use the Streaming service in combination with the player.
 */
public class StreamingExample {

  public static void main(String[] args) throws IOException {
    StreamingService streamingService = Callete.getStreamingService();
    List<Stream> streams = streamingService.getStreams();

    Callete.getMusicPlayer().getPlaylist().setActiveItem(streams.get(0));
    Callete.getMusicPlayer().play();
  }
}
