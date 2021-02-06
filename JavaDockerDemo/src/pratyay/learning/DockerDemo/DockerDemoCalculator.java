/**
 * 
 */
package pratyay.learning.DockerDemo;

/**
 * @author praty
 *
 */
public class DockerDemoCalculator {
	
	int addoutPut=0;
	int suboutPut=0;
	int muloutPut=0;
	public int add(int a, int b)
	{
		addoutPut=a+b;
		return addoutPut;
	}
	public int sub(int a, int b)
	{
		if(a > b) {
			suboutPut= a-b;
		}else if (b > a) {
			suboutPut=b-a;
		}
		return suboutPut;
	}
	public int multiply(int a, int b)
	{
		muloutPut=a*b;
		return muloutPut;
	}
}
