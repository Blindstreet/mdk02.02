package task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Post {
    private String title;                     // заголовок
    private String content;                   // содержание
    private String[] tags;                    // теги
    private ArrayList<PostComment> comments;  // комментарии

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public void setComments(ArrayList<PostComment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", content.length='" + (content != null ? content.length() : 0) + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", comments=" + comments +
                '}';
    }
}
