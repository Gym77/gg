public class dome02
{
	public static void main(String[] args){
		int score = 59;
		if (score >= 60)//logic expression逻辑表达式为true的时候执行statements语句（语句可以为多个）
		{
			System.out.println("及格");
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
		System.out.println("这个是if语句后面的语句");
		int score1 = 87;
		if (score1 >= 80)
		{
			System.out.println("优秀");
		}else if (score1>=70 && score<80)
		{
			System.out.println("良好");
		}else if (score1>=60 && score1<70)
		{
			System.out.println("及格");
		}else{
			System.out.println("不及格");
		}
		int age = 31;
		if (age > 20)
		{//花括号也叫代码块，也称条件执行体，花括号括起来的是整个语句，要么都执行，要么都不
			System.out.println("您的年龄大于20");
			System.out.println("20岁应该懂得承担与责任");
		}
		int age1 = 21;//如果花括号里只有一条语句，那么花括号可以省略
		if (age1 >= 20) System.out.println("您长大了！");
		System.out.println("------------Switch----------");
		char sex = 'm';
		switch (sex)
		{
		case '男':
			System.out.println("这位同学是男性");
			System.out.println("力量大");
		break;//跳出
		case '女':
			System.out.println("这位同学是女孩");
		break;
		default:
			System.out.println("不男不女");
		break;
		}
		//while与do...while循环
		System.out.println("----------while---------");
		int i = 10;
		while (i < 16)//while 先判断，后执行
		{
			System.out.println("重复就是力量，");
			i++;
		}
		int a = 3;
		do//do...while 至少执行一次，后判断
		{
			System.out.println("数量堆死质量！");
			a++;
		}while (a >= 3 && a < 6);
		System.out.println("------------for循环--------------");
		//对比while与for循环，输出十次——好好学习！
		int i0 = 0;
		while (i0 < 10)
		{
			System.out.println((i0+1)+":好好学习！");
			i0++;
		}
		//for 循环
		for (int j = 0;j < 10 ;j++ )//可以在初始化条件里直接定义变量
		{
			System.out.println((j+1)+"：好好学习，加油！");
		}
		//计算1+2+...+100
		//方法一：笨方法
		int sum = 0;
		for (int i1=1;i1<=100 ;i1++ )
		{
			sum += i1;
		}
		System.out.println(sum);
		//方法二：高斯法
		int sum1 = 0;
		for (int j1=1;j1<=50 ;j1++ )
		{
			sum1 += 101;
		}
		System.out.println("1...100的和="+sum1);
		System.out.println("---------练习截取字符串---------");
		String infor = "Thinking in JAVA";
		for (String s = infor.substring(0);s.length()>0 ;s = s.substring(2) )
		{
			System.out.println(s);
		}
		//
		String s1 = "******";
		for (String s2 = s1.substring(0);s2.length()>0 ;s2 = s2.substring(1) )
		{
			System.out.println(s2);
		}
		System.out.println("---------三角形----------");
		//在控制台输出一个直角三角形
		//外层循环控制行数
		for (int b = 0;b<7 ;b++ )
		{	//每行，先打印空格
			for (int c = b;c<6 ;c++ )
			{
				System.out.print(" ");//没有ln表示不换行
			}
			//每行，后打印*
			for (int e = 0;e<=b ;e++ )
			{
				System.out.print("*");
			}
			System.out.println();//换行
		}
		System.out.println("----------等腰三角形-----------");
		for (int f = 0;f<5 ;f++ )
		{
			for (int t = f;t<4 ;t++ )
			{
				System.out.print(" ");
			}
			for (int h = 0;h<=f*2 ;h++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("--------倒着的直角三角形-----------");
		for (int f1 = 0;f1<6 ;f1++ )
		{
			for (int t1=f1;t1<5 ;t1++ )
			{
				System.out.print("*");
			}
			for (int h1 = 0;h1<f1 ;h1++ )
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("-------------求阶层和-----------------");
		//1!+2!+3!...+10!
		int sum3 = 0;
		//外层循环,控制阶层数
		for (int i2=1;i2<=10 ;i2++ )
		{
			int s3 = 1;//用来接收每次循环所得的阶层结果
			//子循环计算阶乘
			for (int j1=1;j1<=i2;j1++ )
			{
				s3 *= j1;
			}
			System.out.println(i2+"的阶乘是:"+s3);
			sum3 += s3;
		}
		System.out.println("阶乘的和="+sum3);
		System.out.println("----------------打印一个九九乘法表-----------------");
		//外层循环控制乘法表行数为九
		for (int r = 1;r<=9 ;r++ )
		{
			//内层循环，控制列
			int result;//什么都不输就是为0
			for (int y = 1;y<=r ;y++ )
			{
				result = r * y;
				System.out.print(y+"x"+r+"="+result+"\t");
			}
			System.out.println();//换行
		}
		System.out.println("-----------break强行结束循环------------");
		//案列1
		for (int i7 = 1;i7<=6 ;i7++ )
		{
			if (i7==3)
			{
				break;
			}
			System.out.println(i7);
		}
		/*案例二，break不仅可以结束所在的循环，如果是多层循环时，还可以结束外层循环，
		      标签要放到循环语句最前面!标签后跟“:”,在break后面跟这个标签*/
		outer:
		for (int x = 1;x<=10 ;x++ )
		{
			System.out.println("外层循环的x："+x);
			for (int x1 = 11;x1 <= 20 ;x1++ )
			{
				if (x1==15)
				{
					break outer;//标签
				}
				System.out.println("    内层循环的x1："+x1);
			}
		}
		System.out.println("----------continue结束本单次循环-----------");
		for (int n = 1;n<=5 ;n++ )
		{
			if (n==2)
			{
				continue;//n等于2时，不会执行下方的语句，但会执行n等于3、4。。。
			}
			System.out.println(n);
		}
		System.out.println("----------return返回两个数的和-------------");
		int v = add(10,20);
		System.out.println(v+1);
	}
	public static int add(int a,int b){
		return a + b;//定义方法的根本目的：是为了能让复用相同的代码（即封装）
	}
}