public class dome01
{		//����ִ�����main����
	public static void main(String[] args){
		//java�������ִ�б�д�Ĵ���
		System.out.println("------���͵�ת��---------");
		byte a = 12;
		short b = a;//a���������byte������͵ı�����12������ݾ���a��ֵ��
		System.out.println(a);//������Զ����͵�ת����С��ֵת����ֵ
		int i = 'a';//ǿ������ת��,��Ϊ�ж�Ӧ��ASCII��
		System.out.println(i);
		String str = "123";//�ַ�����Ҫ��˫���ţ���123�����ַ���������һ������
		int d = 1;
		System.out.println(d+1);
		System.out.println(str+d);//��dҲ�������ַ���
		int stri = Integer.parseInt(str);//Integer�������parseInt�������ַ���ת��Ϊint
		System.out.println(stri+d);
		//��intתString�ַ���
		int i1 = 777;
		System.out.println(i1+"");//��һ����+һ��""(���ַ���������ת��Ϊ�ַ���

		System.out.println("����˵��\"���!\" ");//�����\��ת���ַ�
System.out.println("-------�Ƚ�����---------");
		System.out.println(4<2);
		System.out.println(12==12);
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1==s2);//�ַ����Ƚϵ���ջ����ĵ�ַ��������ʵ�ڶ���
		System.out.println(s1.equals(s2));//�ַ�����equals�Ƚϣ��Ƚϵ��Ƕ��е�����
System.out.println("---------�߼�����----------");
		//������ & &&
		System.out.println((1>2)&&(2>1));
		System.out.println(true&&true);
		//������� | ||
		System.out.println(true||false);
		//�� ��
		System.out.println(!true);
		//��� ^
		System.out.println(true ^ false);
		System.out.println("---------λ����-----------");
		//��������� <<
		int i7 = 12;
		i7 = i7<<1;
		System.out.println(i7);//m������n��m=m*2^n.
		//λ���� ��������� >>   >>>(�޷������ƣ�����������λ��������)
		int i8 = 12;
		i8 = i8>>2;//���Ƶ����λ�Ƿ���λ��1Ϊ����0Ϊ��
		System.out.println(i8);
		//& �����㣨|| �����㣬! ������ͬ��
		int i9 = 10;
		int i5 = 7;
		i9 = i9&i5;
		System.out.println(i9);
		System.out.println("------��������--------");
		int e1 = 10;
		int e2 = 20;
		//Ҫ�󽻻�e1��e2����ֵ
		//����һ�����ӵ���������
		int c;
		c = e1;
		e1 = e2;
		e2 = c;
		System.out.println("e1="+e1+"---e2="+e2);
		//�������������ӱ���
		int d1 = 7;
		int d2 = 9;
		d1 = d1+d2;
		d2 = d1-d2;
		d1 = d1-d2;
		System.out.println("d1="+d1+"---d2="+d2);
		//�������������^  n^m^m=n
		int z1 = 36;
		int z2 = 8;
		z1 = z1^z2;
		z2 = z1^z2;//z1^z2^z2=z1
		z1 = z1^z2;
		System.out.println("z1="+z1+"---z2="+z2);
		System.out.println("-------��Ԫ�����(���������)---------");
		int score = 61;
		String result = (score>=60)?"����":"������";
		System.out.println(result);
	}
}