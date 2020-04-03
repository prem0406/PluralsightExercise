
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ZipFileSystem {
	public static void main(String... args) {
		String[] data = {
				"A",
				"AB",
				"ABC",
				"Hello World!"
		};
		
		try (FileSystem zipFS = createZip(Paths.get("Zipfile.zip"))) {
			copyToZipFile(zipFS);
			writeToZip1(data, zipFS);
			writeToZip2(data, zipFS);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}


	private static FileSystem createZip(Path path) throws URISyntaxException, IOException {
		// TODO Auto-generated method stub
		Map<String,String> propMap = new HashMap<String, String>();
		propMap.put("create", "true");
		URI zipUri = new URI("jar:file", path.toUri().getPath(), null);
		FileSystem zipFS = FileSystems.newFileSystem(zipUri, propMap);
		return zipFS;
	}
	
	private static void copyToZipFile(FileSystem zipFS) throws IOException, URISyntaxException {
		
		/*
		 * We can also write
		 * Path sourcePath = FileSystem.getDefault().getPath("file.txt");
		 */
		Path sourcePath = Paths.get("file.txt");
		//URI pathUri = new URI("jar:file", sourcePath.toUri().getPath(),null);
		
		Path destPath = zipFS.getPath("/copiedFile.txt");
		Files.copy(sourcePath, destPath, StandardCopyOption.REPLACE_EXISTING);
	}
	
	private static void writeToZip2(String[] data, FileSystem zipFS) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter writer = Files.newBufferedWriter(zipFS.getPath("/File1.txt"), StandardOpenOption.CREATE);
		for (String line : data) {
			writer.write(line);
			writer.newLine();
		}
		writer.close();
	}

	private static void writeToZip1(String[] data, FileSystem zipFS) throws IOException {
		// TODO Auto-generated method stub
		Files.write(zipFS.getPath("File2.txt"), Arrays.asList(data), StandardOpenOption.CREATE);
	}
}
