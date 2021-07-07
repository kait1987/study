package Day03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.ObjIntConsumer;
import java.util.function.ToIntFunction;

public class Day03_3 {
	
	public static void main(String[] args) {
		
		
		// Runnable : ������ �������̽�
		Runnable runnable = () -> {
			for( int i = 0; i<10; i++) {
				System.out.println(i );
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		// Thread : ���ٽ� [run �޼ҵ带 ���ٽ����� ����]
		Thread thread2 = new Thread( () -> {
			for( int i = 0; i<10; i++) {System.out.println(i); }
		});
		thread2.start();
		
		// Consumer :�Լ��� �������̽� : �μ�o��ȯx
		Consumer<String> consumer = �μ� -> System.out.println(�μ�);
		consumer.accept("java");
		
		BiConsumer<String, String> biConsumer = (a,u) -> System.out.println(a+u );
		biConsumer.accept("java", "8");
		
		DoubleConsumer doubleConsumer = a -> System.out.println(a);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (a , i) -> System.out.println(a+i );
		objIntConsumer.accept("java", 8);
		
		// IntSupplier : �Լ��� �������̽� : �μ�x��ȯo
		
		IntSupplier intSupplier = () -> {
			int ���� = (int)(Math.random() * 6) + 1;
			return ����;
		};
		System.out.println( "1~6 ����: " + intSupplier.getAsInt() );
		
		// Function : �Լ��� �������̽� : �μ�o��ȯo
		
		�л����.add(new Student("���缮", 90, 80));
		�л����.add(new Student("��ȣ��", 100, 70));

		
		System.out.println("[�л��̸�]");
		�л����( t -> t.getName() );
		System.out.println("[�л� ���� ����]");
		�������( t -> t.getMath() );
		System.out.println("[�л� ���� ����]");
		��� ( t -> t.getEnglish() );		
		
	}// main ��
	private static List<Student> �л���� = new ArrayList<>();
	public static void �л����(Function<Student, String> Funtion) {
											// �ش�Ŭ����, ��ȯŸ��
		for( Student student : �л����) {
			System.out.println(Funtion.apply(student) + " ");
		}
		System.out.println();
	}
	public static void �������(Function<Student, Integer> Function) {
		// �ش�Ŭ����, ��ȯŸ��
		for( Student student : �л����) {
			System.out.println(Function.apply(student) + " ");
	}
		System.out.println();
	}
	public static void ���(ToIntFunction<Student> Funtion) {
		// �ش�Ŭ����, ��ȯŸ��
		for( Student student : �л����) {
			System.out.println(Funtion.applyAsInt(student) + " ");
	}
		System.out.println();
	}	
	
	
	
	
	
}
