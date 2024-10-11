package Arquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo1 {
  public static void main(String[] args) throws IOException {
	  
	  Path path = Paths.get("D://Texto");
	  System.out.println(Files.exists(path));
	  System.out.println(Files.isDirectory(path));
	  System.out.println(Files.isRegularFile(path));
	  System.out.println(Files.isReadable(path));
	  System.out.println(Files.isExecutable(path));
	  System.out.println(Files.size(path));
	  System.out.println(Files.getLastModifiedTime(path));
	  System.out.println(Files.getOwner(path));
	  
	  System.out.println(Files.deleteIfExists(path));
  }
}
