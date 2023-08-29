
import java.util.Scanner;

//Q2. 범위 숫자들의 합계값을 구하고 싶은 양의 정수값을 Scanner 클래스를 활용하여 입력 받아서,
//     for문을 활용하여, 입력된 양의 정수값까지  합계값을 구하여
//     화면으로 표시해 주는 자바 프로그램을 제작해 보시기 바랍니다.
//     [실행 결과 예시(1) : Scanner 클래스 활용 5를 입력 받아서, 양의 정수값 변수명 inputInt에 5 대입 예시, 
//     문자열 표현 : "1부터 " + inputInt + "까지의 합 = ", 합계 결과값 변수명 hap,
//     1부터 5까지의 합 = 15]
//     [실행 결과 예시(2) : Scanner 클래스 활용 10을 입력 받아서, 양의 정수값 변수명 inputInt에 10 대입 예시, 
//     문자열 표현 : "1부터 " + inputInt + "까지의 합 = ", 합계 결과값 변수명 hap,
//     1부터 10까지의 합 = 55]

// [중요] 100번까지 for문으로 반복하여 합계값을 구할 경우, 92번까지 반복 자동 처리하는 Eclipse Breakpoints Hit count 설정 방법
// 1단계) Breakpoint를 설정하고 싶은 코드 줄에 마우스를 가져가서 왼쪽 여백을 더블 클릭하거나,
//       해당 코드 줄에서 마우스 오른쪽 버튼을 클릭하고 "Toggle Breakpoint"를 선택하여 Breakpoint를 설정합니다.
//       아래 예문 소스에서는 hap += i; 라인에 Breakpoint를 설정하면 됩니다.
// [주의 : 중요] main() 함수에는 Breakpoint를 설정하지 않습니다. 왜냐하면, Hit count는
//            해당 라인의 브레이크 포인트가 Hit count 만큼 실행된 이후 디버그 화면으로 이동하는 기능이기 때문입니다.
//       여기 예제 소스에서는 아래에서 44번 라인(hap += i;)와 47번 라인(System.out~)에 Breakpoint를 설정합니다.
// 2단계) hap += i; 라인에 Breakpoint를 설정하고, 마우스 오른쪽 버튼 클릭 - Toggle Breakpoint를 클릭합니다.
// 3단계) 그리고, "Breakpoint Properties..."를 선택하고,
//       새로 나타나는 대화 상자에서 "Hit count" 항목을 확인하고 그 옆에 있는 체크 박스를 클릭하여 활성화 합니다.
// 4단계) "Hit count" 입력 필드에 "92"를 입력 합니다. "OK" 버튼을 클릭하여 대화 상자를 닫습니다.
// 5단계) Java 파일 클릭 선택 - 마우스 우클릭 - Debug As - Java Application -
//       이제 해당 Breakpoint는 for문의 순환 중 hap += i; 코드가 92번 실행된 후에 디버거가 멈춥니다.
//       즉, i 값이 93이 될 때 디버깅 세션에서 코드 실행이 멈추게 됩니다.

public class Coding_Test02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("범위 숫자들의 합계값을 구하고 싶은 양의 정수값을 입력해 주세요 ==> ");

		int inputInt = scan.nextInt();
		
		// 합계값을 누적할 변수 hap을 선언하고, 0으로 초기화 처리합니다.
		int hap = 0;
		
		// for문을 활용하여, 인덱싱 변수 i의 변화값을 증가시켜 주면서 hap 변수값을 확인해 봅니다.
		for (int i = 1; i <= inputInt; i++) {
			hap += i;  // hap = hap + i;
		}
		
		System.out.println("1부터 " + inputInt + "까지의 합 = " + hap);
		
	}
}
