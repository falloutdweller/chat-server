package telran.chat.model;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Message implements Serializable {
    @Serial
    private static final long serialVersionUID = 20250522L;
    private final String nickname;
    private LocalTime time;
    private String message;

    public Message(String nickname, String message) {
        this.nickname = nickname;
        time = LocalTime.now();
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void UpdateTime() {
        time = LocalTime.now();
    }

    @Override
    public String toString() {
        return nickname + " " + time.format(DateTimeFormatter.ofPattern("HH:mm")) + ": " + message;
    }
}