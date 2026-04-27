package hw.ch10;

public class Main {
    public static void main(String[] args) {
        // 1. 플레이어 설정 (과제 지정 이름: Taro, Bob)
        System.out.println("===== RandomStrategy =====");
        Player player1 = new Player("Taro", new RandomStrategy(0));

        System.out.println("\n===== CyclicStrategy =====");
        Player player2 = new Player("Bob", new CyclicStrategy());

        // 2. CyclicStrategy 순환 확인 (과제 요구사항: 9번 출력)
        System.out.println("CyclicStrategy 의 손가락 순환:");
        Strategy cyclic = new CyclicStrategy();
        for (int i = 0; i < 9; i++) {
            Hand hand = cyclic.nextHand();
            System.out.println((i + 1) + "번째: " + hand);
            cyclic.study(false); // 호출해도 결과에 영향 없음
        }

        // 3. 게임 진행 (과제 요구사항: 10라운드)
        System.out.println("\n===== Game Start (10 rounds) =====");
        for (int i = 0; i < 10; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + player1.getName());
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner: " + player2.getName());
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }

        // 4. 최종 결과 출력
        System.out.println("\nTotal result:");
        System.out.println(player1);
        System.out.println(player2);
    }
}