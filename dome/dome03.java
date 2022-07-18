import java.util.Arrays;
public class dome03
{
	public static void main(String[] args){
		System.out.println("---------------数组---------------");
		//方法一：定义时直接赋值
		int[] arr = {1,2,3,4};
		String[] arr2 = {"aa","bb","cc"};
		//方法二：跟方法一一样，只是写法不一样
		int[] intArr = new int[]{1,2,3};
		//方法三：先定义，后赋值，未赋值必须指定数组长度
		int[] arr1 = new int[2];//若int[] 没有给赋初值，默认元素是0；非int整数，比如String：默认元素是null
		arr1[0] = 6;
		arr1[1] = 3;
		System.out.println("---------数组取值------------");
		System.out.println(arr2[1]);//取值一定要在范围内
		System.out.println(arr1[1]);
		System.out.println("----数组遍历：就是把数组里有的都取出来-----");
		//方法一：for循环
		for (int i = 0;i<arr2.length ;i++ )
		{
			System.out.println(arr2[i]);
		}
		System.out.println("-----------");
		//方法二：foreach循环来遍历数值
		for (String temp:arr2 )
		{//迭代
			System.out.println(temp);
		}
		System.out.println("---------Arrays工具：可直接输出数组里的所有值-----------");
		System.out.println(Arrays.toString(arr2));
	}
}