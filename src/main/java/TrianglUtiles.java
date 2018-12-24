import java.util.Scanner;

import static java.lang.Math.pow;

public class TrianglUtiles {


    public static Triangl.Triangles cheker(Triangl triangle){

        double p1 = Point.distnans(triangle.getX(), triangle.getY());
        double p2 = Point.distnans(triangle.getY(), triangle.getZ());
        double p3 = Point.distnans(triangle.getZ(), triangle.getX());

        if (pow(p3,2) == (pow(p1,2)+ pow(p2,2)))
            return Triangl.Triangles.rectangular;
        if (p1 == p2 && p1 == p3 && p2 == p3 && p3 == p2)
            return Triangl.Triangles.equilateral;
        if ((p2 == p3) && p1 != p2 || p1 == p3 && p2 != p1 )
            return Triangl.Triangles.isosceles;
        else
            return Triangl.Triangles.arbitrary;

    }

    static Triangl[] createTriangle(){
        Scanner scan = new Scanner(System.in);

        int arbitrary = 0;
        int isosceles = 0;
        int equilateral = 0;
        int rectangular = 0;

        System.out.println("ВВедите количество треугольников");
        int a = scan.nextInt();
        Triangl[] arr = new Triangl[a];
        for (int i = 0; i < a; i++){
            arr[i] = new Triangl(new Point(), new Point(), new Point());
            System.out.println(arr[i].toString());
            System.out.println(cheker(arr[i]));

            double a1 = Triangl.area(arr[i]);
            double b = 0;
            double c = 0;
            System.out.println(a1);

            if (b > a1)
                c = b;
                b = a1;


            switch (TrianglUtiles.cheker(arr[i])){
                case arbitrary:
                    arbitrary++;
                    break;
                case isosceles:
                    isosceles++;
                    break;
                case equilateral:
                    equilateral++;
                    break;
                case rectangular:
                    rectangular++;
                    break;
            }



            System.out.println("Arbitrary " + arbitrary);
            System.out.println("Isosoeles " + isosceles);
            System.out.println("Equilateral " + equilateral);
            System.out.println("Rectangular " + rectangular);
            System.out.println("The biggest area " + b);
        }
        return arr;
    }



}
