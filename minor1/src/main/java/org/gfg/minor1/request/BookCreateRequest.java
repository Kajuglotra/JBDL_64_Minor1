package org.gfg.minor1.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.gfg.minor1.model.Author;
import org.gfg.minor1.model.Book;
import org.gfg.minor1.model.BookType;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookCreateRequest {
    @NotBlank(message = "book name must not be blank")
    private String name;

    @NotBlank(message = "book No must not be blank")
    private String bookNo;
    @Positive
    private Integer cost;
    private BookType type;
    private String authorName;
    private String authorEmail;

    public Author toAuthor() {
        return Author.builder().
                name(this.authorName).
                email(this.authorEmail).
                build();
    }

    public Book toBook() {
        return Book.builder().
                name(this.name).
                bookNo(this.bookNo).
                cost(this.cost).
                type(this.type).
                build();
    }
}
