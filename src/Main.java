import java.util.Scanner;

public class Main {
    public static Thread main;
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        main  = Thread.currentThread();
        int i=1;
        while (i>0){
            System.out.println("Choose Option");
            System.out.println("1.Play");
            System.out.println("2.Pause");
            System.out.println("3.Next");
            System.out.println("4.Previous");
            System.out.println("5.Exit");

            int choose = sc.nextInt();
           switch (choose){
               case 1:
                   Play play1 = new Play();
                   Play play2 = new Play();
                   Play play3 = new Play();

                   play1.start();
                   play2.start();
                   play3.start();

                   play1.join();
                   play2.join();
                   play3.join();
                   break;
               case 2:
                   Pause pause1 = new Pause();
                   Pause pause2 = new Pause();
                   Pause pause3 = new Pause();

                   pause1.start();
                   pause2.start();
                   pause3.start();

                   pause1.join();
                   pause2.join();
                   pause3.join();
                   break;
               case 3:
                   Next next1 = new Next();
                   Next next2 = new Next();
                   Next next3 = new Next();

                   next1.start();
                   next2.start();
                   next3.start();

                   next1.join();
                   next2.join();
                   next3.join();
                   break;
               case 4:
                   Previous previous1 = new Previous();
                   Previous previous2 = new Previous();
                   Previous previous3 = new Previous();

                   previous1.start();
                   previous2.start();
                   previous3.start();

                   previous1.join();
                   previous2.join();
                   previous3.join();

                   break;
               case 5:
                   i=-1;
           }
        }
    }
}
