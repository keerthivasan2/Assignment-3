class College
 {
   private int id;
   private String clgename;
   public College(int r, String n) {
      id = r;
      clgename = n;
   }
   public void display() {
      System.out.println("Your id no is: " + id);
      System.out.println("Your college name is: " + clgename);
   }
}
class Demo {
   public static void main(String[] args) {
      College s = new College(4056, "Karpaga vinayaga college");
      s.display();
   }
}