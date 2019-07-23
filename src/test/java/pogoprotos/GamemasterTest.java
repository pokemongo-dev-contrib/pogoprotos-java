package pogoprotos;

import static org.junit.Assert.*;


import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import com.google.protobuf.util.JsonFormat;
import POGOProtos.Networking.Responses.DownloadItemTemplatesResponseOuterClass.DownloadItemTemplatesResponse;

public class GamemasterTest {

	@Test
	public void testCanReadGM() throws Exception {
		try (InputStream is = getClass().getResourceAsStream("/GAME_MASTER.protobuf")) {
			
			DownloadItemTemplatesResponse response = DownloadItemTemplatesResponse.parseFrom(is);
			JsonFormat.Printer printer = JsonFormat.printer();
			try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("GAME_MASTER.json"))) {
				printer.appendTo(response, writer);
			}
			
			
			assertEquals(3637, 		response.getItemTemplatesCount());
		}
	}

}
