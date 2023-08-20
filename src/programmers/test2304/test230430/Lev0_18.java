/*
문제 설명

머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다. 예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.

정수 M, N이 매개변수로 주어질 때, M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 return 하도록 solution 함수를 완성해보세요.

제한사항

0 < M, N < 100
종이를 겹쳐서 자를 수 없습니다.
 */

package programmers.test2304.test230430;

public class Lev0_18 {

	public static void main(String[] args) {
		Lev0_18 lev = new Lev0_18();

		System.out.println(lev.solution(2, 2));
		System.out.println(lev.solution(2, 5));
		System.out.println(lev.solution(1, 1));

	}

	public int solution(int M, int N) {
		return (N-1)+N*(M-1);
	}

}
