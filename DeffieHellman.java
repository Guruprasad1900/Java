import java.util.*;
class DeffieHellman{

	
	private static long power(long a, long b, long p)
	{
		if (b == 1)
			return a;
		else
			return (((long)Math.pow(a, b)) % p);
	}

	
	public static void main(String[] args)
	{
		long P, G, x, a, y, b, ka, kb;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The value of Q(prime number):");
		P=sc.nextInt();
		System.out.println("The value of Q:" + P);

		
		System.out.println("Enter The value of Alpha(primitive root):");
		G=sc.nextInt();
		System.out.println("The value of Alpha:" + G);


		System.out.println("Enter The private key for Alice:");
		
		a = sc.nextInt();
		System.out.println("The private key  for Alice:"
						+ a);

		
		x = power(G, a, P);

		System.out.println("Enter The private key for Bob:");
		
		b = sc.nextInt();
		System.out.println("The private key b for Bob:"
						+ b);

		
		y = power(G, b, P);

		
		ka = power(y, a, P); // Secret key for Alice
		kb = power(x, b, P); // Secret key for Bob

		System.out.println("Secret key for the Alice is:"
						+ ka);
		System.out.println("Secret key for the Bob is:"
						+ kb);

		if(ka==kb)
		{
			System.out.println("deffie Hellman key Exchange algorithm succesfull"); 
		}
	}
}
