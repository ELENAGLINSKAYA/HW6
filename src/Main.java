public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");{
            for ( int i = 1; i <10; i ++){
                System.out.println (i);
                for (int n = 10; n >1;n-- ){
                    System.out.println(n);
                    for (int b = 0; b<17; b+=2){
                        System.out.println(b);
                        for (int a = 10; a>=-10; a--){
                            System.out.println(a);
                            for (int w = 1904; w<=2096; w=w+4){
                                System.out.println(w+"год является високосным");
                                for (int r = 7; r<=98;r=r+7){
                                    System.out.println(r);
                                    for (int t = 1; t<=512;t=t*2){
                                        System.out.println(t);
                                        int amout = 29000;
                                        int total = 0;
                                        for (int m = 0; m<12; m++){
                                            total = total+ total/100;
                                            total = total + amout;
                                            System.out.println("месяц" + m+ "итого"+total);
                                            int cash = 29000;
                                            int asset = 0;
                                            for (int k = 0; k<12; k++){
                                                asset = asset + cash;
                                                System.out.println("месяц" + k+ "итого"+total);
                                            }

                                        }

                                    }
                                }
                            }
                        }
                    }

                }}}}}
