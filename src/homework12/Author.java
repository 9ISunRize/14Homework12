package homework12;

import java.util.Objects;

public class Author {
    private final String authorName;
    private final String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {

        return this.authorName;
    }

    public String getAuthorSurname() {

        return this.authorSurname;
    }
    public String toString (){
        return authorSurname + authorSurname;
    }
    public int hashCode (){
        return Objects.hash(authorName, authorSurname);
    }
    public boolean equals(Object o){
    if (this == o) return true;
    if ( o == null || getClass() != o.getClass()) return false;
    Author author = (Author) o;
    return Objects.equals(authorName, author.authorName) && Objects.equals(authorSurname, author.authorSurname);
    }
}


