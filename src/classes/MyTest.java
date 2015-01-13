package classes;

public class MyTest {
    
    public String outerField = "Test class";
    
    public void show(){
        System.out.println(this.outerField);
        class Local{
            
            public String localField = "Local class";
            
            public Local(){
                System.out.println(this.localField+"and"+outerField);
            }
        }
        Local l = new Local();
    }
    
    public class MyInner{
        
        public String innerFild = "Inner class";
        
        public void innerShow(){
            System.out.println(this.innerFild);
        }
    }
    
    public static class MyNested{
        public String nestedField = "Nested class";
        
        public void nestedShow(){
            System.out.println(this.nestedField);
        }
    }
}
