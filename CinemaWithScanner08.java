import java.util.Scanner;
public class CinemaWithScanner08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String[][] audience = new String[4][2];

        System.out.println("----- Menu Cinema ----- ");
        System.out.println("1.Input audience data ");
        System.out.println("2.Show audience list ");
        System.out.println("3.Exit ");

       

        while (true){
            System.out.print("Select Menu: ");
            int  Menu = sc.nextInt();
            if  (Menu == 1) {
                System.out.println("--- Input audience --- ");
                while(true) {
                  System.out.print(" Enter a name:");
                  String name = sc.next();
                  System.out.print("Enter row number (1-4): ");
                  int row = sc.nextInt();
                  System.out.print("enter column number(1-2): ");
                  int column =sc.nextInt();

                  if (row < 1 || row > 4 || column < 1 || column > 2) {
                    System.out.print("The seat row / column is not available. ");
                    continue;
                  } while (true) {
                    if (audience[row - 1][column - 1] == null) {
                        break;

                    }else if (audience[row - 1][column - 1] != null){
                        System.out.println("Seat is already occupied by other audiences. ");
                        System.out.print("Enter row number (1-4): ");
                        row = sc.nextInt();
                        System.out.print("Enter column number (1-2) ");
                        column = sc.nextInt();
                    }
                  }
 

                    audience[row - 1][column - 1] = name;
                    System.out.print("Are there any other audiendes to be added? (y/n): ");
                     String next = sc.next();
        
                    if(next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
        
                } else if (Menu == 2) {
                    System.out.println("----- Audience list ----- ");
                    for (int i = 0; i < audience.length; i++){
                        System.out.print("Audience in the row " + (i + 1) + " : " );
                        for (int j = 0; j < audience[i].length; j++) {
                            if (audience[i][j] == null) {
                                System.out.print("*** ");
                            }else{
                                System.out.print(audience[i][j]);
                            }
                            if (j < audience[i].length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    }
        
                }else if (Menu == 3) {
                    break;
        
                }else {
                    System.out.println("Invalid menu !!");
                }


        }

    }
}