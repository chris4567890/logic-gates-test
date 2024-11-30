package LogicGates;

public class NotGate {
    public boolean isInput() {
        return input;
    }

    public void setInput(boolean input) {
        this.input = input;
    }

    private boolean input;
    public NotGate(boolean input) {
        this.input = input;
    }

    public boolean isOutput() {
        return !input;
    }

}
