package GameDecodeTest;

import POGOProtos.Networking.Responses.*;
import com.google.protobuf.util.*;
import org.junit.*;

import java.io.*;

public class GameMasterDecodeTest {
	@Test
	public void TestGameMasterDecode() throws Exception {
		try (InputStream is = getClass().getResourceAsStream("/FIRMWARE_GAME_MASTER.protobuf"))
        {
			DownloadItemTemplatesResponse response = DownloadItemTemplatesResponse.parseFrom(is);
			JsonFormat.Printer printer = JsonFormat.printer();
			try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("target/test-classes/FIRMWARE_GAME_MASTER.json")))
            {
				printer.appendTo(response, writer);
			}
		}
	}
}
