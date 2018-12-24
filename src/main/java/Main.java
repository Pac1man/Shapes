
import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

       // Point x = new Point();
        //Point y = new Point();
        //Point z = new Point();
        //Point d = new Point();

        //Triangl tr1 = new Triangl(x, y ,z);



        Student[] arr = Student.createStudent();
        Student.find(arr);
        //Triangl[] arr = TrianglUtiles.createTriangle();
        //Quad[] arr1 = QuadUtiles.createQuad();

        //System.out.println(x +" "+ y);
        //System.out.println(z +" "+ d);
        //System.out.println("Distans " +  Point.distnans(x, y));
        //System.out.println("Distnas to start " + Point.distansToStart(x));
        //System.out.println("On one l1ne "+ Point.oneLine(x, y, z));

        //System.out.println("Triangles area " + Triangl.area(tr1));

        //System.out.println("Quad Area "+Quad.quadArea(x, y, z));
        //System.out.println("Quad per "+Quad.quadPer(x, y, z, d));

       // System.out.println("Quad type " + QuadUtiles.chekerQuad(x,y,z,d));

    }

}
