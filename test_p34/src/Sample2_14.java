import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//108360140
public class Sample2_14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�аݭn�b�ĴX���B�z�����j��O?(1~10)");
		BufferedReader br = 
			new BufferedReader (new InputStreamReader(System.in));
	String str =br.readLine();
	int res =Integer.parseInt(str);
	
	for (int i = 1 ; i <= 10 ;i++) {

		if (i==res)
			continue;
			System.out.println("��"+ i +"�����B�z�A");
		}
	}

}
