package Шаблоны;

public class Accumulator<AccType> {
    private AccType acc;
    
    public Accumulator(AccType a){
        this.acc = a;
    }
    
    public AccType getAcc(){
        return this.acc;
    }
    
    public void add(AccType a){
        if( a instanceof String)
            acc = (AccType)((String)acc + (String)a);
        if( a instanceof Integer)
            acc = (AccType)((Integer)((Integer)acc + (Integer)a));
    }
}
