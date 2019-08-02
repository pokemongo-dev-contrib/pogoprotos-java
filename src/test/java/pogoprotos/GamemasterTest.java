package pogoprotos;

import POGOProtos.Networking.Responses.DownloadItemTemplatesResponseOuterClass.DownloadItemTemplatesResponse;
import com.google.protobuf.util.JsonFormat;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;

public class GamemasterTest {
	@Test
	public void testCanReadGM() throws Exception {
		try (InputStream is = getClass().getResourceAsStream("/GAME_MASTER.protobuf"))
        {
			DownloadItemTemplatesResponse response = DownloadItemTemplatesResponse.parseFrom(is);
			JsonFormat.Printer printer = JsonFormat.printer();
			try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("GAME_MASTER.json")))
            {
				printer.appendTo(response, writer);
			}
		}
	}
}
