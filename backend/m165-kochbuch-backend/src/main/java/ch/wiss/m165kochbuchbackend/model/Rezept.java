package ch.wiss.m165kochbuchbackend.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rezept")
@Getter
@Setter
public class Rezept {
    @Id
    private String id;
    private String name;
    private String description;
    private String ingredients;
    private String instructions;
}
