import java.util.Arrays;
public class dome03
{
	public static void main(String[] args){
		System.out.println("---------------����---------------");
		//����һ������ʱֱ�Ӹ�ֵ
		int[] arr = {1,2,3,4};
		String[] arr2 = {"aa","bb","cc"};
		//��������������һһ����ֻ��д����һ��
		int[] intArr = new int[]{1,2,3};
		//���������ȶ��壬��ֵ��δ��ֵ����ָ�����鳤��
		int[] arr1 = new int[2];//��int[] û�и�����ֵ��Ĭ��Ԫ����0����int����������String��Ĭ��Ԫ����null
		arr1[0] = 6;
		arr1[1] = 3;
		System.out.println("---------����ȡֵ------------");
		System.out.println(arr2[1]);//ȡֵһ��Ҫ�ڷ�Χ��
		System.out.println(arr1[1]);
		System.out.println("----������������ǰ��������еĶ�ȡ����-----");
		//����һ��forѭ��
		for (int i = 0;i<arr2.length ;i++ )
		{
			System.out.println(arr2[i]);
		}
		System.out.println("-----------");
		//��������foreachѭ����������ֵ
		for (String temp:arr2 )
		{//����
			System.out.println(temp);
		}
		System.out.println("---------Arrays���ߣ���ֱ����������������ֵ-----------");
		System.out.println(Arrays.toString(arr2));
	}
}