package builder;

import java.util.Date;

public final class Book {
    private final String code;
    private final String title;
    private final String genre;
    private final String author;
    private final String year;
    private final String desc;

    public Book(String code, String title, String genre, String author, String year, String desc) {
        this.code = code;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.year = year;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("code='").append(code).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", genre='").append(genre).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", year='").append(year).append('\'');
        sb.append(", desc='").append(desc).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
