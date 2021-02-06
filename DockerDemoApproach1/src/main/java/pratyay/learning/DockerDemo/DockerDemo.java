/**
 * 
 */
package pratyay.learning.DockerDemo;

/**
 * @author praty
 *
 */
public class DockerDemo {

	
	public static void main(String[] args)
	{
		DockerDemoCalculator ddc= new DockerDemoCalculator();
		int output1=ddc.add(12,11);
		System.out.println("The added value is "+ output1);
		int output2=ddc.sub(12,11);
		System.out.println("The subbed value is "+ output2);
		int output3=ddc.multiply(12,11);
		System.out.println("The multiplied value is "+ output3);
	}
}
