package master.logical.programs;

public class P20_ObjectReferenceCheck {
    // This example is understandig purpose .
    public static void main(String[] args) {
        int result = 0;
//        ObjComp oc = new ObjComp();
//        Object o = oc;

//        if (o == oc)
            result = 1; // true
//        if (o != oc)
            result = result + 10; // false 1
//        if (o.equals(oc))
            result = result + 100;  // 101
//        if (oc.equals(o))
            result = result + 1000; // 1000 + 101 = 1101

        System.out.println("result = " + result);

    }

    // Ans - 1101
}
