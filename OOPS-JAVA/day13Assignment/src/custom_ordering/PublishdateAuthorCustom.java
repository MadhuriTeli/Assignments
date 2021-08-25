package custom_ordering;

import java.util.Comparator;

import com.core.app.Book;

public class PublishdateAuthorCustom implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		int result = o1.getPublishDate().compareTo(o2.getPublishDate());
		if (result == 0)
			result = o1.getAuthor().compareTo(o2.getAuthor());
		return result;
	}

}