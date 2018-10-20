package com.company;

import java.util.Scanner;
import org.apache.log4j.Logger;

public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Hobby hobby1 = new Hobby("football");
        hobby1.setHours(12);

        Hobby hobby2 = new Hobby(12);
        hobby2.setName("basketball");

        Hobby hobby3 = new Hobby("volleyball", 10);

        System.out.println(hobby1.toString());
        System.out.println(hobby2.toString());
        System.out.println(hobby3.toString());



        Scanner scanner = new Scanner(System.in);

        Hobby hobby4 = new Hobby();

        System.out.println("Enter char_param ");
        hobby4.setChar_param(scanner.next().charAt(0));
        logger.info("c = " + hobby4.getChar_param());

        System.out.println("Enter int_param ");
        hobby4.setInt_param(scanner.nextInt());
        logger.debug("i = " + hobby4.getInt_param());

        System.out.println("Enter byte_param ");
        hobby4.setByte_param(scanner.nextByte());
        logger.warn("b = " + hobby4.getByte_param());

        System.out.println("Enter short_param ");
        hobby4.setShort_param(scanner.nextShort());
        logger.error("s = " + hobby4.getShort_param());

        System.out.println("Enter long_param ");
        hobby4.setLong_param(scanner.nextLong());
        logger.error("l = " + hobby4.getLong_param());

        System.out.println("Enter float_param ");
        hobby4.setFloat_param(scanner.nextFloat());
        logger.error("f = " + hobby4.getFloat_param());

        System.out.println("Enter double_param ");
        hobby4.setDouble_param(scanner.nextDouble());
        logger.error("d = " + hobby4.getDouble_param());

        System.out.println("Enter boolean_param ");
        hobby4.setBoolean_param(scanner.hasNextBoolean());
        logger.error("b1 = " + hobby4.isBoolean_param());
    }
}