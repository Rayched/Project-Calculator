//계산기 프로그램 만들기 프로젝트
//간단한 사칙연산 가능한 계산기
//버전: 1.0
//개발 일자: 2022.12.05

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("=== 프로그램 시작 ===");
            Scanner sc = new Scanner(System.in);
            System.out.printf("숫자: ");
            int alpha = sc.nextInt();
            sc.nextLine();
            System.out.printf("연산 선택: ");
            String count = sc.nextLine();
            System.out.printf("숫자: ");
            int beta = sc.nextInt();
            if(count.equals("+")){
                System.out.printf("입력한 숫자: %d\n", alpha);
                System.out.printf("입력한 숫자: %d\n", beta);
                System.out.printf("결과 값: %d\n", alpha + beta);
            }
            else if(count.equals("-")){
                System.out.printf("입력한 숫자: %d\n", alpha);
                System.out.printf("입력한 숫자: %d\n", beta);
                System.out.printf("결과 값: %d\n", alpha - beta);
            }
            else if(count.equals("*")){
                System.out.printf("입력한 숫자: %d\n", alpha);
                System.out.printf("입력한 숫자: %d\n", beta);
                System.out.printf("결과 값: %d\n", alpha * beta);
            }
            else if(count.equals("/")){
                System.out.printf("입력한 숫자: %d\n", alpha);
                System.out.printf("입력한 숫자: %d\n", beta);
                System.out.printf("결과 값: %d\n", alpha / beta);
            }
            else if(count.equals("exit")){
                System.out.println("=== 프로그램 종료 ===");
                sc.close();
                break;
            }
            else {
                System.out.println("잘못된 입력 값 입니다.");
            }
        }
    }
}