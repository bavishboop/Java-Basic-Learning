public class Variables {
    public static void main(String[] args) {
     int num = 3;   //4 bytes = 32 bits
     int num4 = 4;  //4 bytes = 32 bits
     int number = 6; //4 bytes = 32 bits
     int num5 = num + num4 + number; //4 bytes = 32 bits
     String name = "hello"; // variable length, but typically 16 bits per character
     float num2 = 3.5f; //4 bytes = 32 bits
     char letter = 'r'; //2 bytes = 16 bits
     boolean isTrue = true;
     long ar = 1245; //8 bytes = 64 bits
     short sr = 2;//2 bytes = 16 bits
     double b = 3.5; //8bytes = 64 bits
     float f = 3.56f; //4 bytes = 32 bits


            System.out.println(num);
            System.out.println(num4);
            System.out.println(number);
            System.out.println(num5);
            System.out.println(name);
            System.out.println(num2);
            System.out.println(letter);
            System.out.println(isTrue);
            System.out.println(ar);
            System.out.println(sr);
            System.out.println(b);
            System.out.println(f);
}
}
