package io.github.Bar7oszD.todo;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tasks")
class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Title must not be empty")
    @Size(min=5, max=50, message = "Tytuł musi mieć od 5 do 50 znaków")
    private String title;
    @Size(max=300, message = "Opis nie może być większy niz 300 znaków")
    private String description;
    private boolean completed;

    public Todo(){
    }

    public int getId() {
        return id;
    }

    void setId(final int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    void setTitle(final String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    void setDescription(final String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    void setCompleted(final boolean completed) {
        this.completed = completed;
    }

    public void markAsComplited(){
        if(!this.completed){
            this.completed = true;
            System.out.println("Oznaczono jako ukończone");
        }
    }
}
