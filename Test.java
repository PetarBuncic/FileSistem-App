package filecomander;

import java.io.File;
import java.nio.file.attribute.FileTime;
public class FileComanderTest {

	
		public static void main(String[] args) {
			
			final File folder = new File("D:/SA DISKA SEAGATE 300/ingal");
			listFilesForFolder(folder);

		}
		public static  void listFilesForFolder(final File folder) {
		    for (final File fileEntry : folder.listFiles()) {
		        if (fileEntry.isDirectory()) {
		        	System.out.println(fileEntry.getName()+" Je Direktorijum");
		        	info(folder);
		           // listFilesForFolder(fileEntry);
		        } else {
		            System.out.println(fileEntry.getName()+" Je File");
		        }
		    }
		}
		public static void info(final File folder) {
			System.out.println(folder.getName());
			System.out.println((folder).getcreationTime() );
			System.out.println(folder.getAbsolutePath());
			System.out.println(folder.getTotalSpace());
			System.out.println(folder.getUsableSpace());
			System.out.println(folder.lastModified());
			
			
		}
		public static void create(String path) {
			
		}
		public static void rename(String path) {
			
		}
		public static void copy(String path) {
			
					
		}
		public static void move(String path) {
			
		}
		public static void delete(String path) {
			
		}
				

	}
