package main.java.dtos;

public class ToDoListItemDTO {
    private String id;
    private String content;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    public ToDoListItemDTO(String id, String content) {
        this.id = id;
        this.content = content;
    }
}
