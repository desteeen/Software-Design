public class Input {
    private String first,last,title,nickname,email,display,format;

    public Input( String first, String last, String title, String nickname, String email, String display, String format){
        this.first = first;
        this.last = last;
        this.title = title;
        this.nickname = nickname;
        this.email = email;
        this.display = display;
        this.format = format;
    }

    public Input() {

    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Input{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", title='" + title + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", display='" + display + '\'' +
                ", format='" + format + '\'' +
                '}';
    }
}
