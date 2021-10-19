package com.timeClass;

public class Time2Test {

	public static void main(String[] args) {
		Time2 t0 = new Time2();				// Set to 00:00:00 
        Time2 t1 = new Time2(11);			// Set to 11:00:00
        Time2 t2 = new Time2(12, 59);		// Set to 12:59:00 
        Time2 t3 = new Time2(23, 40, 55); 	// Set to 23:40:55
        Time2 t4 = new Time2(t3); 			// Copy t3
        Time2 t5 = new Time2(23, 59, 59); 	// Set to 23:59:59 
        
        // Print in Universal Format
        
        // tick test
        System.out.printf("Before tick(): %s\n", t0.toUniversalString());
        t0.tick();
        System.out.printf("After tick(): %s\n\n", t0.toUniversalString());
        
        System.out.printf("Before tick(): %s\n", t4.toUniversalString());
        t4.tick();
        System.out.printf("After tick(): %s\n\n", t4.toUniversalString());
        
        // incrementMinute test
        System.out.printf("Before incrementMinute(): %s\n", t1.toUniversalString());
        t1.incrementMinute();
        System.out.printf("After incrementMinute(): %s\n\n", t1.toUniversalString());
        
        System.out.printf("Before incrementMinute(): %s\n", t2.toUniversalString());
        t2.incrementMinute();
        System.out.printf("After incrementMinute(): %s\n\n", t2.toUniversalString());
        
        // incrementHour test
        System.out.printf("Before incrementHour(): %s\n", t3.toUniversalString());
        t3.incrementHour();
        System.out.printf("After incrementHour(): %s\n\n", t3.toUniversalString());
        
        
        // Print in Standard Format
        System.out.println("Standard Format:\n");
        System.out.println(t0);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        
        
        // before
        System.out.println("\nBefore: ");
        System.out.println(t5);
        
        // after
        t5.tick();
        System.out.println("After: ");
        System.out.println(t5);
	}

}
