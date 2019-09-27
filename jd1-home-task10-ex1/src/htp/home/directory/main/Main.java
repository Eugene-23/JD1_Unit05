package htp.home.directory.main;

/*
 * Задача 1.
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать, 
 * вывести на консоль содержимое, дополнить, удалить.
 */

public class Main {

	public static void main(String[] args) {
		
		File file1 = new TextFile();
		file1.setName("Java 8");
		file1.addContent("Let's start learning Java.");
		file1.addContent("Introduction.");
				
		Directory dir1 = new Directory();
		Directory subDir = new Directory();
		
		dir1.addFile(file1);
		dir1.addDirectory(subDir);
		
		System.out.println("Title: " + file1.getName());
		
		file1.setName("Java 9");
		
		System.out.println("New Title: " + file1.getName());
		
		System.out.print("Content: ");
		printContent(file1);
		
		file1.removeContent("Introduction.");
		
		System.out.print("New content: ");
		printContent(file1);
		
	}
	
	public static void printContent(File file1) {
		for(String s : file1.getContent()) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

}
