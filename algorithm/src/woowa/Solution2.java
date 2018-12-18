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
	
	@Test
	public void test() {
		String s = "photo.jpg, seoul, 2018-11-10 08:00:05\r\n" + 
				"wow.png, newyork, 2018-10-15 12:15:05\r\n" + 
				"a.jpg, seoul, 2018-10-07 12:15:05\r\n" + 
				"b.jpg, paris, 2016-10-09 17:15:44\r\n" + 
				"c.jpg, paris, 2016-07-13 19:15:22\r\n" + 
				"d.jpg, seoul, 2018-06-14 17:18:22\r\n" + 
				"e.jpg, seoul, 2018-08-22 13:11:13\r\n" + 
				"1111.jpg, paris, 2018-10-14 12:15:05\r\n" + 
				"f.jpg, seoul, 2018-09-11 14:02:12\r\n" + 
				"g.png, seoul, 2018-05-11 09:02:23\r\n" + 
				"h.jpeg, seoul, 2018-02-11 07:02:44\r\n" + 
				"i.jpg, seoul, 2017-10-14 12:17:07\r\n" + 
				"j.jpg, seoul, 2017-10-14 12:16:02\r\n" + 
				"k.jpg, seoul, 2017-10-14 12:15:05";
		System.out.println(solution(s));
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
