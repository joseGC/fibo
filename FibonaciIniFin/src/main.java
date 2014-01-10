import java.util.Scanner;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ini,fin,fibo1,fibo2;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el inicio");
		ini = leer.nextInt();
		System.out.println("Ingrese el fin");
		fin = leer.nextInt();
		
		fibo1 = 1;
        fibo2 = 1;

        if (ini == 1)
        {
            System.out.print(fibo1 + " ");
        }

        for (int i = 2; fibo2 <= fin; i++)
        {
            if (ini <= fibo2)
            {
                    System.out.print(fibo2 + " ");
            }

            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        
        System.out.println("\nNumeros pares");
        fibo1 = 1;
        fibo2 = 1;

        if (ini == 1)
        {
            System.out.print(fibo1 + " ");
        }

        for (int i = 2; fibo2 <= fin; i++)
        {
            if (ini <= fibo2)
            {
                if (fibo2 % 2 == 0)
                {
                    System.out.print(fibo2 + " ");
                }
            }

            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
			

	}

}
