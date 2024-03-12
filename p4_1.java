import java.util.Scanner;
public class p4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite o ano de nascimento");
            int A = sc.nextInt();
            
            System.out.println("Digite o Mês de nascimento");
            int M = sc.nextInt();
            
            System.out.println("Digite o Dia de nascimento");
            int D = sc.nextInt();
            
            System.out.println("Digite o ano atual");
            int A_ = sc.nextInt();
            
            System.out.println("Digite o Mês atual");
            int M_ = sc.nextInt();

            System.out.println("Digite o Dia atual");
            int D_ = sc.nextInt();

                int IA = (A - A_)*365;
                int IM = (M - M_)*30;
                int ID = (D - D_);
                int ITD = (IA - IM - ID);
                   
                if (ITD < 0) {
                        int TD = ITD *-1;
                        System.out.print("Sua idade em dias é:");
                        System.out.println(TD);
                    }
                    else{

                      System.out.print("Sua idade em dias é:");
                    System.out.println(ITD);
                }                        }
                    
}