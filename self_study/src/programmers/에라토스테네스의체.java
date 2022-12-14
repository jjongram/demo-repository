package programmers;

import java.util.ArrayList;
import java.util.Scanner;

public class 에라토스테네스의체 {

	public static void main(String[] args) {
		// ArrayList로 구현
		ArrayList<Boolean> primeList;

		// 사용자로부터의 콘솔 입력
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		// n <= 1 일 때 종료
		if(n <= 1) return;

		// n+1만큼 할당
		primeList = new ArrayList<Boolean>(n+1);
		// 0번째와 1번째를 소수 아님으로 처리
		primeList.add(false);
		primeList.add(false);
		// 2~ n까지 소수로 설정
		for(int i=2; i<=n; i++ )
			primeList.add(i, true);

		// 2부터  ~ i*i <= n
		// 각각의 배수들을 지워간다.
		for(int i=2; (i*i)<=n; i++){
			if(primeList.get(i)){
				for(int j = i*i; j<=n; j+=i) primeList.set(j, false);
				//i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
			}
		}
		StringBuffer sb = new StringBuffer();
		int cnt = 0;
		for(int i=0; i<=n; i++){
			if(primeList.get(i) == true){
				sb.append(i);
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
