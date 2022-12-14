public class Main {
    public static void main(String[] args) {
        /*int [] arr = {30, 40, 10, 5, 34, 29, 8, 19};
        Util.sort(arr);

        for(int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();*/

        Emp [] emps = new Emp[5];
        emps[0] = new Emp(303, "DD", 3400);
        emps[1] = new Emp(123, "FF", 4290);
        emps[2] = new Emp(421, "AA", 560);
        emps[3] = new Emp(55, "BB", 8450);
        emps[4] = new Emp(240, "CC", 6900);

        //Util.sort(emps, new EmpComparator());
        Util.sort(emps);
        for(Emp emp : emps) {
            System.out.println(emp);
        }

        System.out.println();

        Util.sort(emps, new EmpComparatorBySal());
        for(Emp emp : emps) {
            System.out.println(emp);
        }

        System.out.println();


        Message [] messages = new Message[5];
        messages[0] = new Message(304, "Hello");
        messages[1] = new Message(102, "Are you There?");
        messages[2] = new Message(401, "Java");
        messages[3] = new Message(68, "C++ is better");
        messages[4] = new Message(202, "Kotlin is modern!");

        //Util.sort(messages, new MessageComparator());

        Util.sort(messages);

        for(Message message : messages) {
            System.out.println(message);
        }


        System.out.println();
    }
}
