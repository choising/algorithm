package woowa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class Solution2 {

	public String solution(String S) {
		// write your code in Java SE 8
		List<String> texts = Arrays.asList(S.split(System.lineSeparator()));
		List<Photo> photos = new ArrayList<>();
		for (String s : texts) {
			photos.add(Photo.ofOneLine(s));
		}

		List<Photo> temps = new ArrayList<>(photos);
		while (!temps.isEmpty()) {
			createNewName(temps);
		}

		return makeReturnMessage(photos);
	}

	private void createNewName(List<Photo> temps) {
		Photo target = temps.remove(0);
		List<Photo> sames = new ArrayList<>();
		sames.add(target);

		for (Photo p : temps) {
			if (p.isEqualCity(target))
				sames.add(p);
		}

		Collections.sort(sames);
		String formatter = sames.size() >= 10 ? "%02d" : "%d";

		for (int i = 0; i < sames.size(); i++) {
			Photo p = sames.get(i);
			p.generateNewName(String.format(formatter, i + 1));
		}

		for (Photo p : sames) {
			temps.remove(p);
		}
	}

	private String makeReturnMessage(List<Photo> photos) {
		StringBuilder sb = new StringBuilder();

		for (Photo p : photos) {
			sb.append(p.getNewName());
			sb.append(System.lineSeparator());
		}

		return sb.toString();
	}
}

class Photo implements Comparable<Photo> {
	private String name;
	private String extension;
	private String city;
	private String date;
	private String newName;

	private Photo(String nameWithExtension, String city, String date) {
		this.generateNameAndExtension(nameWithExtension);
		this.city = city;
		this.date = date;
	}

	public static Photo ofOneLine(String photoInfo) {
		String[] photoInfos = photoInfo.split(", ");
		return new Photo(photoInfos[0], photoInfos[1], photoInfos[2]);
	}

	public void generateNewName(String index) {
		StringBuilder sb = new StringBuilder();
		sb.append(city.substring(0, 1).toUpperCase());
		sb.append(city.substring(1).toLowerCase());
		sb.append(index);
		sb.append(".");
		sb.append(extension);
		this.newName = sb.toString();
	}

	private int findDotLocation(String s) {
		return s.indexOf(".");
	}

	private void generateNameAndExtension(String nameWithExtension) {
		int index = findDotLocation(nameWithExtension);
		this.name = nameWithExtension.substring(0, index);
		this.extension = nameWithExtension.substring(index + 1);
	}

	public boolean isEqualCity(Photo otherPhoto) {
		return this.city.equals(otherPhoto.city);
	}

	public String getNewName() {
		return newName;
	}

	@Override
	public int compareTo(Photo o) {
		return this.date.compareTo(o.date);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((extension == null) ? 0 : extension.hashCode());
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
		Photo other = (Photo) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (extension == null) {
			if (other.extension != null)
				return false;
		} else if (!extension.equals(other.extension))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
