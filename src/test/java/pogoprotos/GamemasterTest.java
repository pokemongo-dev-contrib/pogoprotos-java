package pogoprotos;

import static org.junit.Assert.*;

import java.io.InputStream;

import org.junit.Test;

import POGOProtos.Networking.Responses.DownloadItemTemplatesResponseOuterClass.DownloadItemTemplatesResponse;

public class GamemasterTest {

	@Test
	public void testCanReadGM() throws Exception {
		try (InputStream is = getClass().getResourceAsStream("/GAME_MASTER.protobuf")) {
			
			DownloadItemTemplatesResponse response = DownloadItemTemplatesResponse.parseFrom(is);
			assertEquals(2460, 		response.getItemTemplatesCount());
		}
	}

}
