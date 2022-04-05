package Object_Instance;

public class Sample02 {
	
	// 참조변수의 형변환 : 사용할 수 있는 멤버의 갯수를 조절하는 것, 조상.자손 관계에서만 가능
	
	class Car{}
	
	class fireEngine extends Car{}
	class Ambulance extends Car{}
	
	fireEngine f = new fireEngine(); // fireEngine객체 생성해서 f에 저장
	
	Car c = (Car)f; // 참조변수 f의 값을 c에 저장 / 조상인 car타입으로 형변환 (클래스명)참조변수 - 조상 자손관계에서는
	
	fireEngine f2 = (fireEngine)c; // 참조변수 c의 값을 f2에 저장 / 참조변수 c를 자손인 fireEngine으로 형변환
	
//	Ambulance a = (Ambulance)f; // 형변환 불가
	
	//instance of 연산자
	// 참조변수의 형변환 가능여부 확인에 사용 / 가능하면 true반환
	
	//매개변수의 다형성
	

}
