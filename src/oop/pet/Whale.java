package oop.pet;

public class Whale {
//    int age; // 같은 패키지에 소속된 클래스에서 접근 가능
//    public static String back; // 클래스 변수
    private int age; // 인스턴스 변수
    private String name; // 인스턴스 변수

    // 생성자
    public Whale() {
        this(10);
    }
    public Whale(int age) {
        this(age, "John");
    }
    public Whale(int age, String name) {
        this.age = age;
        this.name = name;
    }


    // ---------- 메소드 ---------------
    public void swimming() {
        String test = "test"; // 지역 변수
        System.out.println("Swimming");
    }

    public int mySum(int a) {
        return a + 1;
    }
    public int mySum(int a, int b) {
        return a + b;
    }
    public long mySum(long a, long b) {
        return a + b;
    }
}
