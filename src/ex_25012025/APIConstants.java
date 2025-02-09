package ex_25012025;

public enum APIConstants {
    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dasHboard"),
    CHATBOTPAGE("https://app.vwo.com/chat");
private final String name;
    APIConstants(String name) {
        this.name=name;
    }
    public String getValue() {
        return name;
    }
}
