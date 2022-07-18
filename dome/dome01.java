public class dome01
{		//程序执行入口main方法
	public static void main(String[] args){
		//java命令会逐步执行编写的代码
		System.out.println("------类型的转化---------");
		byte a = 12;
		short b = a;//a这个变量是byte这个类型的变量，12这个数据就是a的值。
		System.out.println(a);//这个是自动类型的转化，小数值转大数值
		int i = 'a';//强制类型转化,因为有对应的ASCII码
		System.out.println(i);
		String str = "123";//字符串需要用双引号，“123”是字符串，不是一个整数
		int d = 1;
		System.out.println(d+1);
		System.out.println(str+d);//将d也看成是字符串
		int stri = Integer.parseInt(str);//Integer类里面的parseInt方法将字符串转化为int
		System.out.println(stri+d);
		//把int转String字符串
		int i1 = 777;
		System.out.println(i1+"");//把一个数+一个""(空字符串）可以转化为字符串

		System.out.println("张三说：\"你好!\" ");//这里的\是转义字符
System.out.println("-------比较运算---------");
		System.out.println(4<2);
		System.out.println(12==12);
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1==s2);//字符串比较的是栈里面的地址，而内容实在堆里
		System.out.println(s1.equals(s2));//字符串用equals比较，比较的是堆中的内容
System.out.println("---------逻辑运算----------");
		//与运算 & &&
		System.out.println((1>2)&&(2>1));
		System.out.println(true&&true);
		//或运算符 | ||
		System.out.println(true||false);
		//非 ！
		System.out.println(!true);
		//异或 ^
		System.out.println(true ^ false);
		System.out.println("---------位运算-----------");
		//左移运算符 <<
		int i7 = 12;
		i7 = i7<<1;
		System.out.println(i7);//m向左移n，m=m*2^n.
		//位运算 右移运算符 >>   >>>(无符号右移，这个不管最高位，都补零)
		int i8 = 12;
		i8 = i8>>2;//右移的最高位是符号位，1为正，0为负
		System.out.println(i8);
		//& 与运算（|| 或运算，! 非运算同理）
		int i9 = 10;
		int i5 = 7;
		i9 = i9&i5;
		System.out.println(i9);
		System.out.println("------两数交换--------");
		int e1 = 10;
		int e2 = 20;
		//要求交换e1和e2的数值
		//方法一：增加第三个变量
		int c;
		c = e1;
		e1 = e2;
		e2 = c;
		System.out.println("e1="+e1+"---e2="+e2);
		//方法二：不增加变量
		int d1 = 7;
		int d2 = 9;
		d1 = d1+d2;
		d2 = d1-d2;
		d1 = d1-d2;
		System.out.println("d1="+d1+"---d2="+d2);
		//方法三：用异或^  n^m^m=n
		int z1 = 36;
		int z2 = 8;
		z1 = z1^z2;
		z2 = z1^z2;//z1^z2^z2=z1
		z1 = z1^z2;
		System.out.println("z1="+z1+"---z2="+z2);
		System.out.println("-------三元运算符(条件运算符)---------");
		int score = 61;
		String result = (score>=60)?"及格":"不及格";
		System.out.println(result);
	}
}