import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter odd number of rounds");
        int rounds = scanner.nextInt();
        if (rounds % 2 ==0){
            System.out.println("Please enter an odd number of rounds.");
            return;
        }

        String name, move, name2, move2;
        int hp, power, speed, hp2,power2,speed2;

        System.out.println("Enter in  character 1's name.");
         name = scanner.next();

        System.out.println("Enter in  character 1's Hit points.");
         hp = scanner.nextInt();

        System.out.println("Enter in  character 1's move.");
         move = scanner.next();

        System.out.println("Enter in  character 1's move power.");
         power = scanner.nextInt();

        System.out.println("Enter in  character 1's attack speed.");
         speed = scanner.nextInt();

        System.out.println("Enter in  character 2's name.");
        name2 = scanner.next();

        System.out.println("Enter in  character 2's Hit points.");
        hp2 = scanner.nextInt();

        System.out.println("Enter in  character 2's move.");
        move2 = scanner.next();

        System.out.println("Enter in  character 2's move power.");
        power2 = scanner.nextInt();

        System.out.println("Enter in  character 2's attack speed.");
        speed2 = scanner.nextInt();



        for (int i = 1; i <= rounds; i++){
            System.out.println("Round " + rounds + ":");

            if (speed > speed2){
                battle()
            }


        }
    }
    public static void battle(attacker, defender,random, player1Wins){
        
    }
}
