public class Test
{
	int id;
	double total;
	static int code=7542;
	
Test (int a,double b)
{
	id=a;
	total=b;

}
void display()
{
	System.out.println("Id:"+id);
	System.out.println("Total:"+total);
	System.out.println("Code:"+code);

}
public static void main(String[]args)
{
	Test t1=new Test(1,100.0);
	t1.display();
	Test t2=new Test(2,98.0);
	t2.display();
	Test t3=new Test(3,99.0);
	t3.display();
	t3.total=100.0;
	Test.code=6742;
	t3.display();

}
	
	
}