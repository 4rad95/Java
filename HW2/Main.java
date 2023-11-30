public class Main {
    public static void main(String[] args)
    {
        {
            char ch ='G';
            Character ch1 = new Character('G');

            int i = 89;
            Integer i1 = new Integer(89);

            byte b = 4;
            Byte b1 = new Byte((byte)4);

            short sh =56;
            Short sh1 = new Short((short)56);

            float f = 4.7333436f;
            Float f1 = new Float( 4.7333436f);

            double d = 4.355453532;
            Double d1 = new Double(4.355453532);

            long l = 12121;
            Long l1 = new Long(12121);
            System.out.println("---------------------------Первая часть------------------------------------------------------------");
            System.out.println("Вывод локальных переменых");
            System.out.println("Character :"+ch);
            System.out.println("Integer :"+i);
            System.out.println("Byte :"+b);
            System.out.println("Short :"+sh);
            System.out.println("Float :"+f);
            System.out.println("Double :"+d);
            System.out.println("Long :"+l);
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("Вывод переменых - оберток");
            System.out.println("Character :"+ch1);
            System.out.println("Integer :"+i1);
            System.out.println("Byte :"+b1);
            System.out.println("Short :"+sh1);
            System.out.println("Float :"+f1);
            System.out.println("Double :"+d1);
            System.out.println("Long :"+l1);
            System.out.println("---------------------------------------------------------------------------------------------------");
        }
        {
            System.out.println("---------------------Вторая часть--------------------------------------------------------------------");
            int num = 345;
            int sot,des,edn;
            sot = num/100;
            des =(num-(sot*100))/10;
            edn = num-(sot*100)-des*10;
            System.out.println(num+" = " + sot +"*100 + " +des +"*10 + "+edn);
            System.out.println("---------------------------------------------------------------------------------------------------");
        }
    }
}