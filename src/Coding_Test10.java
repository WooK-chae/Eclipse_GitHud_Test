import java.util.Scanner;

/*
Q10. while문을 사용하여, Scanner 클래스 활용
보고 싶은 구구단의 단을 입력(예시 : 7)하면,
다음의 결과 화면과 같이 해당하는 구구단이 출력되는
자바 프로그램을 제작해 보시기 바랍니다.

[결과 화면]

보고 싶은 구구단의 단을 입력해 주시기 바랍니다 ==> 7
7 X 1 = 7
7 X 2 = 14
7 X 3 = 21
7 X 4 = 28
7 X 5 = 35
7 X 6 = 42
7 X 7 = 49
7 X 8 = 56
7 X 9 = 63
*/

public class Coding_Test10{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("보고싶은 구구단의 단을 입력해 주시기 바랍니다===> ");
		int dan = scan.nextInt();
		int i = 1, j = 1;
		System.out.println(dan + "단");
		while (i <= 9) {
			j = dan*i;
			System.out.println(dan + "x" + i + "= " + j);
			i++;
		}
		scan.close();
	}
}

