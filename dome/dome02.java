public class dome02
{
	public static void main(String[] args){
		int score = 59;
		if (score >= 60)//logic expression�߼����ʽΪtrue��ʱ��ִ��statements��䣨������Ϊ�����
		{
			System.out.println("����");
			System.out.println("����");
		}else{
			System.out.println("������");
		}
		System.out.println("�����if����������");
		int score1 = 87;
		if (score1 >= 80)
		{
			System.out.println("����");
		}else if (score1>=70 && score<80)
		{
			System.out.println("����");
		}else if (score1>=60 && score1<70)
		{
			System.out.println("����");
		}else{
			System.out.println("������");
		}
		int age = 31;
		if (age > 20)
		{//������Ҳ�д���飬Ҳ������ִ���壬����������������������䣬Ҫô��ִ�У�Ҫô����
			System.out.println("�����������20");
			System.out.println("20��Ӧ�ö��óе�������");
		}
		int age1 = 21;//�����������ֻ��һ����䣬��ô�����ſ���ʡ��
		if (age1 >= 20) System.out.println("�������ˣ�");
		System.out.println("------------Switch----------");
		char sex = 'm';
		switch (sex)
		{
		case '��':
			System.out.println("��λͬѧ������");
			System.out.println("������");
		break;//����
		case 'Ů':
			System.out.println("��λͬѧ��Ů��");
		break;
		default:
			System.out.println("���в�Ů");
		break;
		}
		//while��do...whileѭ��
		System.out.println("----------while---------");
		int i = 10;
		while (i < 16)//while ���жϣ���ִ��
		{
			System.out.println("�ظ�����������");
			i++;
		}
		int a = 3;
		do//do...while ����ִ��һ�Σ����ж�
		{
			System.out.println("��������������");
			a++;
		}while (a >= 3 && a < 6);
		System.out.println("------------forѭ��--------------");
		//�Ա�while��forѭ�������ʮ�Ρ����ú�ѧϰ��
		int i0 = 0;
		while (i0 < 10)
		{
			System.out.println((i0+1)+":�ú�ѧϰ��");
			i0++;
		}
		//for ѭ��
		for (int j = 0;j < 10 ;j++ )//�����ڳ�ʼ��������ֱ�Ӷ������
		{
			System.out.println((j+1)+"���ú�ѧϰ�����ͣ�");
		}
		//����1+2+...+100
		//����һ��������
		int sum = 0;
		for (int i1=1;i1<=100 ;i1++ )
		{
			sum += i1;
		}
		System.out.println(sum);
		//����������˹��
		int sum1 = 0;
		for (int j1=1;j1<=50 ;j1++ )
		{
			sum1 += 101;
		}
		System.out.println("1...100�ĺ�="+sum1);
		System.out.println("---------��ϰ��ȡ�ַ���---------");
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
		System.out.println("---------������----------");
		//�ڿ���̨���һ��ֱ��������
		//���ѭ����������
		for (int b = 0;b<7 ;b++ )
		{	//ÿ�У��ȴ�ӡ�ո�
			for (int c = b;c<6 ;c++ )
			{
				System.out.print(" ");//û��ln��ʾ������
			}
			//ÿ�У����ӡ*
			for (int e = 0;e<=b ;e++ )
			{
				System.out.print("*");
			}
			System.out.println();//����
		}
		System.out.println("----------����������-----------");
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
		System.out.println("--------���ŵ�ֱ��������-----------");
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
		System.out.println("-------------��ײ��-----------------");
		//1!+2!+3!...+10!
		int sum3 = 0;
		//���ѭ��,���ƽײ���
		for (int i2=1;i2<=10 ;i2++ )
		{
			int s3 = 1;//��������ÿ��ѭ�����õĽײ���
			//��ѭ������׳�
			for (int j1=1;j1<=i2;j1++ )
			{
				s3 *= j1;
			}
			System.out.println(i2+"�Ľ׳���:"+s3);
			sum3 += s3;
		}
		System.out.println("�׳˵ĺ�="+sum3);
		System.out.println("----------------��ӡһ���žų˷���-----------------");
		//���ѭ�����Ƴ˷�������Ϊ��
		for (int r = 1;r<=9 ;r++ )
		{
			//�ڲ�ѭ����������
			int result;//ʲô���������Ϊ0
			for (int y = 1;y<=r ;y++ )
			{
				result = r * y;
				System.out.print(y+"x"+r+"="+result+"\t");
			}
			System.out.println();//����
		}
		System.out.println("-----------breakǿ�н���ѭ��------------");
		//����1
		for (int i7 = 1;i7<=6 ;i7++ )
		{
			if (i7==3)
			{
				break;
			}
			System.out.println(i7);
		}
		/*��������break�������Խ������ڵ�ѭ��������Ƕ��ѭ��ʱ�������Խ������ѭ����
		      ��ǩҪ�ŵ�ѭ�������ǰ��!��ǩ�����:��,��break����������ǩ*/
		outer:
		for (int x = 1;x<=10 ;x++ )
		{
			System.out.println("���ѭ����x��"+x);
			for (int x1 = 11;x1 <= 20 ;x1++ )
			{
				if (x1==15)
				{
					break outer;//��ǩ
				}
				System.out.println("    �ڲ�ѭ����x1��"+x1);
			}
		}
		System.out.println("----------continue����������ѭ��-----------");
		for (int n = 1;n<=5 ;n++ )
		{
			if (n==2)
			{
				continue;//n����2ʱ������ִ���·�����䣬����ִ��n����3��4������
			}
			System.out.println(n);
		}
		System.out.println("----------return�����������ĺ�-------------");
		int v = add(10,20);
		System.out.println(v+1);
	}
	public static int add(int a,int b){
		return a + b;//���巽���ĸ���Ŀ�ģ���Ϊ�����ø�����ͬ�Ĵ��루����װ��
	}
}