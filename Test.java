package filecomander;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileComanderTest  {

	
		public static void main(String[] args) {
			//Path path= new Path();
			Scanner input=new Scanner(System.in);
			String fn=input.nextLine();
			input.close();
			final File folder = new File(fn);
			//final FileTime folder1=FileTime.getLastModifiedTime();
			
			listFilesForFolder(folder);
			info2(fn);
			
		}
		public static  void listFilesForFolder(final File folder) {
			if(folder.isDirectory()){
			    for (final File fileEntry : folder.listFiles()) {
			        if (fileEntry.isDirectory()) {
			        	System.out.println("+++"+fileEntry.getName()+" Je Direktorijum");
			        	//info(folder);
			           // listFilesForFolder(fileEntry);
			        } else {
			            System.out.println(fileEntry.getName()+" Je File");
			        }
			    }
			}
			else {
				 System.out.println(folder.getName()+" Je File");
			}
		}
		/*public static void info(final File folder) {
			System.out.println(folder.getName());
			
			System.out.println(folder.getAbsolutePath());
			System.out.println(folder.getTotalSpace());
			System.out.println(folder.getUsableSpace());
			System.out.println(folder.lastModified());
			
			
		}*/
		
		/*Informacije na drugi nacin, kreiramo funkciju koja na iscitava informavije o fileu*/
		
		public static void info2(String filepath) {
			File file= new File(filepath);
	        Path path =Paths.get(filepath);
	        try{
	        BasicFileAttributes fatr = Files.readAttributes(path,BasicFileAttributes.class);
	        
	        System.out.printf("File creation time: %s%n", fatr.creationTime());// vreme kreiranja
	        System.out.printf("File last access  time: %s%n", fatr.lastAccessTime());// vreme kreiranja
	        System.out.printf("File size: %s%n", fatr.size());// vreme kreiranja
	        System.out.printf("File path: %s%n", file.getPath() );// vreme kreiranja
	        System.out.printf("File name %s%n", file.getName() );// vreme kreiranja
	     
	    
	        }catch(Exception e){
	        	e.printStackTrace();
	        }
			
			
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
