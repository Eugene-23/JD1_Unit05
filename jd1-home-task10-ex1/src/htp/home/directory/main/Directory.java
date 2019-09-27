package htp.home.directory.main;

import java.util.ArrayList;
import java.util.List;

public class Directory {
	
	private List<Directory> subDirectories;
	private List<File> files;
	
	
	public Directory() {
		subDirectories = new ArrayList<Directory>();
		files = new ArrayList<File>();
	}
			
	public Directory(List<Directory> subDirectories, List<File> files) {		
		this.subDirectories = subDirectories;
		this.files = files;
	}	

	public List<Directory> getSubDirectories() {
		return subDirectories;
	}

	public void addDirectory(Directory newDirectory) {
		subDirectories.add(newDirectory);
	}

	public List<File> getFiles() {
		return files;
	}

	public void addFile(File newFile) {
		files.add(newFile);
	}

	@Override
	public String toString() {
		return "Directory [subDirectories=" + subDirectories + ", files=" + files + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((files == null) ? 0 : files.hashCode());
		result = prime * result + ((subDirectories == null) ? 0 : subDirectories.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directory other = (Directory) obj;
		if (files == null) {
			if (other.files != null)
				return false;
		} else if (!files.equals(other.files))
			return false;
		if (subDirectories == null) {
			if (other.subDirectories != null)
				return false;
		} else if (!subDirectories.equals(other.subDirectories))
			return false;
		return true;
	}
	
}
