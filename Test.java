package filecomads;

import java.io.File;

public class Test {

	public static void main(String[] args) {

		final File folder = new File("E:/Pera");
		listFilesForFolder(folder);

	}
	public static void listFilesForFolder(final File folder) {
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	        	System.out.println(fileEntry.getName()+" Je Direktorijum");
	            listFilesForFolder(fileEntry);
	        } else {
	            System.out.println(fileEntry.getName()+" Je File");
	        }
	    }
	}

}
