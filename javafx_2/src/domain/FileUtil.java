package domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class FileUtil {
	
	// ���Ͽ��� ������ ��������
	public static ArrayList<Member> readfile( File file ){
											// 1. ������ �μ��� �ޱ� 
		try {
			FileReader fileReader = new FileReader(file);
						// 2. �ش� ������  fileReader ��ü�� �ֱ� 
			BufferedReader bufferedReader = new BufferedReader(fileReader);
						// 3. ���� Ŭ������  filfeReader ��ü�� �ֱ� 
			ArrayList<Member> members = new ArrayList<>();
			String line;
			while(  ( line = bufferedReader.readLine() ) != null ) {
						// 4. ���ۿ��� ���پ� �о���� [ readLine() ] 	
				String[] b = line.split(",");
						// 5. �о�� ���ٿ��� , �� �����ϱ� 
				Member temp = new Member(b[0], b[1], b[2], b[3] );
						// 6. ���ص� �����ͷ� ȸ����ü �����
				members.add(temp);
						// 7. ȸ����ü ����Ʈ ��� 
			}
			bufferedReader.close();
			fileReader.close();
			
			return members; // 8. ���� ���� ����Ʈ�� ��ȯ
			
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;  // ���� �߻��� null ��ȯ 

		
	}
	//				
	

}
