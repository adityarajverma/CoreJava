package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FilesAsStream {

	public static void main(String args[]) throws IOException {
		List<String> result = Files.lines(Paths.get("pom.xml")).filter(line -> line.contains("project"))
				.map(line -> line.replaceAll("<", "")).collect(Collectors.toList());

		System.out.println(result);
	}

}
