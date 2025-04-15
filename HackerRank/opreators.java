package HackerRank;

public class opreators {
    public static void main(String[] args) {
        /*
        Oprators- symbol that tell compiler to perform some opration

        binary oprators - perform opration between two operands

        * Arithmatic oprators

        Binary - which work btn two oprands

        + -  Addition
        - -  Substraction
        * - multiplication
        / -  divadation
        % -  modulo (calculate reminder)

        Unary - which wrok on one oprand

        ++ - Increment oprator  (Traditional way to write +1)
        -- - Decrament decrment oprator (Traditional way to write -1)

         */

        int a =10;
        int b=5;
        System.out.println("Arithmatic opreation ");
        System.out.println(a+b); //Addition
        System.out.println(a-b);  //Substraction
        System.out.println(a*b);//multiplication
        System.out.println(a/b); //divadation
        System.out.println(a%b); //modulo

        // pre Increment
        //++a - chnage value then use value
        System.out.println("Pre Increment");
        b = ++a;
        System.out.println(a);
        System.out.println(b);

        // post Increment
        // use value then change value
        System.out.println("Post Increment");
        b = a++;
        System.out.println(a);
        System.out.println(b);

        // pre Decremant
        // value change the use value
        System.out.println("Post Decrement");
        b = --a;
        System.out.println(a);
        System.out.println(b);

        // post Decrement
        // use value then change value
        System.out.println("Post Decrement");
        b = a++;
        System.out.println(a);
        System.out.println(b);


        /*
        * Relational Oprator
        == - Equal to
        != - Not Equal to
        >  - Greter than
        <  -  Less than
        => - Greter than Equal to
        <= -  Less than Equal to


        * Logical oprator
        && - Logical AND oprator
         Use between two cases when two cases are true then output is true

          || - Logical OR oprator
         Use between two cases at lest one case true the output will be true

          ! - Logical NOT
          use to reverse output

         */

        /*
             *  Binary oprator
             & - Binary AND  (all condition will true)

             | - Binary OR  (At lest one conditon is true)

             ^ - Binary XOR (similer value false different value are true

             ~ - Binary ones Complement (Negative to postive, postive to negative )

             << - Binary left shift 0101 << 1
                                    1010
            >> - Binary Right shift 0101 >> 1
                                    0010


            * Assignement oprators
            = - assign one oprend value to another operend
            += - assign one oprend value + __ in another oprend
            *= - assign one oprend value * __ in another oprend
            -= - assign one oprend value - __ in another oprend
            /= assign one oprend value  /__  in another oprend

         */

    }
}
