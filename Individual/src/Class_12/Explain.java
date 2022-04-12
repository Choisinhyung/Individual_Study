package Class_12;

public class Explain {
/*
 * 상속예제 순차적 풀이

부모클래스 score는 점수만 가지는 객체로 0 ~ 100사이의 값을 설정한다

private double point //점수

getter/setter 작성하고 값을 설정은 setter에 한다.

public double getPoint() {
return this.point; }

public void setPoint(double point) {
if(point >= 0 && point <= 100) {
this.point = point; } }

자식클래스 Grade에는 점수와 등급정보를 가진다.

private char level; //등급

//등급정보를 같이 저장해야함 setter에~

@오버라이딩
public void setPoint(double point) {
//먼저 등급을 설정한다. (배열)
char[] rank = new char[] { 'F', 'F', 'F', 'F', 'E', 'E', 'D', 'C', 'B', 'A','A' }; //배열의 각 인덱스에 등급저장
//배열의 각 인덱스에 0~40까지는 f등급 이런식으로 저장해야 한다. 즉 rank[0] = 'F'; = 0점
//이제 설정한 점수를 불러와야하기 때문에 score클래스의 point값이 설정된 것을 가져온다
super.setPoint(point) - 매개변수 point가 super.setPoint의 점수에 저장된다
//Grade클래스의 등급정보(level)에 rank배열 저장
this.level = rank[(int)(this.getPoint()) / 10];  // 랭크배열의 인덱스범위는 0~100사이의 값을 각 10으로 나눈 것 0~10

자 이제 상속클래스가아닌 별개의 subject클래스를 생성해보자

//과목 정보를 가지는 클래스, - 과목에는 Grade클래스를 포함시켜야 한다.

private String name; // 과목 이름
private Grade grade; // Grade클래스타입의 grade멤버변수 - 즉 grade를 포함시킨다.

public Subject(String name) { //매개변수가 있는 생성자 - 객체를 생성시켜 과목 이름을 지정
this.name = name; } 

public Subject(String name, double point) { // 과목이름과 점수 지정
this.name = name;  // 과목이름에는 입력한 과목이름이 그대로 들어가고
this.grade = new Grade(point); }  // 멤버변수인 grade에는 Grade객체를 생성하여 값은 매개변수인 double point를 저장한다.
//subject클래스에 grade를 포함시킬때는 어떻게 하는지 잘 체크할 것.

Grade클래스의 매개변수 있는 생성자를 보면 point점수가 Score클래스의 setPoint를 가르키고 있음. 즉 점수의 설정값을 가르킴
즉 과목에 점수를 설정!

자 이제 메인클래스로 가서 객체를 생성하여 출력해보자~

Subject s1 = new Subject("국어");
Subject s2 = new Subject("영어", 78.3);

print - s1.getName(); - 국어
print - s2.getName(); - 영어
System.out.println(s2.getGrade()); - Grade클래스의 toString에 입력한 값이 출력됨. 왜? subject클래스의 grade에 Grade객체를
생성해서 점수를 설정했기 때문.

System.out.println(s2.getGrade().getPoint()); - 78.3이 출력이됨
Grade클래스의 toString값에서 getPoint값 가져오기
 */
}
