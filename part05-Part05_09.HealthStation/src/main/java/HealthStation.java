
public class HealthStation {
    private int numberOfWeighings;


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.numberOfWeighings++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(this.weigh(person) + 1);
    }
    
    public int weighings(){
        return this.numberOfWeighings;
    }
    public boolean adult(Person person){
        if (person.isOfLegalAge()){
        return true;
                }
        return false;
    }

}
