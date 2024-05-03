package exception;

public class ExceptionTest4 {
   public static void main(String[] args) {
      try {
         System.out.println("a() 호출 전");
         a();
         System.out.println("a() 호출 후");
      } catch (ArrayIndexOutOfBoundsException e) {
         e.printStackTrace();
      } catch (Exception e){
         System.out.println("메인 메서드의 catch 블럭");
         e.printStackTrace();
      } finally {
         System.out.println("메인 메서드의 finally 블럭");
      }
      System.out.println("수행완료");
   }

   public static void a() {
      try {
         System.out.println("b() 호출 전");
         b();
         System.out.println("b() 호출 후");
      } catch (ClassCastException e) {
         e.printStackTrace();
         System.out.println("a메서드의 catch 블럭");
      } finally {
         System.out.println("a메서드의 finally 블럭");
      }
   }

   public static void b() {
      try {
         System.out.println("c() 호출 전");
         int x = 1;
         int y = 0;
         int z;
         z = x / y;
         System.out.println(z);
         c();
         System.out.println("c() 호출 후");
      } catch (NumberFormatException e) {
         e.printStackTrace();

      } finally {
         System.out.println("b메서드의 finally 블럭");
      }
   }

   public static void c() {
      try {
         System.out.println("d() 호출 전");
         d();
         System.out.println("d() 호출 후");
      } catch (ArithmeticException e) {
         e.printStackTrace();
      } finally {
         System.out.println("c 블럭");
      }
   }

   public static void d() {
      try {
         System.out.println("나누기 전");
         int x = 1;
         int y = 1;
         System.out.println(x / y);
      } catch (ArithmeticException e) {
         e.printStackTrace();
      } finally {
         System.out.println("d 블럭");
      }
   }
}