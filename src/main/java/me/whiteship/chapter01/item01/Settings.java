package me.whiteship.chapter01.item01;

/**
 * 이 클래스의 인스턴스는 #getInstance()를 통해 사용한다.
 * @see #getInstance()
 */
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    private Settings() {}

    private static final Settings SETTINGS = new Settings();

    // 정적 팩터리 메서드는 상속을 제공하지않는다.
    // 여기서만 인스턴스를 통제한다. 플라이웨이트 패턴은 필요한 값만 꺼내서 사용하는 패턴이다.
    public static Settings getInstance() {
        return SETTINGS;
    }

}
