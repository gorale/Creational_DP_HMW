package builder;

public class BookBuilder {
    private String code;
    private String title;
    private String genre;
    private String author;
    private String year;
    private String desc;

    public BookBuilder setCode(String code){
        this.code = code;
        return this;
    }

    public BookBuilder setTitle(String title){
        this.title = title;
        return this;
    }

    public BookBuilder setGenre(String genre){
        this.genre = genre;
        return this;
    }

    public BookBuilder setAuthor(String author){
        this.author = author;
        return this;
    }

    public BookBuilder setYear(String year){
        this.year = year;
        return this;
    }

    public BookBuilder setDesc(String desc){
        this.desc = desc;
        return this;
    }

    public Book build(){
        return new Book(code,title,genre,author,year,desc);
    }
}
