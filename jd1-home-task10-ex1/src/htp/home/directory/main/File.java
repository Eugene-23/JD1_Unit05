package htp.home.directory.main;

import java.util.ArrayList;
import java.util.List;

public class File {
	
	private String name;
	private List<String> content;
		
	
	public File() {
		content = new ArrayList<String>();		
	}
	
	public File(String name, List<String> content) {
		this.name = name;		
		this.content = content;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getContent() {
		return content;
	}
	
	public void addContent(String newContent) { 		
		content.add(newContent);				
	}
	
	public void removeContent(String removingContent) { 		
		content.remove(removingContent); 			
	}

	@Override
	public String toString() {
		return "File [name=" + name + ", content=" + content + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		File other = (File) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
		
}
