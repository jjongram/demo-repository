package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				int N = sc.nextInt(); int K = sc.nextInt();

				int n[] = {

						1, 5, 10, 50, 100, 500, 1000, 5000, 10000, 50000

				};

				for(int i = 0; i < N; i++) {

					System.out.println(n[i]);

				}

				

				int cnt = 0;

				int h = 0;

				for(int i = N-1; i >= 0 ; i--) {

					if (K % n[i] == K) {

						continue;

					} else if (K % n[i] == 0) {

						cnt += K / n[i];

						System.out.println(cnt);

						break;

					} else {

						h = K / n[i];

						cnt += h;

						System.out.println(K + "원" + n[i] + "로 나누기");

//						System.out.println(cnt);

						K = K - h * n[i];

					}

				}

				

				

			}

		

		}
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int k = sc.nextInt();
//		int[] arr = new int[n];
//		int s = 0;
//		for(int i = 0; i < arr.length; i++) {
//			arr[i]=sc.nextInt();
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		for(;k>0;) {
//			for(int i = 0; i < arr.length; i++) {
//				if(k-arr[n-1-i]>0) {
//					k=k-arr[n-1-i];
//					s+=1;
//					System.out.printf("k = %d\ns = %d", k, s);
//				} if(k-arr[n-1-i]<0) {
////					break;
//				}
//			}break;
//		}
//		System.out.println(s);
	


