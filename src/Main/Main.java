package Main;

import classes.MyTest;
import abstractClasses.Base;
public class Main {
    public static void main(String[] args) {
        MyTest mt = new MyTest();        
        mt.show();
        
        MyTest.MyInner in = mt.new MyInner();
        
        in.innerShow();
        
        MyTest.MyNested nes = new MyTest.MyNested();
        
        nes.nestedShow();
        System.out.println("******************************************");
        Base b = new Base();
        b.show();
        
        Object o1 = new Object(){
            
            public String anonimusField = "Anonimus class";
            
            public void show(){
                System.out.println(this.anonimusField);
            }
        };               
    }
}
