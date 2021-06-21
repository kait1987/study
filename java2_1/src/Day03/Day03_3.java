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
		
		
		// Runnable : 스레드 인터페이스
		Runnable runnable = () -> {
			for( int i = 0; i<10; i++) {
				System.out.println(i );
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		
		// Thread : 람다식 [run 메소드를 람다식으로 정의]
		Thread thread2 = new Thread( () -> {
			for( int i = 0; i<10; i++) {System.out.println(i); }
		});
		thread2.start();
		
		// Consumer :함수적 인터페이스 : 인수o반환x
		Consumer<String> consumer = 인수 -> System.out.println(인수);
		consumer.accept("java");
		
		BiConsumer<String, String> biConsumer = (a,u) -> System.out.println(a+u );
		biConsumer.accept("java", "8");
		
		DoubleConsumer doubleConsumer = a -> System.out.println(a);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (a , i) -> System.out.println(a+i );
		objIntConsumer.accept("java", 8);
		
		// IntSupplier : 함수적 인터페이스 : 인수x반환o
		
		IntSupplier intSupplier = () -> {
			int 랜덤 = (int)(Math.random() * 6) + 1;
			return 랜덤;
		};
		System.out.println( "1~6 랜덤: " + intSupplier.getAsInt() );
		
		// Function : 함수적 인테페이스 : 인수o반환o
		
		학생목록.add(new Student("유재석", 90, 80));
		학생목록.add(new Student("강호동", 100, 70));

		
		System.out.println("[학생이름]");
		학생명단( t -> t.getName() );
		System.out.println("[학생 수학 점수]");
		점수명단( t -> t.getMath() );
		System.out.println("[학생 영어 점수]");
		명단 ( t -> t.getEnglish() );		
		
	}// main 끝
	private static List<Student> 학생목록 = new ArrayList<>();
	public static void 학생명단(Function<Student, String> Funtion) {
											// 해당클래스, 반환타입
		for( Student student : 학생목록) {
			System.out.println(Funtion.apply(student) + " ");
		}
		System.out.println();
	}
	public static void 점수명단(Function<Student, Integer> Function) {
		// 해당클래스, 반환타입
		for( Student student : 학생목록) {
			System.out.println(Function.apply(student) + " ");
	}
		System.out.println();
	}
	public static void 명단(ToIntFunction<Student> Funtion) {
		// 해당클래스, 반환타입
		for( Student student : 학생목록) {
			System.out.println(Funtion.applyAsInt(student) + " ");
	}
		System.out.println();
	}	
	
	
	
	
	
}
