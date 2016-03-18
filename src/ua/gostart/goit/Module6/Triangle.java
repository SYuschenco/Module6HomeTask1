package ua.gostart.goit.Module6;

public class Triangle {
    // fields of class Ttringle
    int[] triangleSidesNames;
    int triangleSidesSizes1;
    int triangleSidesSizes2;
    int triangleSidesSizes3;
    int triangleSquare;

    // method for setTriangleSideSizes



    Triangle() {

        Input a= new Input();
        this.triangleSidesSizes1 = a.inputJ();
        this.triangleSidesSizes2 = a.inputJ();
        this.triangleSidesSizes3 = a.inputJ();
        triangleSquare();

    }


     double triangleSquare() {

                //Формула Герона http://ru.onlinemschool.com/math/formula/area/
            //void triangleSquare(){

            //Triangle t = new Triangle();
            double p = (triangleSidesSizes1 + triangleSidesSizes2 + triangleSidesSizes3) / 2;
            double triangleSquare = Math.sqrt(p * (p - triangleSidesSizes1) * (p - triangleSidesSizes2)
                    * (p - triangleSidesSizes2));
            System.out.println("triangleSquare="+triangleSquare);
     return triangleSquare;

    }
}
