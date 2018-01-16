package com.anbo.static_method_interface;

/**
 * Created by anbo06131 on 9/27/2017.
 */
@FunctionalInterface
public interface CheckNull {
   int NOT_NULL = 7;

  static int checkNull(Object firstObj, Object secondObject) {
        if(firstObj == null && secondObject != null) {
            return 1;
        }
        if(firstObj != null && secondObject == null) {
           return -1;
        }
        if(firstObj == null && secondObject == null) {
           return 0;
        }
        return NOT_NULL;
   }

   void add();

    boolean equals(Object obj);
}
