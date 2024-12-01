package LogicGates;

public class Nand {
    private NotGate notGate1;
    private NotGate notGate2;



    public Nand(boolean input1, boolean input2) {
        this.notGate1 = new NotGate(input1);
        this.notGate2 = new NotGate(input2);
    }

    public void setNotGate1input(boolean input) {
        this.notGate1.setInput(input);
    }

    public void setNotGate2input(boolean input) {
        this.notGate2.setInput(input);
    }

    public boolean getNotGate1input() {
        return this.notGate1.isInput();
    }

    public boolean getNotGate2input() {
        return this.notGate2.isInput();
    }

    public boolean output(){
        if(notGate1.isOutput() &&  notGate2.isOutput()){
            return false;
        }
        else{
            return true;
        }
    }

}
